import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Map;

public class ReaderThread extends Thread implements Serializable {

	private static final long serialVersionUID = 1L;
	private String currentProcess;
	private Map<String, Integer> processMap;
	private int vectorTime[];
	private ServerSocket serverSocket;
	private int port;

	public ReaderThread(String currentProcess, int portList[],
			Map<String, Integer> processMap, int vectorTime[],
			ServerSocket serverSocket, int port) {
		this.currentProcess = currentProcess;
		//this.portList = portList;
		this.processMap = processMap;
		this.vectorTime = vectorTime;
		this.serverSocket = serverSocket;
		this.port = port;
	}

	@Override
	public void run() {

		try {
			System.out.println("Process " + currentProcess
					+ " started on port " + port + " has been initiated");

			while (true) {
				Socket socket = serverSocket.accept();
				ObjectInputStream in = new ObjectInputStream(
						socket.getInputStream());

				synchronized (vectorTime) {
					String from = in.readObject().toString();
					String message = in.readObject().toString();
					System.out.println(from + " saying : " + message);
					int senderVectorTime[] = (int[]) in.readObject();

					System.out.println("Vector Clock of " + currentProcess
							+ " Before Receive/Process the message");
					VectorClockProcess.printVector(vectorTime);

					int tmpVectorTime[] = new int[3];
					int index = processMap.get(currentProcess);
					vectorTime[index] += 1;
					for (int i = 0; i < senderVectorTime.length; i++) {

						tmpVectorTime[i] = senderVectorTime[i];
						vectorTime[i] = Math.max(vectorTime[i], tmpVectorTime[i]);
					}
					System.out.println("Vector Clock of " + currentProcess
							+ " After Receive/Process the message");
					VectorClockProcess.printVector(vectorTime);
					in.close();
				}	
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				serverSocket.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}

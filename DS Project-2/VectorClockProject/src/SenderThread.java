import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.Socket;
import java.util.Map;
import java.util.Scanner;

public class SenderThread extends Thread implements Serializable {

	private static final long serialVersionUID = 1L;
	private String currentProcess;
	private int[] portList;
	private Map<String, Integer> processMap;
	private int vectorTime[];

	public SenderThread(String currentProcess, int portList[],
			Map<String, Integer> processMap, int vectorTime[]) {
		this.currentProcess = currentProcess;
		this.portList = portList;
		this.processMap = processMap;
		this.vectorTime = vectorTime;
	}

	@Override
	public void run() {
		int selfIndex = processMap.get(currentProcess);
		while (true) {
			try {
				Thread.sleep(4000);
				System.out.println("This is process " + currentProcess
						+ ", press Enter to send message");
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				br.readLine();
				System.out
						.println("Enter the process name to which you want to send message");
				String sendTo = br.readLine();
				System.out.println("Entered value : " + sendTo);
				int remoteServerPort = portList[processMap.get(sendTo)];
				System.out.println("Trying to connect to 127.0.0.1:"
						+ remoteServerPort);
				Socket socket = new Socket("127.0.0.1", remoteServerPort);

				System.out.print("Please type the message :");
				String msg = br.readLine();
				System.out.println("Vector Clock of " + currentProcess
						+ " Before sending the message");
				VectorClockProcess.printVector(vectorTime);

				vectorTime[selfIndex] += 1;

				ObjectOutputStream out = new ObjectOutputStream(
						socket.getOutputStream());
				out.writeObject(currentProcess);
				out.writeObject(msg);
				out.writeObject(vectorTime);
				out.flush();
				System.out.println("Vector Clock of " + currentProcess
						+ " After sending the message");
				VectorClockProcess.printVector(vectorTime);
			} catch (Exception e) {
				
				e.printStackTrace();
			}

		}

	}

}

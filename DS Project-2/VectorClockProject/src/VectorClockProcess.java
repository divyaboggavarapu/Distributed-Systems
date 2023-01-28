import java.io.IOException;
import java.net.BindException;
import java.net.ServerSocket;
import java.util.HashMap;
import java.util.Random;

public class VectorClockProcess {
	private static final long serialVersionUID = 1L;
	static String processList[] = { "p1", "p2", "p3" };
	static int portList[] = { 9670, 9671, 9672 };
	static int vectorTime[] = { 0, 0, 0 };
	static HashMap<String, Integer> processMap = new HashMap<String, Integer>();
	String type;
	static String currentProcess;
	static int port;
	static int selfIndex;

	public static void initializeMap() {

		processMap.put("p1", 0);
		processMap.put("p2", 1);
		processMap.put("p3", 2);

	}

	public static void main(String[] args) throws InterruptedException, IOException {
		initializeMap();
		ServerSocket serverSocket = null;
		while (true) {
			try {
				Random rand = new Random();
				int opt = rand.nextInt(3);
				selfIndex = opt;
				currentProcess = processList[opt];
				port = portList[opt];
				serverSocket = new ServerSocket(port);
				break;
			} catch (BindException e) {
				// TODO: handle exception
			}

		}
		
		ReaderThread readerThread = new ReaderThread(currentProcess, portList, processMap, vectorTime, serverSocket, port);
		readerThread.start();
		
		Thread.sleep(3000);
		
		SenderThread senderThread = new SenderThread(currentProcess, portList, processMap, vectorTime);
		senderThread.start();
		/*
		 * while (true) { }
		 */
	}

	public static void printVector(int[] vectorTime) {
		System.out.println("##################################");
		System.out.println(processList[0] + " : " + vectorTime[0]);
		System.out.println(processList[1] + " : " + vectorTime[1]);
		System.out.println(processList[2] + " : " + vectorTime[2]);
		System.out.println("##################################");
	}

}

package hust.soict.ictglobal.aims;

public class MemoryDaemon implements Runnable {

	long memoryUsed = 0;

	/**
	 *  
	 */
	public MemoryDaemon() {
		super();
	}

	public void run() {
		Runtime rt = Runtime.getRuntime();
		long used;

		while (true) {
			used = rt.totalMemory() - rt.freeMemory();
			if (used != memoryUsed) {
				System.out.println("\tMemory used = " + used);
				memoryUsed = used;
			}
		}
	}

}
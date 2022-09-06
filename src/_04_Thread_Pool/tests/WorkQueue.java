package _04_Thread_Pool.tests;

public class WorkQueue implements Runnable {
	private Thread threads[];
	private boolean isRunning = true;

	@Override
	public void run() {
		// TODO Auto-generated method stub
		int totalThreads = Runtime.getRuntime().availableProcessors() - 1;
		threads = new Thread[totalThreads];
		for (int i = 0; i < threads.length; i++) {
			threads[i] = new Thread(this);
			threads[i].start();
		}
		while (isRunning) {
			System.out.println("output from thread number " + Thread.currentThread().getId());
		}

	}

	public void shutdown() {
		isRunning = false;
	}

	public int getThreadCount() {
		return threads.length;
	}

}

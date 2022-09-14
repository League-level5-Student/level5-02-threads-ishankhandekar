package _04_Thread_Pool.tests;

public class threadPoolTester {
	public static void main(String[] args) {
		WorkQueue w = new WorkQueue();
		System.out.println("Total threads: " + w.getThreadCount());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		w.shutdown();
	}
}

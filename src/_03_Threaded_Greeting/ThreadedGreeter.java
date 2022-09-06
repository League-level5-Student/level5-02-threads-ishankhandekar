package _03_Threaded_Greeting;

public class ThreadedGreeter implements Runnable{
	int num;
	
	ThreadedGreeter(int num) {
		this.num = num;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		if (num > 50) {
			System.exit(0);
		}
		Thread t = new Thread(new ThreadedGreeter(num+1));
		try {
			t.join();
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println(num);
		t.start();
	}

}

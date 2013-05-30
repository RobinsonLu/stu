package thinking.in.java.test21;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class RandomSleepTest implements Runnable {

	private int i = 0;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ExecutorService exec = Executors.newCachedThreadPool();
		for(int i = 0; i < 10; i++) {
			exec.execute(new RandomSleepTest(Math.random()));
		}
		exec.shutdown();
	}

	@Override
	public void run() {
		try {
			System.out.println("Sleeping -- " + i);
			TimeUnit.MILLISECONDS.sleep(i);
			return ;
		} catch(InterruptedException e) {
			System.out.println("Interrupted");
		}
	}
	
	public RandomSleepTest(double d) {
		this.i = (int)( d * 10000);
	}

}
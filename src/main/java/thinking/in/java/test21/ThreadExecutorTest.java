package thinking.in.java.test21;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadExecutorTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		ExecutorService exec = Executors.newCachedThreadPool();
		ExecutorService exec = Executors.newFixedThreadPool(3);
//		ExecutorService exec = Executors.newSingleThreadExecutor();
//		ExecutorService exec = Executors.newSingleThreadScheduledExecutor();
		for(int i = 0; i < 10; i++) {
			exec.execute(new Running());
		}
		
		for(int i = 0; i < 10; i++) {
			exec.execute(new FibonacciRunnable(10));
		}
		exec.shutdown();
	}

}

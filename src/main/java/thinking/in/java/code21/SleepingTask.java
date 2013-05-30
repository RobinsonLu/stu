package thinking.in.java.code21;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class SleepingTask extends LiftOff {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ExecutorService exec = Executors.newCachedThreadPool();
		for (int i = 0; i < 5; i++) {
			exec.execute(new SleepingTask());
		}
		exec.shutdown();
	}

	public void run(){
		try{
			while(countDown-- > 0){
				System.out.print(status());
			}
			TimeUnit.MILLISECONDS.sleep(1000);
		}catch(InterruptedException e){
			System.out.println("Interrupted");
		}
	}
}

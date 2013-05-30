package thinking.in.java.code21;

import java.util.concurrent.TimeUnit;

public class SimpleDaemons implements Runnable {

	public void run() {
		try{
			while(true){
				TimeUnit.MILLISECONDS.sleep(1000);
				System.out.println(Thread.currentThread() + " " + this);
			}
		}catch(InterruptedException e){
			System.out.println("sleep() interrupted");
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			Thread daemons = new Thread(new SimpleDaemons());
			daemons.setDaemon(true);
			daemons.start();
		}
		System.out.println("All daemons started");
		try {
			TimeUnit.MILLISECONDS.sleep(1000);
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
	}

}

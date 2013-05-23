package thinking.in.java.code21;

import java.util.concurrent.TimeUnit;

public class ADaemon implements Runnable {

	public void run() {
		// TODO Auto-generated method stub
		try{
			System.out.println("starting ADaemon");
			TimeUnit.SECONDS.sleep(1);
		}catch (InterruptedException e) {
			// TODO: handle exception
			System.out.println("Exiting via InterruptedException");
		}finally{
			System.out.println("This should always run?");
		}
	}

}

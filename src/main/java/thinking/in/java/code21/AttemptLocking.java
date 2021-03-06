package thinking.in.java.code21;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class AttemptLocking {

	private ReentrantLock lock = new ReentrantLock();
	
	public void untimed(){
		boolean captured = lock.tryLock();
		try{
			System.out.println("tryLock(): " + captured);
		}finally{
			if(captured){
				lock.unlock();
			}
		}
	}
	
	public void timed(){
		boolean captured = false;
		try{
			captured = lock.tryLock(2, TimeUnit.SECONDS);
		}catch(InterruptedException e){
			throw new RuntimeException();
		}
		
		try{
			System.out.println("tryLock(2, TimeUnit.SECONDS): " + captured);
		}finally{
			if(captured){
				lock.unlock();
			}
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final AttemptLocking al = new AttemptLocking();
		al.untimed();
		al.timed();
		
		new Thread(){
			{ setDaemon(true); }
			public void run() {
				al.lock.lock();
			};
		}.start();
		Thread.yield();
		al.untimed();
		al.timed();
	}

}

package thinking.in.java.code21;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class WaxOMatic2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		CarNew carN = new CarNew();
		ExecutorService exec = Executors.newCachedThreadPool();
		exec.execute(new WaxOffNew(carN));
		exec.execute(new WaxOnNew(carN));
		TimeUnit.SECONDS.sleep(5);
		exec.shutdown();
	}

}

class CarNew{
	private Lock lock = new ReentrantLock();
	private Condition condition = lock.newCondition();
	private boolean waxOn = false;
	public void waxed(){
		lock.lock();
		try{
			waxOn = true;
			condition.signalAll();
		}finally{
			lock.unlock();
		}
	}
	public void buffed(){
		lock.lock();
		try{
			waxOn = false;
			condition.signalAll();
		}finally{
			lock.unlock();
		}
	}
	public void waitForWaxing() throws InterruptedException{
		lock.lock();
		try{
			while(waxOn == false){
				condition.await();
			}
		}finally{
			lock.unlock();
		}
	}
	public void waitForBuffing() throws InterruptedException{
		lock.lock();
		try{
			while(waxOn == true){
				condition.await();
			}
		}finally{
			lock.unlock();
		}
	}
}

class WaxOnNew implements Runnable{
	private CarNew carN;
	public WaxOnNew(CarNew c){ carN = c; }
	public void run() {
		// TODO Auto-generated method stub
		try{
			while(!Thread.interrupted()){
				System.out.println("Wax On!");
				TimeUnit.MILLISECONDS.sleep(200);
				carN.waxed();
				carN.waitForBuffing();
			}
		}catch(InterruptedException e){
			System.out.println("Exiting via interrupt");
		}
		System.out.println("Ending Wax On task");
	}
}

class WaxOffNew implements Runnable{
	private CarNew carN;
	public WaxOffNew(CarNew c){ carN = c; }
	public void run() {
		// TODO Auto-generated method stub
		try{
			while(!Thread.interrupted()){
				carN.waitForWaxing();
				System.out.println("Wax Off");
				TimeUnit.MILLISECONDS.sleep(200);
				carN.buffed();
			}
		}catch(InterruptedException e){
			System.out.println("Exiting via interrupt");
		}
		System.out.println("Ending Wax Off task");
	}
}
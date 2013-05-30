package thinking.in.java.code21;

import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class CountDownLatchDemo {

	static final int SIZE = 100;
	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		ExecutorService exec = Executors.newCachedThreadPool();
		CountDownLatch latch = new CountDownLatch(SIZE);
		for (int i = 0; i < 10; i++) {
			exec.execute(new WaitingTask(latch));
		}
		for (int i = 0; i < SIZE; i++) {
			exec.execute(new TaskPortion(latch));
		}
		System.out.println("Launched all tasks");
		exec.shutdown();
	}

}

class TaskPortion implements Runnable{
	private static int counter = 0;
	private final int id = counter++;
	private static Random rand = new Random(47);
	private final CountDownLatch latch;
	TaskPortion(CountDownLatch latch){
		this.latch = latch;
	}
	public void run() {
		// TODO Auto-generated method stub
		try{
			doWork();
			latch.countDown();
		}catch(InterruptedException ex){
			
		}
	}
	public void doWork() throws InterruptedException{
		TimeUnit.MILLISECONDS.sleep(rand.nextInt(200));
		System.out.println(this + "completed");
	}
	public String toString(){
		return String.format("%1$-3d", id);
	}
}

class WaitingTask implements Runnable{
	private static int counter = 0;
	private final int id = counter++;
	private final CountDownLatch latch;
	WaitingTask(CountDownLatch latch){
		this.latch = latch;
	}
	public void run() {
		// TODO Auto-generated method stub
		try{
			latch.await();
			System.out.println("Latch barrier passed for " + this);
		}catch(InterruptedException ex){
			System.out.println(this + " interrupted");
		}
	}
	public String toString(){
		return String.format("WaitingTask %1$-3d", id);
	}
}
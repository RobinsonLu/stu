package thinking.in.java.code21;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import static java.util.concurrent.TimeUnit.*;

public class DelayQueueDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random(47);
		ExecutorService exec = Executors.newCachedThreadPool();
		DelayQueue<DelayedTask> queue = new DelayQueue<DelayedTask>();
		for (int i = 0; i < 20; i++) {
			queue.put(new DelayedTask(rand.nextInt(5000)));
		}
		queue.add(new DelayedTask.EndSentinel(5000, exec));
		exec.execute(new DelayedTaskConsumer(queue));
	}

}

class DelayedTask implements Runnable, Delayed{
	private static int counter = 0;
	private final int id = counter++;
	private final int delta;
	private final long trigger;
	protected static List<DelayedTask> sequence = new ArrayList<DelayedTask>();
	public DelayedTask(int delayInMilliseconds){
		delta = delayInMilliseconds;
		trigger = System.nanoTime() + NANOSECONDS.convert(delta, MILLISECONDS);
		sequence.add(this);
	}
	public long getDelay(TimeUnit unit){
		return unit.convert(trigger - System.nanoTime(), NANOSECONDS);
	}
	public int compareTo(Delayed arg){
		DelayedTask that = (DelayedTask)arg;
		if(trigger < that.trigger) return -1;
		if(trigger > that.trigger) return 1;
		return 0;
	}
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(this + " ");
	}
	public String toString(){
		return String.format("[%1$-4d]", delta);
	}
	public String summary(){
		return "(" + id + " : " + delta + ")";
	}
	public static class EndSentinel extends DelayedTask{
		private ExecutorService exec;
		public EndSentinel(int delay, ExecutorService e){
			super(delay);
			exec = e;
		}
		@Override
		public void run() {
			// TODO Auto-generated method stub
			for (DelayedTask pt : sequence) {
				System.out.println(pt.summary() + " ");
			}
			System.out.println();
			System.out.println(this + " Calling shutdownNow()");
			exec.shutdownNow();
		}
	}
}

class DelayedTaskConsumer implements Runnable{
	private DelayQueue<DelayedTask> q;
	public DelayedTaskConsumer(DelayQueue<DelayedTask> q){
		this.q = q;
	}
	public void run() {
		// TODO Auto-generated method stub
		try{
			while(!Thread.interrupted()){
				q.take().run();
			}
		}catch(InterruptedException e){
			
		}
		System.out.println("Finished DelayedTaskConsumer");
	}
}
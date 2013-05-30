package thinking.in.java.code21;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SimpleMicroBenchmark {

	static long test(Incrementable incr){
		long start = System.nanoTime();
		for (int i = 0; i < 1000000L; i++) {
			incr.increment();
		}
		return System.nanoTime() - start;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		long synchTime = test(new SynchronizingTest());
		long lockTime = test(new LockingTest());
		System.out.printf("synchronized: %1$10d\n", synchTime);
		System.out.printf("Lock:         %1$10d\n", lockTime);
		System.out.printf("Lock/synchronized = %1$.3f", (double)lockTime/(double)synchTime);
	}

}

abstract class Incrementable{
	protected long counter = 0;
	public abstract void increment();
}

class SynchronizingTest extends Incrementable{
	public synchronized void increment(){ ++counter; }
}

class LockingTest extends Incrementable{
	private Lock lock = new ReentrantLock();
	public void increment(){
		lock.lock();
		try{
			++counter;
		}finally{
			lock.unlock();
		}
	}
}
package thinking.in.java.code21;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MutexEvenGenerator extends IntGenerator {

	private int currentEvenValue = 0;
	private Lock lock = new ReentrantLock();
	
	@Override
	public int next() {
		// TODO Auto-generated method stub
		lock.lock();
		try{
			++currentEvenValue;
			Thread.yield();
			++currentEvenValue;
			return currentEvenValue;
		}finally{
			lock.unlock();
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EvenChecker.test(new MutexEvenGenerator());
	}

}

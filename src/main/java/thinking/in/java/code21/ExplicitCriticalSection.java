package thinking.in.java.code21;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ExplicitCriticalSection {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PairManager pman1 = new ExpliciPairManager1();
		PairManager pman2 = new ExpliciPairManager2();
		CriticalSection.testApproaches(pman1, pman2);
	}

}

class ExpliciPairManager1 extends PairManager{
	private Lock lock = new ReentrantLock();
	public synchronized void increment(){
		lock.lock();
		try{
			p.incrementX();
			p.incrementY();
			store(getPair());
		}finally{
			lock.unlock();
		}
	}
}

class ExpliciPairManager2 extends PairManager{
	private Lock lock = new ReentrantLock();
	public void increment(){
		Pair temp;
		lock.lock();
		try{
			p.incrementX();
			p.incrementY();
			temp = getPair();
		}finally{
			lock.unlock();
		}
		store(temp);
	}
}
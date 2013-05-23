package thinking.in.java.code21;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class AtomicityTest implements Runnable {

	private int i = 0;
	public int getValue(){ return i; }
	private synchronized void evenIncrement(){
		i++;
		i++;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService exec = Executors.newCachedThreadPool();
		AtomicityTest at = new AtomicityTest();
		exec.execute(at);
		while(true){
			int val = at.getValue();
			if(val % 2 != 0){
				System.out.println(val);
				System.exit(0);
			}
		}
	}

	public void run() {
		// TODO Auto-generated method stub
		while(true){
			evenIncrement();
		}
	}

}

package thinking.in.java.test21;

import thinking.in.java.code15.Fibonacci;

public class FibonacciRunnableTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for(int i = 0; i < 10; i++) {
//			FibonacciRunnable f = new FibonacciRunnable(i);
//			f.run();
			Thread t = new Thread(new FibonacciRunnable(i));
			t.start();
		}
	}

}

class FibonacciRunnable implements Runnable {
	private int i = 0;
	
	@Override
	public void run() {
		Fibonacci gen = new Fibonacci();
		while(i-- > 0) {
			System.out.print(gen.next() + " ");
			Thread.yield();
		}
	}
	
	public FibonacciRunnable(int i) {
		this.i = i;
	}
}
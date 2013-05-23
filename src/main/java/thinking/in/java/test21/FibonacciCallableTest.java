package thinking.in.java.test21;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import thinking.in.java.code15.Fibonacci;

public class FibonacciCallableTest {

	/**
	 * @param args
	 * @throws ExecutionException 
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService exec = Executors.newCachedThreadPool();
		for(int i = 0; i < 10; i++) {
			Future<Integer> f = exec.submit(new FibonacciCallable(i));
			if(!f.isDone()) {
				System.out.println(f.get());
			}
		}
	}

}

class FibonacciCallable implements Callable<Integer> {
	private int i = 0;
	private int count = 0;
	@Override
	public Integer call() throws Exception {
		return count;
	}
	
	public FibonacciCallable(int i) {
		this.i = i;
		Fibonacci gen = new Fibonacci();
		while(i-- > 0) {
			count += gen.next();
		}
//		Thread.yield();
	} 
}
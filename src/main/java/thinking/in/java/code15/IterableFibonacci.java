package thinking.in.java.code15;

import java.util.Iterator;

public class IterableFibonacci extends Fibonacci implements Iterable<Integer> {

	private int n;
	public IterableFibonacci(int count){
		n = count;
	}
	public Iterator<Integer> iterator() {
		// TODO Auto-generated method stub
		return new Iterator<Integer>(){

			public boolean hasNext() {
				// TODO Auto-generated method stub
				return n > 0;
			}

			public Integer next() {
				// TODO Auto-generated method stub
				n--;
				return IterableFibonacci.this.next();
			}

			public void remove() {
				// TODO Auto-generated method stub
				throw new UnsupportedOperationException();
			}
		};
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i : new IterableFibonacci(18)){
			System.out.print(i + " ");
		}
	}

}

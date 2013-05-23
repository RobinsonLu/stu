package thinking.in.java.code11;

import java.util.Iterator;

public class IterableClass implements Iterable<String> {

	protected String[] words = ("and that is how we know the earth to " +
			"be banana-shaped.").split(" ");
	
	public Iterator<String> iterator() {
		// TODO Auto-generated method stub
		return new Iterator<String>(){

			private int index = 0;
			public boolean hasNext() {
				// TODO Auto-generated method stub
				return index < words.length;
			}
			public String next() {
				// TODO Auto-generated method stub
				return words[index++];
			}
			public void remove() {
				// TODO Auto-generated method stub
				throw new UnsupportedOperationException();
			}};
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (String s : new IterableClass()) {
			System.out.print(s + " ");
		}
	}

}

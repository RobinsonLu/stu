package thinking.in.java.code15;

public class GenericCast<T> {
	
	public static final int SIZE = 10;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FixedSizeStack<String> strings = new FixedSizeStack<String>(SIZE);
		for(String s : "A B C D E F G H I J".split(" ")) {
			strings.push(s);
		}
		for(int i = 0; i < SIZE; i++) {
			System.out.print(strings.top() + " ");
		}
	}

}

class FixedSizeStack<T> {
	private int index = 0;
	private Object[] storage;
	
	public FixedSizeStack(int size) {
		storage = new Object[size];
	}
	
	public void push(T item) {
		storage[index++] = item;
	}
	
	public T top() {
		return (T)storage[--index];
	}
}
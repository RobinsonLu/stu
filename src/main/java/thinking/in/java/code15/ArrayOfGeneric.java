package thinking.in.java.code15;

import java.util.ArrayList;
import java.util.List;

public class ArrayOfGeneric {

	static final int SIZE = 100;
	static Generic<Integer>[] gia;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		gia = (Generic<Integer>[])new Object[SIZE];
		gia = (Generic<Integer>[])new Generic[SIZE];
		System.out.println(gia.getClass().getSimpleName());
	}

}

class ListOfGenerics<T> {
	private List<T> array = new ArrayList<T>();
	
	public void add(T item) {
		array.add(item);
	}
	
	public T get(int index) {
		return array.get(index);
	}
}

class Generic<T> {}

class ArrayOfGenericReference {
	static Generic<Integer>[] gia;
}
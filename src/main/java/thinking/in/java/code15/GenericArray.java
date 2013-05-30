package thinking.in.java.code15;

public class GenericArray<T> {

	private T[] array;
	
	public GenericArray(int sz) {
		array = (T[])new Object[sz];
	}
	
	public static void main(String[] args) {
		GenericArray<Integer> gai = new GenericArray<Integer>(10);
//		Integer[] is = gai.rep();
		Object[] oa = gai.rep();
		System.out.println(oa[0]);
	}
	
	public void put(int index, T item) {
		array[index] = item;
	}
	
	public T get(int index) {
		return array[index];
	}
	
	public T[] rep() {
		return array;
	}
}

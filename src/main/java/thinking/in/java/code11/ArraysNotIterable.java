package thinking.in.java.code11;

import java.util.Arrays;

public class ArraysNotIterable {

	static <T> void test(Iterable<T> ib){
		for (T t : ib) {
			System.out.print(t + " ");
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test(Arrays.asList(1, 2, 3));
		String[] strings = {"A", "B", "C"};
//		test(strings);
		test(Arrays.asList(strings));
	}

}

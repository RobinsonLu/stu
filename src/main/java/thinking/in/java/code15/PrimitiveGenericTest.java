package thinking.in.java.code15;

import thinking.in.java.code16.RandomGenerator;
import net.mindview.util.Generator;

public class PrimitiveGenericTest {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] strings = FArray.fill(new String[7], new RandomGenerator.String(10));
		for(String s : strings) {
			System.out.println(s);
		}
		Integer[] integers = FArray.fill(new Integer[8], new RandomGenerator.Integer());
		for(int i : integers) {
			System.out.println(i);
		}
	}

}

class FArray {
	public static <T> T[] fill(T[] a, Generator<T> gen) {
		for(int i = 0; i < a.length; i++) {
			a[i] = gen.next();
		}
		return a;
	}
}
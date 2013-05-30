package thinking.in.java.code15;

import java.util.ArrayList;

public class ErasedTypeEquivalence {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Class c1 = new ArrayList<String>().getClass();
		Class c2 = new ArrayList<Integer>().getClass();
		System.out.println(c1 == c2);
	}

}

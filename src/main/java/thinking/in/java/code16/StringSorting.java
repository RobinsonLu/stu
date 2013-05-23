package thinking.in.java.code16;

import java.util.Arrays;
import java.util.Collections;

public class StringSorting {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] sa = Generated.array(new String[20], new RandomGenerator.String(5));
		System.out.println("before sort: " + Arrays.toString(sa));
		Arrays.sort(sa);
		System.out.println("after sort: " + Arrays.toString(sa));
		Arrays.sort(sa, Collections.reverseOrder());
		System.out.println("Reverse sort: " + Arrays.toString(sa));
		Arrays.sort(sa, String.CASE_INSENSITIVE_ORDER);
		System.out.println("Case-insensitive sort:" + Arrays.toString(sa));
	}

}

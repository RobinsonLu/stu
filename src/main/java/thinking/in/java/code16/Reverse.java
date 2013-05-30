package thinking.in.java.code16;

import java.util.Arrays;
import java.util.Collections;

public class Reverse {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CompType[] a = Generated.array(new CompType[12], CompType.generator());
		System.out.println("before sorting:");
		System.out.println(Arrays.toString(a));
		Arrays.sort(a, Collections.reverseOrder());
		System.out.println("after sorting:");
		System.out.println(Arrays.toString(a));
	}

}

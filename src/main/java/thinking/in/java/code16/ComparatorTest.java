package thinking.in.java.code16;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CompType[] a = Generated.array(new CompType[12], CompType.generator());
		System.out.println("before sorting:");
		System.out.println(Arrays.toString(a));
		Arrays.sort(a, Collections.reverseOrder());
		System.out.println("after sorting:");
		System.out.println(Arrays.toString(a));
	}

}

class CompTypeComparator implements Comparator<CompType>{
	public int compare(CompType o1, CompType o2) {
		return (o1.j < o2.j ? -1 : (o1.j == o2.j ? 0 : 1));
	}
}
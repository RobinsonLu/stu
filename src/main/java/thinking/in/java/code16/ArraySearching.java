package thinking.in.java.code16;

import java.util.Arrays;

import net.mindview.util.ConvertTo;
import net.mindview.util.Generator;

public class ArraySearching {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Generator<Integer> gen = new RandomGenerator.Integer(1000);
		int[] a = ConvertTo.primitive(Generated.array(new Integer[25], gen));
		Arrays.sort(a);
		System.out.println("Sorted array: " + Arrays.toString(a));
		while(true){
			int r = gen.next();
			int location = Arrays.binarySearch(a, r);
			if(location >= 0){
				System.out.println("Location of " + r + " is " + location + ", a[" + location + "] = " + a[location]);
				break;
			}
		}
	}

}

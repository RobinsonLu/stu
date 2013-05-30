package thinking.in.java.code16;

import java.util.Arrays;

import net.mindview.util.ConvertTo;

public class PrimitiveConversionDemonstration {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Integer[] a = Generated.array(Integer.class, new CountingGenerator.Integer(), 15);
		int[] b = ConverTo.primitive(a);
		System.out.println(Arrays.toString(b));
		boolean[] c = ConvertTo.primitive(Generated.array(Boolean.class, new CountingGenerator.Boolean(), 7));
		System.out.println(Arrays.toString(c));
	}

}

package thinking.in.java.code13;

import java.util.Arrays;
import java.util.regex.Pattern;

public class SplitDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "This!!unusual use!!of exclamation!!points";
		System.out.println(Arrays.toString(Pattern.compile("!!").split(input)));
		System.out.println(Arrays.toString(Pattern.compile("!!").split(input, 3)));
	}

}

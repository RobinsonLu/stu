package thinking.in.java.code13;

import java.util.Arrays;

public class Splitting {

	/**
	 * @param args
	 */
	public static final String knights = "Then, when have found the shrubbery. you must "
		+ "cut down the mightiest tree in the forest... with ... a herring!";
	
	public static void split(String regex){
		System.out.println(Arrays.toString(knights.split(regex)));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		split(" ");
		split("\\W+");
		split("n\\W+");
	}

	
}

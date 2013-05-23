package thinking.in.java.code13;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ReplacingStringTokenizer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "But I'm not dead yet! I feel happy!";
		StringTokenizer stoken = new StringTokenizer(input);
		while(stoken.hasMoreElements()){
			System.out.print(stoken.nextToken());
		}
		System.out.println();
		System.out.println(Arrays.toString(input.split(" ")));
		Scanner scanner = new Scanner(input);
		while(scanner.hasNext()){
			System.out.print(scanner.next() + " ");
		}
	}

}

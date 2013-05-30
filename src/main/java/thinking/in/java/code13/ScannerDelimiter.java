package thinking.in.java.code13;

import java.util.Scanner;

public class ScannerDelimiter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner("12, 42, 78, 99, 42");
		scanner.useDelimiter("\\s*,\\s*");
		while(scanner.hasNextInt()){
			System.out.println(scanner.nextInt());
		}
	}

}

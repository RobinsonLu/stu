package thinking.in.java.code13;

import java.util.Scanner;

public class BetterRead {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdin = new Scanner(SimpleRead.input);
		System.out.println("What is your name ?");
		String name = stdin.nextLine();
		System.out.println(name);
		System.out.println("How old are your ? What is your favorite double ?");
		System.out.println("(input : <age> <double>)");
		int age = stdin.nextInt();
		double favorite = stdin.nextDouble();
		System.out.println(age);
		System.out.println(favorite);
		System.out.format("Hi %s.\n", name);
		System.out.format("In 5 years you will be %d.\n", age + 5);
		System.out.format("My favorite double is %f.\n", favorite / 2);
	}

}

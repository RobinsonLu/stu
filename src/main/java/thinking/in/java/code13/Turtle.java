package thinking.in.java.code13;

import java.io.PrintStream;
import java.util.Formatter;

public class Turtle {

	/**
	 * @param args
	 */
	
	private String name;
	private Formatter f;
	
	public Turtle(String name, Formatter f) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.f = f;
	}
	
	public void move(int x, int y){
		f.format("%s The Turtle is at (%d, %d)\n", name, x, y);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PrintStream outAlias = System.out;
		Turtle tommy = new Turtle("Tommy", new Formatter(System.out));
		Turtle terry = new Turtle("Terry", new Formatter(outAlias));
		tommy.move(0, 0);
		terry.move(4, 8);
		tommy.move(3, 4);
		terry.move(2, 5);
		tommy.move(2, 5);
		terry.move(3, 3);
	}

	
}

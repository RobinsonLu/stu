package thinking.in.java.code13;

import java.util.ArrayList;

import thinking.in.java.code15.Coffee;
import thinking.in.java.code15.CoffeeGenerator;

public class ArrayListDisplay {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Coffee> coffees = new ArrayList<Coffee>();
		for (Coffee c : new CoffeeGenerator(10)) {
			coffees.add(c);
		}
		System.out.println(coffees);
	}

}

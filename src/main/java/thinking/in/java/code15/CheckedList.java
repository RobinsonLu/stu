package thinking.in.java.code15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import thinking.in.java.code14.Cat;
import thinking.in.java.code14.Dog;
import thinking.in.java.code14.Pet;

public class CheckedList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Dog> dogs1 = new ArrayList<Dog>();
		oldStyleMethod(dogs1);
		List<Dog> dogs2 = Collections.checkedList(new ArrayList<Dog>(), Dog.class);
		try {
			oldStyleMethod(dogs2);
		} catch(Exception e) {
			System.out.println(e);
		}
		List<Pet> pets = Collections.checkedList(new ArrayList<Pet>(), Pet.class);
		pets.add(new Dog());
		pets.add(new Cat());
	}

	static void oldStyleMethod(List probablyDogs) {
		probablyDogs.add(new Cat());
	}
}
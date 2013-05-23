package thinking.in.java.code15;

import java.util.List;
import java.util.Map;

import thinking.in.java.code14.Person;
import thinking.in.java.code14.Pet;

public class SimplerPets {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Map<Person, List<? extends Pet>> petPeople = New.map();
		System.out.println(petPeople);
	}

}

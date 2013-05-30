package thinking.in.java.code15;

import java.util.List;
import java.util.Map;

import thinking.in.java.code14.Person;
import thinking.in.java.code14.Pet;

public class LimitsOfInterence {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		f(New.map());
	}
	
	static void f(Map<Person, List<? extends Pet>> petPeople) {}
}

package thinking.in.java.code11;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import thinking.in.java.code14.Cat;
import thinking.in.java.code14.Cymric;
import thinking.in.java.code14.Dog;
import thinking.in.java.code14.Mutt;
import thinking.in.java.code14.Person;
import thinking.in.java.code14.Pet;
import thinking.in.java.code14.Pug;
import thinking.in.java.code14.Rat;

public class MapOfList {

	public static Map<Person, List<? extends Pet>> petPeople = 
		new HashMap<Person, List<? extends Pet>>();
	
	static {
		petPeople.put(new Person("Dawn"), 
				Arrays.asList(new Cymric("Molly"), new Mutt("Spot")));
		petPeople.put(new Person("Kate"), 
				Arrays.asList(new Cat("Shackleton"), new Dog("Margrett")));
		petPeople.put(new Person("Marilyn"), 
				Arrays.asList(new Pug("Louie aka Louis Snorkeltein Dupree"),
						new Cat("Stanford aka Stinky el Negro"),
						new Cat("Pinkola")));
		petPeople.put(new Person("Luke"), 
				Arrays.asList(new Rat("Fuzzy"), new Rat("Fizzy")));
		petPeople.put(new Person("Isaac"), Arrays.asList(new Rat("Freky")));
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("people: " + petPeople.keySet());
		System.out.println("pets: " + petPeople.values());
		for(Person person : petPeople.keySet()){
			System.out.println(person + " has:");
			for(Pet pet :petPeople.get(person)){
				System.out.println(" " + pet);
			}
		}
	}
	

}

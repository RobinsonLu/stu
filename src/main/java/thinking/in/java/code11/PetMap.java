package thinking.in.java.code11;

import java.util.HashMap;
import java.util.Map;

import thinking.in.java.code14.Cat;
import thinking.in.java.code14.Dog;
import thinking.in.java.code14.Hamster;
import thinking.in.java.code14.Pet;

public class PetMap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, Pet> petMap = new HashMap<String, Pet>();
		petMap.put("my cat", new Cat("Molly"));
		petMap.put("my dog", new Dog("Ginger"));
		petMap.put("my hamster", new Hamster("Bosco"));
		System.out.println(petMap);
		
		Pet dog = petMap.get("my dog");
		System.out.println(dog);
		System.out.println(petMap.containsKey("my dog"));
		System.out.println(petMap.containsValue(dog));
	}

}

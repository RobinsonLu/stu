package thinking.in.java.code17;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import thinking.in.java.code11.MapOfList;
import thinking.in.java.code14.Individual;
import thinking.in.java.code14.Pet;

public class IndividualTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Set<Individual> pets = new TreeSet<Individual>();
		
		for(List<? extends Pet> lp : MapOfList.petPeople.values()){
			for (Pet p : lp) {
				pets.add(p);
			}
		}
		
		System.out.println(pets);
	}

}

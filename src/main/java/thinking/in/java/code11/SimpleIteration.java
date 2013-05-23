package thinking.in.java.code11;

import java.util.Iterator;
import java.util.List;


import thinking.in.java.code14.Pet;
import thinking.in.java.code14.Pets;

public class SimpleIteration {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Pet> pets = Pets.arrayList(12);
		Iterator<Pet> it = pets.iterator();
		while(it.hasNext()){
			Pet p = it.next();
			System.out.print(p.id() + ":" + p + " ");
		}
		System.out.println();
		
		for (Pet pet : pets) {
			System.out.print(pet.id() + ":" + pet + " ");
		}
		System.out.println();
		
		it = pets.iterator();
		for(int i = 0; i < 6; i++){
			it.next();
			it.remove();
		}
		System.out.println(pets);
	}

}

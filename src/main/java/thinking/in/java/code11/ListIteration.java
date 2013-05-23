package thinking.in.java.code11;

import java.util.List;
import java.util.ListIterator;

import thinking.in.java.code14.Pet;
import thinking.in.java.code14.Pets;

public class ListIteration {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Pet> pets = Pets.arrayList(8);
		ListIterator<Pet> it = pets.listIterator();
		while(it.hasNext()){
			System.out.print(it.next() + ", " + it.nextIndex() + ", " 
					+ it.previousIndex() + "; ");
		}
		System.out.println();
		
		while(it.hasPrevious()){
			System.out.print(it.previous().id() + " ");
		}
		System.out.println();
		System.out.println(pets);
		
		it = pets.listIterator(3);
		while(it.hasNext()){
			it.next();
			it.set(Pets.randomPet());
		}
		System.out.println(pets);
	}

}

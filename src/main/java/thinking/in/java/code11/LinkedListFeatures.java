package thinking.in.java.code11;

import java.util.LinkedList;


import thinking.in.java.code14.Hamster;
import thinking.in.java.code14.Pet;
import thinking.in.java.code14.Pets;
import thinking.in.java.code14.Rat;

public class LinkedListFeatures {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Pet> pets = new LinkedList<Pet>(Pets.arrayList(5));
		System.out.println(pets);
		System.out.println("pets.getFirst(): " + pets.getFirst());
		System.out.println("pets.element(): " + pets.element());
		System.out.println("pets.peek(): " + pets.peek());
		System.out.println("pets.remove(): " + pets.remove());
		System.out.println("pets.removeFirst(): " + pets.removeFirst());
		System.out.println("pets.poll(): " + pets.poll());
		System.out.println(pets);
		
		pets.addFirst(new Rat());
		System.out.println("after addFirst(): " + pets);
		
		pets.offer(Pets.randomPet());
		System.out.println("after offer(): " + pets);
		
		pets.add(Pets.randomPet());
		System.out.println("after add(): " + pets);
		
		pets.addLast(new Hamster());
		System.out.println("after addLast(): " + pets);
		System.out.println("pets.removeLast(): " + pets.removeLast());
		System.out.println(pets);
	}

}

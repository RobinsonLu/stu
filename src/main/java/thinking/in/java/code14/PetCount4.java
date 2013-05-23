package thinking.in.java.code14;

public class PetCount4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TypeCounter counter = new TypeCounter(Pet.class);
		
		for(Pet pet : Pets.createArray(20)){
			System.out.print(pet.getClass().getSigners() + " ");
			counter.count(pet);
		}
		
		System.out.println("\n");
		System.out.println(counter);
		
	}

}

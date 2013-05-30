package thinking.in.java.code14;

import java.util.LinkedHashMap;
import java.util.Map;


import net.mindview.util.MapData;

public class PetCount3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PetCounter petCount = new PetCounter();
		for (Pet pet : Pets.createArray(20)) {
			System.out.print(pet.getClass().getSimpleName() + " ");
			petCount.count(pet);
		}
		System.out.println("\n");
		System.out.println(petCount);
	}

	static class PetCounter extends LinkedHashMap<Class<? extends Pet>, Integer>{
		public PetCounter(){
			super(MapData.map(LiteralPetCreator.allTypes, 0));
		}
		
		public void count(Pet pet){
			for (Map.Entry<Class<? extends Pet>, Integer> pair : entrySet()) {
				if(pair.getKey().isInstance(pet)){
					put(pair.getKey(), pair.getValue() + 1);
				}
			}
		}
		
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			StringBuilder result = new StringBuilder("{");
			for (Map.Entry<Class<? extends Pet>, Integer> pair : entrySet()) {
				result.append(pair.getKey().getSimpleName());
				result.append("=");
				result.append(pair.getValue());
				result.append(",");
			}
			
			result.delete(result.length() - 2, result.length());
			result.append("}");
			return result.toString();
		}
	}
	
}

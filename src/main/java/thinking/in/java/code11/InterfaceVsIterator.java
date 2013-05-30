package thinking.in.java.code11;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;


import thinking.in.java.code14.Pet;
import thinking.in.java.code14.Pets;

public class InterfaceVsIterator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Pet> petList = Pets.arrayList(8);
		Set<Pet> petSets = new HashSet<Pet>(petList);
		Map<String, Pet> petMap = new LinkedHashMap<String, Pet>();
		String[] names = ("Ralph, Eric, Robin, Lacey, Birtney, Sam, " +
				"Spot, Fluffy").split(", ");
		for(int i = 0; i < names.length; i++){
			petMap.put(names[i], petList.get(i));
		}
		display(petList);
		display(petSets);
		display(petList.iterator());
		display(petSets.iterator());
		System.out.println(petMap);
		System.out.println(petMap.keySet());
		display(petMap.values());
		display(petMap.values().iterator());
	}

	public static void display(Iterator<Pet> it){
		while(it.hasNext()){
			Pet p = it.next();
			System.out.print(p.id() + ":" + p + " ");
		}
		System.out.println();
	}
	
	public static void display(Collection<Pet> pets){
		for(Pet p : pets){
			System.out.print(p.id() + ":" + p + " ");
		}
		System.out.println();
	}
}

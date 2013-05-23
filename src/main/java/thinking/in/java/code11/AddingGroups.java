package thinking.in.java.code11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class AddingGroups {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Collection<Integer> collection = 
			new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
		
		Integer[] moreInteger = {6,7,8,9,10};
		collection.addAll(Arrays.asList(moreInteger));
		Collections.addAll(collection, 11,12,13,14,15);
		Collections.addAll(collection, moreInteger);
		
		for (Integer integer : collection) {
			System.out.print(integer +" , ");
			
		}
		System.out.println("\n");
		List<Integer> list = Arrays.asList(16,17,18,19,20);
		list.set(1, 99);
//		list.add(21);
		
		for (Integer integer2 : list) {
			System.out.print(integer2 + " , ");
		}
	}

}

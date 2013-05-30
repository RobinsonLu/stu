package thinking.in.java.code11;

import java.util.Collection;
import java.util.HashSet;

public class SimpleCollectionOfSet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Collection<Integer> c = new HashSet<Integer>();
		
		for(int i=0; i<10; i++){
			c.add(i);
		}
		
		for (Integer integer : c) {
			System.out.print(integer + " , ");
		}
	}

}

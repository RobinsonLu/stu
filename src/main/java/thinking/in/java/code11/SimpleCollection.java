package thinking.in.java.code11;

import java.util.ArrayList;
import java.util.Collection;

public class SimpleCollection {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Collection<Integer> c = new ArrayList<Integer>();
		
		for(int i=0; i<10; i++){
			c.add(i);
		}
		
		for (Integer integer : c) {
				System.out.print(integer + " , ");
		}
	}

}

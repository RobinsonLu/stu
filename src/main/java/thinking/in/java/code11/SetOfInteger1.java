package thinking.in.java.code11;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class SetOfInteger1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random rand = new Random();
		Set<Integer> intset = new HashSet<Integer>();
		
		for(int i = 0; i < 10000; i++){
			intset.add(rand.nextInt(30));
		}
		System.out.println(intset);
	}

}

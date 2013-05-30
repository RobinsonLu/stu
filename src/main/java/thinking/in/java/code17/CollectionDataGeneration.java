package thinking.in.java.code17;

import java.util.ArrayList;
import java.util.HashSet;

import thinking.in.java.code16.RandomGenerator;

public class CollectionDataGeneration {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(new ArrayList<String>(CollectionData.list(new RandomGenerator.String(9), 10)));
		System.out.println(new HashSet<Integer>(new CollectionData<Integer>(new RandomGenerator.Integer(), 10)));
	}

}

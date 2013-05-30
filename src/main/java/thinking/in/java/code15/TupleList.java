package thinking.in.java.code15;

import java.util.ArrayList;

public class TupleList<A, B, C, D> extends ArrayList<FourTuple<A, B, C, D>> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4153257022141233704L;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TupleList<Vehicle, Amphibian, String, Integer> tl = 
			new TupleList<Vehicle, Amphibian, String, Integer>();
		tl.add(TupleTest.h());
		tl.add(TupleTest.h());
		for(FourTuple<Vehicle, Amphibian, String, Integer> i : tl){
			System.out.println(i);
		}
	}

}

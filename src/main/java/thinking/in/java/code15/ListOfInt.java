package thinking.in.java.code15;

import java.util.ArrayList;
import java.util.List;

public class ListOfInt {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Integer> li = new ArrayList<Integer>();
		for(int i = 0; i < 5; i++) {
			li.add(i);
		}
		for(int i : li) {
			System.out.print(i + " ");
		}
	}

}

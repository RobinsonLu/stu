package thinking.in.java.code11;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class ForEachCollections {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Collection<String> cs = new LinkedList<String>();
		Collections.addAll(cs, "take the long way home".split(" "));
		for (String s : cs) {
			System.out.print("'" + s + "',");
		}
	}

}

package thinking.in.java.code18;

import java.util.ArrayList;

public class StringTest {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "967-11-11";
		a = a.replaceAll("[^A-Z_0-9]", "");
		System.out.println(a);
		ArrayList list = new ArrayList();
		list.add(1);
		System.out.println(list.get(0));
	}

}

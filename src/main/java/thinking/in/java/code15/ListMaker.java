package thinking.in.java.code15;

import java.util.ArrayList;
import java.util.List;

public class ListMaker<T> {

	List<T> create(int size) {
		return new ArrayList<T>(size);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ListMaker<String> listMaker = new ListMaker<String>();
		List<String> stringList = listMaker.create(8);
		System.out.println(stringList);
	}

}

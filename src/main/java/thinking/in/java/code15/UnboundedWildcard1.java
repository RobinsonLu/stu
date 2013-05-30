package thinking.in.java.code15;

import java.util.ArrayList;
import java.util.List;

public class UnboundedWildcard1 {

	static List list1;
	static List<?> list2;
	static List<? extends Object> list3;
	
	static void assign1(List list) {
		list1 = list;
		list2 = list;
	}
	
	static void assign2(List<?> list) {
		list1 = list;
		list2 = list;
		list3 = list;
	}
	
	static void assing3(List<? extends Object> list) {
		list1 = list;
		list2 = list;
		list3 = list;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		assign1(new ArrayList());
		assign2(new ArrayList());
		assing3(new ArrayList());
		
		assign1(new ArrayList<String>());
		assign2(new ArrayList<String>());
		assing3(new ArrayList<String>());
		
		List<?> wildList = new ArrayList();
		assign1(wildList);
		assign2(wildList);
		assing3(wildList);
	}

}

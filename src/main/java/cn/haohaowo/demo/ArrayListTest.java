package cn.haohaowo.demo;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a[] = {1, 2};
		int b[] = {3, 4, 5};
		System.arraycopy(a, 0, b, 1, 2);
		for(int aint : a){
			System.out.println(aint + ",");
		}
		for(int bint : b){
			System.out.println(bint + ",");
		}
		
		List<Integer> list = new ArrayList<Integer>(10);
		list.add(1);
		list.add(2);
		list.add(4);
		list.add(2, 3);
		System.out.println(list.size());
		for(int i : list) {
			System.out.println(i + ".");
		}
		list.set(2, 5);
		for(int i : list) {
			System.out.println(i + ".");
		}
	}

}

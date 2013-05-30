package cn.haohaowo.demo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class StringTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = null;
		List<String> list = new ArrayList<String>();
		for(int i = 0; i < 3; i++) {
			str = "a" + i;
			list.add(str);
		}
		list.set(1, null);
		for (String string : list) {
			System.out.println(string);
		}
		
		double i1 = 58;
		double i2 = 26;
		for(int i =0; i < 10000; i++) {
			if(i > 150) {
				i1 += 0.25;
			}
			i2 += 0.15;
			if(i2 > i1) {
				System.out.println(i);
				break;
			}
		}
		System.out.println(i2);
	}

}

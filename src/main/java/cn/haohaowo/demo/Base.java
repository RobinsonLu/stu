package cn.haohaowo.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Base {
	private void test() {
		String aStr = " One ";
		String bStr = aStr;// �ı�ʱ�򴴽����µĶ���������ǰ��û�仯
		bStr = aStr.trim();
		System.out.println("[" + aStr + "," + bStr + "]");
	}

	static public void main(String[] a) {
		new Base().test();

		ArrayList list = new ArrayList();
		list.add("java");
		list.add("php");
		list.add(".net");
		Iterator it = list.iterator();
		while (it.hasNext()) {
			// it.next();
			// it.remove();
			Object obj = (Object) it.next();
			list.remove(obj);
		}

		System.out.println(list.size());
	}
}
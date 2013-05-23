package cn.haohaowo.stu1;
import java.util.*;

public class ListTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list = new ArrayList();
		list.add(1);
		list.add("a");
		Iterator<String> i = list.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next() instanceof String);
		}
		/*for(String s:list)
		{
			System.out.println(s);
		}
		*/
	}

}

package thinking.in.java.code11;
import java.util.*;
public class SetOperations {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set1 = new HashSet<String>();
		Set<String> set2 = new HashSet<String>();
		String str1 = "a,b,c,d,g,h,j,e,z";
		String str2 = "x,y,z";
		Collections.addAll(set1, str1.split(","));
		set1.add("v");
		System.out.println("v "+set1.contains("v"));
		System.out.println("a "+set1.contains("a"));
		Collections.addAll(set2,str2.split(","));
		System.out.println("set2 in set1 "+set1.addAll(set2));
		set1.remove("z");
		System.out.println("set2 in set1 "+set1.addAll(set2));
		set1.removeAll(set2);
		System.out.println("set2 remove from set1 "+set1.containsAll(set2));
		Collections.addAll(set1,"x,y,z".split(","));
		System.out.println("x,y,z added to set1 "+set1);
	}

}

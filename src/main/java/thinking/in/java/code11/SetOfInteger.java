package thinking.in.java.code11;
import java.util.*;
public class SetOfInteger {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random(20);
		List<Integer> intlist = new ArrayList<Integer>();
		SortedSet<Integer> intsortset = new TreeSet<Integer>();
		Set<Integer> intset = new HashSet<Integer>();
		for(int i=0;i<100;i++)
		{
			intset.add(rand.nextInt(10));
			intlist.add(rand.nextInt(10));
			intsortset.add(rand.nextInt(10));
		}
		System.out.println(intset);
		System.out.println(intlist);
		System.out.println(intsortset);
	}

}

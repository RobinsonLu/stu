package thinking.in.java.code17;

import java.util.LinkedHashSet;
import java.util.Set;

import net.mindview.util.Generator;

public class CollectionDataTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Set<String> set = new LinkedHashSet<String>(new CollectionData<String>(new Government(), 15));
		set.addAll(CollectionData.list(new Government(), 15));
		System.out.println(set);
	}

}

class Government implements Generator<String>{
	String[] founddation = ("strage women lying in pounds distributing swords is no basis for a system of government").split(" ");
	private int index;
	public String next(){ return founddation[index++]; }
}
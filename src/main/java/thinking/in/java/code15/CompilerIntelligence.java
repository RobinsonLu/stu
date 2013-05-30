package thinking.in.java.code15;

import java.util.Arrays;
import java.util.List;

public class CompilerIntelligence {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<? extends Fruit> flist = Arrays.asList(new Apple());
		Apple a = (Apple)flist.get(0);
		System.out.println(flist.contains(new Apple()));
		System.out.println(flist.indexOf(new Apple()));
	}

}

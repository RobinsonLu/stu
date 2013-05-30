package thinking.in.java.code15;

import java.util.ArrayList;
import java.util.List;

public class GenericsAndCovariance {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<? extends Fruit> flist = new ArrayList<Apple>();
//		flist.add(new Apple());
//		flist.add(new Object());
		flist.add(null);
		System.out.println(flist.get(0));
	}

}

package thinking.in.java.code15;

public class ErasureAndInheritance {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Derived2 d2 = new Derived2();
		Object obj = d2.get();
		d2.set(obj);
	}

}

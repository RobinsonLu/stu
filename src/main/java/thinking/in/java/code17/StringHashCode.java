package thinking.in.java.code17;

public class StringHashCode {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] hellos = "Hello Hello".split(" ");
		System.out.println(hellos[0].hashCode());
		System.out.println(hellos[1].hashCode());
	}

}

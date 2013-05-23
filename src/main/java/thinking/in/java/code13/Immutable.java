package thinking.in.java.code13;

public class Immutable {

	public static String upcase(String s){
		return s.toUpperCase();
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String q = "howdy";
		System.out.println(q);
		String qq = upcase(q);
		System.out.println(q);
		System.out.println(qq);
	}

}

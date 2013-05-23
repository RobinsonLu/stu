package thinking.in.java.code13;

public class Replacing {

	/**
	 * @param args
	 */
	
	static String s= Splitting.knights;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(s.replaceFirst("f\\w++", "located"));
		System.out.println(s.replaceAll("shrubbery|tree|herring", "banana"));
	}

}

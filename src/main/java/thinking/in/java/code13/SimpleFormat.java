package thinking.in.java.code13;

public class SimpleFormat {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 5;
		double y = 5.3332;
		System.out.println("row1: ["+ x + "," + y + "]");
		System.out.format("row2: [%d,%f]\n", x, y);
		System.out.printf("row3: [%d,%f]\n", x, y);
	}

}

package thinking.in.java.code13;

import java.util.Random;

public class UsingStringBuilder {

	public static Random rand = new Random(47);
	public String toString(){
		StringBuilder result = new StringBuilder("[");
		for (int i = 0; i < 25; i++) {
			result.append(rand.nextInt(100));
			result.append(", ");
		}
		result.delete(result.length() - 2, result.length());
		result.append("]");
		return result.toString();
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UsingStringBuilder usb = new UsingStringBuilder();
		System.out.println(usb);
	}

}

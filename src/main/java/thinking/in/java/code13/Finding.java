package thinking.in.java.code13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Finding {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Matcher m = Pattern.compile("\\w+").matcher("Evening is full of the linnet's wings");
		while(m.find()){
			System.out.print(m.group()+ " ");
		}
		int i = 0;
		System.out.println("");
		while(m.find(i)){
			System.out.print(m.group() + " ");
			i++;
		}
	}

}

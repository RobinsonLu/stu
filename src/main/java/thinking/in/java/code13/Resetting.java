package thinking.in.java.code13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Resetting {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Matcher m = Pattern.compile("[frb][aiu][gx]").matcher("fix the rug with bags");
		while(m.find()){
			System.out.print(m.group() + " ");
		}
		System.out.println();
		m.reset("fix the rig with rags");
		while(m.find()){
			System.out.print(m.group() + " ");
		}
	}

}

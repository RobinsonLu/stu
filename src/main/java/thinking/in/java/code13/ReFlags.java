package thinking.in.java.code13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReFlags {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern p = Pattern.compile("^java", Pattern.CASE_INSENSITIVE | Pattern.MULTILINE);
		Matcher m = p.matcher("java has regex\nJava has regex\nJAVA has " +
				"pretty good regular expression\n Regular expression are in Java");
		while(m.find()){
			System.out.println(m.group());
		}
	}

}

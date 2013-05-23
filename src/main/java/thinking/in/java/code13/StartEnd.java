package thinking.in.java.code13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StartEnd {

	/**
	 * @param args
	 */
	
	public static String input = 
		"As long as there is injustice , whenever a\n" +
		"Targathing baby cries out . whenever a distress\n" +
		"signal sounds among the stars ... We'll be there .\n" +
		"This fine ship , and this fine crew ...\n" +
		"Never give up ! Never surrender !";
	
	private static class Display{
		private boolean regexPrinted = false;
		private String regex;
		Display(String regex){ this.regex = regex; }
		void display(String message){
			if(!regexPrinted){
				System.out.println(regex);
				regexPrinted = false;
			}
			System.out.println(message);
		}
	}
	
	static void examine(String s, String regex){
		Display d = new Display(regex);
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(s);
		while(m.find()){
			d.display("find() '" + m.group() + "' start = " + m.start() + " end = " + m.end());
		}
		if(m.lookingAt()){
			d.display("lookingAt() start = " + m.start() + " end = " + m.end());
		}
		if(m.matches()){
			d.display("matches() start = " + m.start() + " end = " + m.end());
		}

		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(String in : input.split("\n")){
			System.out.print("input : " + in);
			for (String regex : new String[]{"\\w*ere\\w*", "\\w*ever", "T\\w+", "Never.*?!"}) {
				examine(in, regex);
			}
		}
	}

}

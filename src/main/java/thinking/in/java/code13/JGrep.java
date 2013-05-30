package thinking.in.java.code13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import net.mindview.util.TextFile;

public class JGrep {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern p = Pattern.compile("\\b[Ssct]\\w+");
		int index = 0;
		Matcher m = p.matcher("");
		for(String line : new TextFile("src/thinking/in/java/code13/JGrep.java")){
			m.reset(line);
			while(m.find()){
				System.out.println(index++ + " : " + m.group() + " : " + m.start());
			}
		}
	}

}

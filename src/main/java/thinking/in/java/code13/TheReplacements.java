package thinking.in.java.code13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import net.mindview.util.TextFile;

/*!
 * Here's a block of text to use as input to
 * the regular expression matcher . Note that we'll
 * first extract the block of text by looking for 
 * the special delimiters , then process the extracted block.
 * !*/

public class TheReplacements {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = TextFile.read("src/thinking/in/java/code13/TheReplacements.java");
		Matcher mInput = Pattern.compile("/\\*!(.*)!\\*/", Pattern.DOTALL).matcher(s);
		if(mInput.find()){
			s = mInput.group(1);
			s = s.replaceAll(" {2,}", " ");
			s = s.replaceAll("(?m)^ +", "");
			System.out.println(s);
			s = s.replaceFirst("[aeiou]", "(VOWEL1)");
			StringBuffer sbuff = new StringBuffer();
			Pattern p = Pattern.compile("[aeiou]");
			Matcher m = p.matcher(s);
			while(m.find()){
				m.appendTail(sbuff);
				System.out.println(sbuff);
			}
		}
	}

}

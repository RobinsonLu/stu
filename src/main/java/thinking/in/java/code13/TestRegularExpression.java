package thinking.in.java.code13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestRegularExpression {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		if(args.length < 2){
//			System.out.println("Usage: \njava TestRegularExpression " +
//					" characterSequence regularExpression+");
//			System.exit(0);
//		}
		
		String[] argsStr = new String[]{"abcabcabcdefabc", "abc+", "(abc)+", "(abc){2,}"};
		
		System.out.println("Input: '" + argsStr[0] + "'");
		for (String arg : argsStr) {
			System.out.println("Regular expression: '" + arg + "'");
			Pattern p = Pattern.compile(arg);
			Matcher m = p.matcher(argsStr[0]);
			while(m.find()){
				System.out.println("Match '" + m.group() + "' at positions "
						+ m.start() + " - " + m.end());
			}
		}
	}

}

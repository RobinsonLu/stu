package thinking.in.java.code11;

import java.util.Set;
import java.util.TreeSet;

public class UniqueWords {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<String> words = new TreeSet<String>(
				new thinking.in.java.code18.TextFile("src/thinking/java/space11/SetOperations.java", "\\W++"));
		System.out.println(words); 
		
	}

}

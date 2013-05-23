package thinking.in.java.code11;
import java.util.*;

import thinking.in.java.code18.TextFile;
//import net.midview.util.*;
public class UniqueWordsAlphabetic {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> words = new TreeSet<String>(String.CASE_INSENSITIVE_ORDER);
		words.addAll(new TextFile("src/thinking/java/space11/SetOperations.java", "\\W+"));
		System.out.println(words);
		
	}

}

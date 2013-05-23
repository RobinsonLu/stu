package thinking.in.java.code18;

import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.SortedMap;

public class AvailableCharSets {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortedMap<String, Charset> charSets = Charset.availableCharsets();
		Iterator<String> it = charSets.keySet().iterator();
		
		while(it.hasNext()){
			String csName = it.next();
			System.out.print(csName);
			
			Iterator aliases = charSets.get(csName).aliases().iterator();
			if(aliases.hasNext()){
				System.out.print(" £º ");
			}
			while(aliases.hasNext()){
				System.out.print(aliases.next());
				if(aliases.hasNext()){
					System.out.print(" , ");
				}
			}
			System.out.println();
		}
		
	}

}

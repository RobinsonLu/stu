package thinking.in.java.code17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Vector;

public class Enumerations {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Vector<String> v = new Vector<String>(Countries.names(10));
		Enumeration<String> e = v.elements();
		while(e.hasMoreElements()){
			System.out.print(e.nextElement() + " , ");
		}
		e = Collections.enumeration(new ArrayList<String>());
		System.out.println(e);
	}

}

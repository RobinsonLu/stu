package thinking.in.java.code17;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class ReadOnly {

	static Collection<String> data = new ArrayList<String>(Countries.names(6));
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Collection<String> c = Collections.unmodifiableCollection(new ArrayList<String>(data));
		System.out.println(c);
		List<String> a = Collections.unmodifiableList(new ArrayList<String>(data));
		ListIterator<String> lit = a.listIterator();
		System.out.println(lit.next());
		Set<String> s = Collections.unmodifiableSet(new HashSet<String>(data));
//		s.add("a");
		System.out.println(s);
		Set<String> ss = Collections.unmodifiableSortedSet(new TreeSet<String>(data));
		System.out.println(ss);
		Map<String, String> m = Collections.unmodifiableMap(new HashMap<String, String>(Countries.capitals(6)));
		System.out.println(m);
		Map<String, String> sm = Collections.unmodifiableSortedMap(new TreeMap<String, String>(Countries.capitals(6)));
		System.out.println(sm);
	}

}

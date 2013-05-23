package thinking.in.java.code17;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Synchronization {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Collection<String> c = Collections.synchronizedCollection(new ArrayList<String>(Countries.names(6)));
		System.out.println(c);
		List<String> list = Collections.synchronizedList(new ArrayList<String>());
		Set<String> s = Collections.synchronizedSet(new HashSet<String>());
		Map<String, String> m = Collections.synchronizedMap(new HashMap<String, String>());
		Map<String, String> sm = Collections.synchronizedSortedMap(new TreeMap<String, String>());
	}

}

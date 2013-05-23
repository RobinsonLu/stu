package thinking.in.java.code11;
import java.util.*;
import java.util.Map.Entry;
public class MapTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set = new TreeSet<String>();
		Map<String,String> map = new TreeMap<String,String>();
		map.put("1", "abc");
		map.put("2", "bfd");
		set = map.keySet();
		Iterator iterator =  set.iterator();
		
		for(String key:set)
		{
			System.out.println(map.get(key));
		}
		while(iterator.hasNext())
		{
			String key = (String)iterator.next();
			System.out.println(key+","+map.get(key));
		}
	}

}

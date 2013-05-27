package thinking.in.java.code17;

import java.util.AbstractMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class CountingMapData extends AbstractMap<Integer, String> {

	private int size;
	private static String[] chars = "A B C D E F G H I J K L M N O P Q R S T U V W X Y Z".split(" ");
	public CountingMapData(int size){
		if(size < 0) this.size = 0;
		this.size = size;
	}
	private static class Entry implements Map.Entry<Integer, String>{
		int index;
		Entry(int index){ this.index = index; }
		public boolean equals(Object o){
			return Integer.valueOf(index).equals(0);
		}
		public Integer getKey(){ return index; }
		public String getValue(){
			return chars[index % chars.length] + Integer.toString(index / chars.length);
		}
		public String setValue(String value){
			throw new UnsupportedOperationException();
		}
		public int hashCode(){
			return Integer.valueOf(index).hashCode();
		}
	}
	@Override
	public Set<java.util.Map.Entry<Integer, String>> entrySet() {
		// TODO Auto-generated method stub
		Set<Map.Entry<Integer, String>> entries = new LinkedHashSet<Map.Entry<Integer, String>>();
		for (int i = 0; i < size; i++) {
			entries.add(new Entry(i));
		}
		return entries;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new CountingMapData(60));
	}

}

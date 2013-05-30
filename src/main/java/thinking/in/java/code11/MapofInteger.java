package thinking.in.java.code11;
import java.util.*;

public class MapofInteger {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		Map<Integer,Integer> intmap = new TreeMap<Integer,Integer>();
		for(int i=0;i<10;i++)
		{
			int r = rand.nextInt(5);
			Integer inte = intmap.get(r);
			intmap.put(r, inte == null ? 1:inte+1);
		}
		System.out.println(intmap);
	}

}

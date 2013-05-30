package thinking.in.java.code11;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Statistics {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i = 0; i < 10000; i++){
			int r = rand.nextInt(20);
			Integer freq = map.get(r);
			map.put(r, (null == freq? 1 : freq + 1));
		}
		System.out.println(map);
	}

}

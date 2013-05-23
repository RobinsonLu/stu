package cn.haohaowo.demo;

public class HashMapTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int h = 1111111;
		h ^= (h >>> 20) ^ (h >>> 12);
        System.out.println(h ^ (h >>> 7) ^ (h >>> 4));
	}

}

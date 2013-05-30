package cn.haohaowo.demo;

import java.lang.String;
import java.math.BigDecimal;
public class TestDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Hello World!!");
		int[] in = {1, 11};
		String str = new String(in, 0, 1);
		System.out.println(str);
		
		BigDecimal a = new BigDecimal(23.010000001d);
		a.setScale(2, BigDecimal.ROUND_HALF_UP);
		BigDecimal b = new BigDecimal(0.6d);
		b.setScale(2, BigDecimal.ROUND_HALF_UP);
		BigDecimal w = a.multiply(b);
		
//		w.setScale(2, BigDecimal.ROUND_HALF_UP);
		
		System.out.println(a.doubleValue());
		System.out.println(b.doubleValue());
		System.out.println(w.doubleValue());
		
		System.out.println(doublemultiply(23.010000001, 0.6f));
	}
	
	public strictfp static double doublemultiply(double x, float y){
		return (x * y);
	}

}

package cn.haohaowo.stu3;

public class BoundsDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] inums = {1,2,3,4,5};
		Stats<Integer> iobj = new Stats<Integer>(inums);
		double v1 = iobj.average();
		System.out.println("iobj average is :"+v1);
		
		Double[] dnums = {1.1,2.2,3.3,4.4,5.5};
		Stats<Double> dobj = new Stats<Double>(dnums);
		double v2 = dobj.average();
		System.out.println("dobj average is :"+v2);
	}

}

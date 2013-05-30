package cn.haohaowo.stu3;

public class TestTuple {

	/**
	 * @param args
	 */
	private static TwoTuple<String,Integer> f()
	{
		return new TwoTuple<String,Integer>("String",88);
	}
	private static ThreeTuple<String,Integer,Car> g()
	{
		return new ThreeTuple<String,Integer,Car>("String",88,new Car());
	}
	public static void main(String[] args) 
	{
//		TwoTuple<String,Integer> ttsl = f();
		System.out.println(f());
		
//		ThreeTuple<String,Integer,Double> ttsi = g();
		System.out.println(g());
	}

}

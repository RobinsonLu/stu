package cn.haohaowo.stu3;

public class GenDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Gen<Integer> iobj = new Gen<Integer>(88);
		iobj.showType();
		int i = iobj.getObj();
		System.out.println("Value is :"+i);
		
		Gen<String> str = new Gen<String>("Hello");
		str.showType();
		String string = str.getObj();
		System.out.println("Value is :"+string);
	}

}

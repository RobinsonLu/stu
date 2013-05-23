package cn.haohaowo.stu3;

public class TestCom {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] inmus = {2,5,0,3};
		Character[] c = {'a','n','t','g'};
		
		MyClass<Integer> iobj = new MyClass<Integer>(inmus);
		System.out.println(iobj.max());
		System.out.println(iobj.min());
		MyClass<Character> cobj = new MyClass<Character>(c);
		System.out.println(cobj.max());
		System.out.println(cobj.min());
	}

}

package cn.haohaowo.stu1;

public class TestException {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestException test = new TestException();
		try
		{
			test.g();
		}
		catch(ThrowsMyException e)
		{
			System.out.println("My God! ");
		}
		
	}
	private void f() throws Exception
	{
		System.out.println("f()");
		throw new Exception("f()");
	}
	private void g() throws ThrowsMyException
	{
		try
		{ 
			throw new ThrowsMyException("OK");
		}
		catch(ThrowsMyException e)
		{
			throw new ThrowsMyException("g()");
		}
	}
}

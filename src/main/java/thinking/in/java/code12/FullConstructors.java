package thinking.in.java.code12;

public class FullConstructors {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws MyException{
		// TODO Auto-generated method stub

		try{
			f();
		}catch(MyException e){
			e.printStackTrace(System.out);
		}
		
		try{
			g();
		}catch(MyException e){
			e.printStackTrace(System.out);
		}
	}
	
	public static void f() throws MyException{
		System.out.println("Throwing MyException from f()");
		throw new MyException();
	}

	public static void g() throws MyException{
		System.out.println("Throwing MyException from g()");
		throw new MyException();
	}
}

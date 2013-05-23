package thinking.in.java.code12;

public class ExtraFeatures {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try{
			f();
		}catch(MyException2 e){
			e.printStackTrace(System.out);
		}
		try{
			g();
		}catch(MyException2 e){
			e.printStackTrace(System.out);
		}
		try{
			h();
		}catch(MyException2 e){
			e.printStackTrace(System.out);
			System.out.println("e.val() = " + e.val());
		}
	}

	
	public static void f() throws MyException2{
		System.out.println("Throwing MyExceptions2 from f()");
		throw new MyException2();
	}
	public static void g() throws MyException2{
		System.out.println("Throwing MyException2 from g()");
		throw new MyException2("Originated in g()");
	}
	public static void h() throws MyException2{
		System.out.println("Throwing MyException2 from h()");
		throw new MyException2("Originated int h()", 47);
	}
}


class MyException2 extends Exception{
	private int i;
	public MyException2(){}
	public MyException2(String msg){ super(msg); }
	public MyException2(String msg, int x){
		super(msg);
		this.i = x;
	}
	public int val(){ return i;}
	public String getMessage(){
		return "Detail Message : " + " " + super.getMessage();
	}
}
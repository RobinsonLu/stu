package thinking.in.java.code12;

public class WhoCalled {

	/**
	 * @param args
	 */
	
	static void f(){
		try{
			throw new Exception();
		}catch(Exception e){
			for(StackTraceElement ste : e.getStackTrace()){
				System.out.println(ste.getMethodName());
			}
		}
	}
	static void g(){ f(); }
	static void h(){ g(); }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		f();
		System.out.println("--------------------------");
		g();
		System.out.println("--------------------------");
		h();
	}

}

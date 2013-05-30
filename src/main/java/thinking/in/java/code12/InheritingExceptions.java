package thinking.in.java.code12;

public class InheritingExceptions {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InheritingExceptions sed = new InheritingExceptions();
		
		try{
			sed.f();
		}catch(SimpleException e){
			System.out.println("Caught it !");
		}
	}
	
	public void f() throws SimpleException{
		System.out.println("Throw SimpleException from f()");
		throw new SimpleException();
	}

}


class SimpleException extends Exception{}
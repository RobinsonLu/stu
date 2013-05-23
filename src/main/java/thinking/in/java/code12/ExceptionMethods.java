package thinking.in.java.code12;

public class ExceptionMethods {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try{
			throw new Exception("My Exception");
		}catch(Exception e){
			System.out.println("Caught Exception");
			System.out.println("getMessage: " + e.getMessage());
			System.out.println("getLocalizedMessage: " + e.getLocalizedMessage() );
			System.out.println("toString: " + e);
			System.out.println("printStackTrace(): ");
			e.printStackTrace(System.out);
		}
	}

}

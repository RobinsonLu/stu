package thinking.in.java.code13;

public class DatabaseException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6987482968559640932L;

	/**
	 * @param args
	 */
	public DatabaseException(int transationID, int queryID, String message){
		super(String.format("(t%d, q%d) %s", transationID, queryID, message));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			throw new DatabaseException(3, 7, "Write failed");
		}catch(Exception e){
			System.out.println(e);
		}
	}

}

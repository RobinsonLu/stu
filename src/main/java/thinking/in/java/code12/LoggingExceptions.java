package thinking.in.java.code12;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

public class LoggingExceptions extends Exception {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			throw new LogginException();
		}catch (LogginException e) {
			// TODO: handle exception
			System.err.println("Caught " + e);
		}
		
		try{
			throw new LogginException();
		}catch (LogginException e) {
			// TODO: handle exception
			System.err.println("Caught " + e);
		}
	}

}


class LogginException extends Exception{
	private static Logger logger = Logger.getLogger("LoggingException");
	
	public LogginException() {
		// TODO Auto-generated constructor stub
		StringWriter trace = new StringWriter();
		printStackTrace(new PrintWriter(trace));
		logger.severe(trace.toString());
	}
}
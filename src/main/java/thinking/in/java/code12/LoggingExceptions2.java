package thinking.in.java.code12;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

public class LoggingExceptions2 {

	/**
	 * @param args
	 */
	
	private static Logger logger = Logger.getLogger("LogginException2");
	
	static void logException(Exception e){
		StringWriter trace = new StringWriter();
		e.printStackTrace(new PrintWriter(trace));
		logger.severe(trace.toString());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try{
			throw new NullPointerException();
		}catch(NullPointerException e){
			logException(e);
		}
	}

	
	
	
}

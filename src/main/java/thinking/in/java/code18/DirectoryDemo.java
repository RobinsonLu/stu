package thinking.in.java.code18;
import java.io.*;

public class DirectoryDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PPrint.pprint(Directory.walk("src/thinking").dirs);
		
		for(File file:Directory.local("src/thinking/java/space18","D.*"))
		{
			System.out.println(file);
		}
	}

}

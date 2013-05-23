package thinking.in.java.code18;

import java.io.IOException;
import java.io.StringReader;

public class MemoryInput {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		StringReader sr = new StringReader(BufferedInputFile.read("src/thinking/java/space18/MemoryInput.java"));
		int c = 0;
		while((c = sr.read()) != -1)
		{
			System.out.print((char)c);
		}
	}

}

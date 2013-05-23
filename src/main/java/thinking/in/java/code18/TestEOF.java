package thinking.in.java.code18;
import java.io.*;

public class TestEOF {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		DataInputStream dis = new DataInputStream(new BufferedInputStream(new 
				FileInputStream("src/thinking/java/space18/TestEOF.java")));
		while(dis.available() != 0)
			System.out.print((char)dis.readByte());
	}

}

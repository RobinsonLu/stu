package thinking.in.java.code18;
import java.io.*;

public class FormattedMomeryInput {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		try
		{
			DataInputStream dis = new DataInputStream(new ByteArrayInputStream
					(BufferedInputFile.read("src/thinking/java/space18/FormattedMomeryInput.java").getBytes()));
			while(true)
			{
				System.out.print((char)dis.readByte());
			}
		}
		catch(EOFException e)
		{
			System.err.println("End of Stream!");
		}
	}

}

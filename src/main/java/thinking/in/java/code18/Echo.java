package thinking.in.java.code18;
import java.io.*;

public class Echo {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = null;
		while((str = br.readLine()) != null&&(str.length() != 0)&&!(str.equalsIgnoreCase("exit"))&&str.equals("\n"))
		{
			System.out.println(str);
		}
	}

}

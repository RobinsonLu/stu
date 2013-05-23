package thinking.in.java.code18;
import java.io.*;
public class BasicFileOutput {

	private static String file = "src/thinking/java/space18/BasicFileOutput.java";
	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new StringReader(BufferedInputFile.read(
				file)));
		PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(file)));
		int linecount = 1;
		String str = null;
		while((str = br.readLine()) != null)
		{
			System.out.println(linecount++ +":"+str);
		}
		pw.close();
		br.close();
		System.out.println(BufferedInputFile.read(file));
	}

}


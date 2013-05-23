package thinking.in.java.code18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;

public class BufferedInputFile {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		System.out.println(read("src/thinking/java/space18/DirList.java"));
	}
	public static String read(String filename) throws IOException
	{
		BufferedReader br = new BufferedReader(new FileReader(filename));
		String str = null;
		StringBuilder sb = new StringBuilder();
		while((str = br.readLine()) != null)
		{
			sb.append(str+"\n");
		}
		br.close();
		return sb.toString();
	}
}

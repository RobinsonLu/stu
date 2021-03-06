package thinking.in.java.code18;
import java.io.*;

public class Redirecting {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException{
		PrintStream ps = System.out;
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("src/thinking/java/space18/Redirecting.java"));
		PrintStream pis = new PrintStream(new BufferedOutputStream(new FileOutputStream("src/txt/out.dat")));
		System.setIn(bis);
		System.setOut(pis);
		System.setErr(pis);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = null;
		while((str = br.readLine()) != null)
		{
			System.out.println(str);
		}
		pis.close();
		System.setOut(ps);
	}

}

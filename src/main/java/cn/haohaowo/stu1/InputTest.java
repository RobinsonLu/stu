package cn.haohaowo.stu1;
import java.io.*;

public class InputTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			FileInputStream input = new FileInputStream("src/txt/news.txt");
			StringBuffer strbuf = new StringBuffer();
			while(input.available() != 0)
			{
				int i = input.read();
				if((char)i == 'a') break;
				strbuf.append((char)i);
			}
			//PrintWriter p = new PrintWriter();
			System.out.println(strbuf);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}

}

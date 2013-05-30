package cn.haohaowo.stu1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class TestComefromKeyboard {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			PrintWriter out = new PrintWriter("D:\\out.txt");
			String str = br.readLine();
			while(!str.equalsIgnoreCase("exit")||str.equals("\n"))
			{
				out.println(str);
				str = br.readLine();
			}
			br.close();
			out.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}

}

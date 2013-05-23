package cn.haohaowo.stu1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.RandomAccessFile;

public class TestRandomInput {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			RandomAccessFile ra = new RandomAccessFile("D:\\out.txt","rw");
			byte[] content = new byte[(int)ra.length()];
			ra.read(content);
			
			BufferedReader br = new BufferedReader(new FileReader("D:\\out1.txt"));
			String str = br.readLine();
			ra.seek(2);
			while(null!=str)
			{
				ra.write(str.getBytes());
				str = br.readLine();
			}
			ra.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}

}

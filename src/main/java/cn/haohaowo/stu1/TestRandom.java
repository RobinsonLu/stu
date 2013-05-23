package cn.haohaowo.stu1;

import java.io.IOException;
import java.io.RandomAccessFile;

public class TestRandom {

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
			
			for(byte by:content)
			{
				System.out.print((char)by);
			}
			ra.seek(ra.length());
			String str = "over";
			ra.write(str.getBytes());
			ra.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}

}

package cn.haohaowo.stu1;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.BufferedInputStream;

public class TestFileStream {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			FileInputStream fis = new FileInputStream("D:\\out.txt");
			BufferedInputStream bis = new BufferedInputStream(fis);
			FileOutputStream fos = new FileOutputStream("D:\\output.txt");
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			while(fis.available() !=0)
			{
				char c = (char)fis.read();
				System.out.print(c);
				bos.write(c);
			}
//			int b = fis.read();
//			while(b!=-1)
//			{
//				char c = (char)b;
//				System.out.print(c);
//				bos.write(c);
//				b = bis.read();
//			}
			bis.close();
			bos.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
//		catch(FileNotFoundException e)
//		{
//			e.printStackTrace();
//		}
	}

}

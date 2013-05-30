package thinking.in.java.code18;

import java.io.IOException;
import java.io.RandomAccessFile;

public class UsingRandomAccessFile {

	/**
	 * @param args
	 */
	static String file = "src/txt/rtest.dat";
	public static void main(String[] args) throws IOException 
	{
		RandomAccessFile raf = new RandomAccessFile(file,"rw");
		for(int i=0;i<7;i++)
		{
			raf.writeDouble(i*1.414);
		}
		raf.writeUTF("The end of the file!");
		raf.close();
		display();
		raf = new RandomAccessFile(file,"rw");
		raf.seek(5*8);
		raf.writeDouble(47.000);
		raf.close();
		display();
	}
	static void display() throws IOException
	{
		RandomAccessFile rf = new RandomAccessFile(file,"r");
		for(int i=0;i<7;i++)
		{
			System.out.println("Value "+i+" : "+rf.readDouble());
		}
		System.out.println(rf.readUTF());
		rf.close();
	}
}

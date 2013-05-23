package thinking.in.java.code18;

import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

public class LargeMappedFiles {
 
	static int length = 0x8FFFFFF;
	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		MappedByteBuffer out = new RandomAccessFile("test.dat", "rw").getChannel().map(FileChannel.MapMode.READ_WRITE, 0 , length);
		
		for(int i = 0; i < length; i++){
			out.put((byte)'x');
		}
		System.out.println("Finished Writing!");
		for (int i = 0; i < length/1024/1024; i++) {
			System.out.print((char)out.get(i));
		}
	} 

}

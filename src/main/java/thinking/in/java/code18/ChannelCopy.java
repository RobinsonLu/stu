package thinking.in.java.code18;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ChannelCopy {

	private static final int BSIZE = 1024;
	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
//		if(args.length != 2){
//			System.out.println("arguments : sourcefile destfile ");
//			System.exit(1);
//		}
		
		
		FileChannel in = new FileInputStream("Src/txt/mm.txt").getChannel();
		FileChannel out = new FileOutputStream("Src/txt/data.txt").getChannel();
		
		ByteBuffer buffer = ByteBuffer.allocate(BSIZE);
		while(in.read(buffer) != -1){
			buffer.flip();
			out.write(buffer);
			buffer.clear();
		}
	}

}

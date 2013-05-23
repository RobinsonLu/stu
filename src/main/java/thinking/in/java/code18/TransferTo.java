package thinking.in.java.code18;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.channels.FileChannel;

public class TransferTo {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
//		if(args.length != 2){
//			System.out.println("arguments : sourcefile destfile ");
//			System.exit(1);
//		}
		
		FileChannel in = new FileInputStream("Src/txt/news.txt").getChannel();
		FileChannel out = new FileOutputStream("src/txt/data.txt").getChannel();
		
//		out.transferFrom(in, 0, in.size());
		in.transferTo(0, in.size(), out);
	}

}

package thinking.in.java.code18;

import java.io.FileOutputStream;
import java.nio.channels.FileLock;
import java.util.concurrent.TimeUnit;

public class FileLocking {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		FileOutputStream fos = new FileOutputStream("src/txt/test.xt");
		FileLock fl = fos.getChannel().tryLock();
		if(fl != null){
			System.out.println("Locked File");
			TimeUnit.MILLISECONDS.sleep(100);
			fl.release();
			System.out.println("Released Lock");
		}
		fos.close();
	}

}

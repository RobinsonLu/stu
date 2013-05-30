package thinking.in.java.code18;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;

public class LockingMappedFiles {

	static final int length = 0xFFFFFF;
	static FileChannel fc;
	
	private static class LockAndModify extends Thread{
		private ByteBuffer buff;
		private int start, end;
		LockAndModify(ByteBuffer mbb, int start, int end){
			this.start = start;
			this.end = end;
			mbb.limit(end);
			mbb.position(start);
			buff = mbb.slice();
			start();
		}
		
		public void run(){
			try{
				FileLock fl = fc.lock(start, end, false);
				System.out.println("Lock: " + start + " to " + end);
				while(buff.position() < buff.limit() - 1){
					buff.put((byte)(buff.get() + 1));
				}
				fl.release();
				System.out.println("Released: " + start + " to " + end);
			}catch(IOException e){
				throw new RuntimeException();
			}
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		fc = new RandomAccessFile("src/txt/test.dat", "rw").getChannel();
		MappedByteBuffer out = fc.map(FileChannel.MapMode.READ_WRITE, 0, length);
		for (int i = 0; i < length; i++) {
			out.put((byte)'X');
		}
		new LockAndModify(out, 0, 0 + length/3);
		new LockAndModify(out, length/2, length*3/4);
	}

}

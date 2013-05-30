package thinking.in.java.code18;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;

public class IntBufferDemo {

	private static final int BSIZE = 1024;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ByteBuffer bb = ByteBuffer.allocate(BSIZE);
		IntBuffer ib = bb.asIntBuffer();
		ib.put(new int[]{11, 42, 47, 99, 143, 811, 1016});
		System.out.println(ib.get(3));
		ib.put(3, 1911);
		ib.flip();
		while(ib.hasRemaining()){
			int i = ib.get();
			System.out.println(i);
		}
	}

}

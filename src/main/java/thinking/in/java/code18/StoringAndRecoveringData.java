package thinking.in.java.code18;
import java.io.*;

public class StoringAndRecoveringData {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(
				new FileOutputStream("Data.txt")));
		dos.writeDouble(3.14259);
		dos.writeUTF("That was pi!!");
		dos.writeDouble(1.41413);
		dos.writeUTF("Square root of 2!!");
		dos.close();
		DataInputStream dis = new DataInputStream(new BufferedInputStream(
				new FileInputStream("Data.txt")));
		System.out.println(dis.readDouble());
		System.out.println(dis.readUTF());
		System.out.println(dis.readDouble());
		System.out.println(dis.readUTF());
	}

}

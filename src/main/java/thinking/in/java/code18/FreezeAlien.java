package thinking.in.java.code18;

import java.io.FileOutputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class FreezeAlien {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		ObjectOutput out = new ObjectOutputStream(new FileOutputStream("x.file"));
		Alien quellek = new Alien();
		out.writeObject(quellek);
	}

}
 class Alien implements Serializable{}
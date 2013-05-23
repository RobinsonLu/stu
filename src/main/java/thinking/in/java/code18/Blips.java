package thinking.in.java.code18;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class Blips {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException, ClassNotFoundException{
		// TODO Auto-generated method stub
		System.out.println("Constructing objects:");
		Blip1 b1 = new Blip1();
		Blip2 b2 = new Blip2();
		ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream("src/txt/Blips.out"));
		System.out.println("Saving objects:");
		o.writeObject(b1);
		o.writeObject(b2);
		o.close();
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("src/txt/Blips.out"));
		System.out.println("Recovering b1: ");
		b1 = (Blip1)in.readObject();
//		b2 = (Blip2)in.readObject();
	}

}

class Blip1 implements Externalizable{
	public Blip1(){
		System.out.println("Blip1 Constructor");
	}
	public void writeExternal(ObjectOutput out) throws IOException{
		System.out.println("Blip1.writenExternal");
	}
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException{
		System.out.println("Blip1.readExternal");
	}
}

class Blip2 implements Externalizable{
	Blip2() {
		// TODO Auto-generated constructor stub
		System.out.println("Blip2 Constructor");
	}
	public void writeExternal(ObjectOutput out) throws IOException{
		System.out.println("Blip2.writeExternal");
	}
	public void readExternal(ObjectInput in) throws IOException,
			ClassNotFoundException {
		// TODO Auto-generated method stub
		System.out.println("Blip2.readExternal");
	}
}
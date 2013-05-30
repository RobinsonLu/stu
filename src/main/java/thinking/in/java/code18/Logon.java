package thinking.in.java.code18;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Logon implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7095306698393769424L;

	private Date date = new Date();
	private String username;
	private transient String password;
	public Logon(String name, String pwd){
		username = name;
		password = pwd;
	}
	public String toString(){
		return "Logon info: \n username: " + username + "\n date: " + date + "\n password: " + password;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Logon a = new Logon("Hulk", "myLittlePony");
		System.out.println("Logon a = " + a);
		ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream("src/txt/Logon.out"));
		o.writeObject(a);
		o.close();
		TimeUnit.SECONDS.sleep(1);
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("src/txt/Logon.out"));
		System.out.println("Recovering object at " + new Date());
		a = (Logon)in.readObject();
		System.out.println("Logon a = " + a);
	}

}

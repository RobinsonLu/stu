package cn.haohaowo.stu1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectInput {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UsePerson p1 = new UsePerson();
		p1.setAge(20);
		p1.setName("lwc");
		UsePerson p2 = new UsePerson();
		p2.setAge(19);
		p2.setName("root");
		
		try
		{
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("lishi"));
			oos.writeObject(p1);
			oos.writeObject(p2);
			oos.close();
			
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
		try
		{
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("lishi"));
			
			try
			{
				p1 = (UsePerson) ois.readObject();
				p2 = (UsePerson) ois.readObject();
				
				System.out.println(p1);
				System.out.println(p2);
				
				ois.close();
			}
			catch(ClassNotFoundException e)
			{
				e.printStackTrace();
			}
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}

}

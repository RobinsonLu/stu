package cn.haohaowo.stu2;

public class PrimeThread extends Thread 
{
	public void run()
	{
		for(int i=0;i<20;i++)
		{
			System.out.println(getName()+"--NO."+i);
		}
	}
}

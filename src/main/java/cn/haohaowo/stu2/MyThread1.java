package cn.haohaowo.stu2;

public class MyThread1 extends Thread 
{
	SyncMethod s;
	
	public MyThread1(SyncMethod s)
	{
		this.s = s;
	}
	
	public void run()
	{
		s.foo();
		s.goo();
	}
}

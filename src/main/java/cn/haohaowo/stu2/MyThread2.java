package cn.haohaowo.stu2;

public class MyThread2 extends Thread{
	SyncMethod s;
	
	public MyThread2(SyncMethod s)
	{
		this.s = s;
	}
	
	public void run()
	{
		s.foo();
		s.goo();
	}
}

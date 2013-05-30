package cn.haohaowo.stu2;

public class SyncMethod {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SyncMethod s1 = new SyncMethod();
		Thread t1 = new MyThread1(s1);
		Thread t2 = new MyThread2(s1);
		
		t1.start();
		
		t2.start();
	}
	public synchronized void foo()
	{
		String name = Thread.currentThread().getName();
		
		System.out.println(name+"调用foo()");
		System.out.println(name+"结束foo()");
	}
	
	public synchronized void goo()
	{
		String name = Thread.currentThread().getName();
		
		System.out.println(name+"调用goo()");
		System.out.println(name+"结束goo()");
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

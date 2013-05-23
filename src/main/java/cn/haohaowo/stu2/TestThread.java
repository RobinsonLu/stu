package cn.haohaowo.stu2;

public class TestThread {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Thread thread = new Thread();
		Thread thread1 = new PrimeThread();
		Thread thread2 = new PrimeThread();
		Thread thread3 = new PrimeThread();
		
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.activeCount());
		System.out.println(Thread.currentThread().getPriority());
		System.out.println(thread1.getPriority());
		System.out.println("-----------Thread1 started!!");
		thread1.start();
		try
		{
			thread1.join();
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.println("-----------Thread2 started!!");
		thread2.start();
		try {
			thread2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("-----------Thread3 started!!");
		thread3.start();
		try {
			thread3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

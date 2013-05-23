package cn.haohaowo.stu2;

public class TestPriority {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("线程名\t优先级");
		Thread current = Thread.currentThread();
		System.out.print(current.getName()+"\r");
		System.out.println(current.getPriority());
		
		Thread t1 = new Runner();
		Thread t2 = new Runner();
		Thread t3 = new Runner();
		
		t1.setName("First");
		t2.setName("Second");
		t3.setName("Third");
		
		t3.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.NORM_PRIORITY);
		t1.setPriority(Thread.MIN_PRIORITY);
		
		t1.start();
		t2.start();
		t3.start();
	}

}


class Runner extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println(this.getName()+"\t"+this.getPriority());
		}
	}
}
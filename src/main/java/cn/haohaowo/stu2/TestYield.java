package cn.haohaowo.stu2;

public class TestYield extends Thread{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<2;i++)
		{
			new TestYield();
		}
	}
	private int count = 3;
	public TestYield()
	{
		start();
	}
	public void run()
	{
		while(true)
		{
			System.out.println(this.getName()+getState());
			System.out.println(this);
			if(--count == 0)
			{
				return ;
			}
			
			//yield();
			try
			{
				sleep(5000);
				System.out.println(isAlive());
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
			
		}
	}
	public String toString()
	{
		return "#"+getName()+"--NO.--"+count;
	}
}

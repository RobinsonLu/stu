package cn.haohaowo.stu2;

public class Account 
{
	private double banlance;
	public synchronized void deposite(double amount)
	{
		if(amount <= 0)
		{
			System.out.println("Error{存款额不能小于等于0}");
		}
		banlance += amount;
		System.out.println("Husband 向银行存入{￥ "+amount+" !!}");
	}
	public synchronized void withdraw(double amount)
	{
		if(banlance < amount)
		{
			System.out.println("Error{余额不足！！}");
		}
		banlance -= amount;
		System.out.println("Wife 向银行取走了{￥ "+amount+" !!}");
	}
	
}

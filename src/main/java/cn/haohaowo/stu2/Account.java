package cn.haohaowo.stu2;

public class Account 
{
	private double banlance;
	public synchronized void deposite(double amount)
	{
		if(amount <= 0)
		{
			System.out.println("Error{�����С�ڵ���0}");
		}
		banlance += amount;
		System.out.println("Husband �����д���{�� "+amount+" !!}");
	}
	public synchronized void withdraw(double amount)
	{
		if(banlance < amount)
		{
			System.out.println("Error{���㣡��}");
		}
		banlance -= amount;
		System.out.println("Wife ������ȡ����{�� "+amount+" !!}");
	}
	
}

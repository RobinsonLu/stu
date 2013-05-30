package cn.haohaowo.stu2;

public class Action implements Runnable {

	private String operator;
	private Account account;
	public void run() {
		// TODO Auto-generated method stub
		if(operator.startsWith("Husband"))
		{
			depositeMoney(account,2000);
		}
		else if(operator.startsWith("Wife"))
		{
			withdrawMoney(account,1000);
		}
	}
	public Action(Account account,String operator)
	{
		this.account = account;
		this.operator = operator;
	}
	private static synchronized void depositeMoney(Account account,double amount)
	{
		for(int i=0;i<3;i++)
		{
			account.deposite(amount);
		}
	}
	private static synchronized void withdrawMoney(Account account,double amount)
	{
		for(int i=0;i<3;i++)
		{
			account.withdraw(amount);
		}
	}
}

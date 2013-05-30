package cn.haohaowo.stu2;

public class AccountDmeo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account = new Account();
		Action a1 = new Action(account,"Husband");
		Action a2 = new Action(account,"Wife");
		
		Thread t1 = new Thread(a1);
		Thread t2 = new Thread(a2);
		
		t1.start();
		t2.start();
	}

}

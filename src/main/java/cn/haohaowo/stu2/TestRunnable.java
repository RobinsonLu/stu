package cn.haohaowo.stu2;

public class TestRunnable {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable runnable1 = new PrimeRun();
		Runnable runnable2 = new PrimeRun();
		Runnable runnable3 = new PrimeRun();
		
		System.out.println("--------runnable1 is run");
		new Thread(runnable1).start();
		System.out.println("--------runnable2 is run");
		new Thread(runnable2).start();
		System.out.println("--------runnable3 is run");
		new Thread(runnable3).start();
		
	}

}

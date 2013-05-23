package thinking.in.java.code21;

import java.util.concurrent.ThreadFactory;


public class ExceptionThread2 implements Runnable {

	public void run() {
		// TODO Auto-generated method stub
		Thread t = Thread.currentThread();
		System.out.println("run() by " + t);
		System.out.println("eh = " + t.getUncaughtExceptionHandler());
		throw new RuntimeException();
	}

}

class MyUncaughtExceptionHandler implements Thread.UncaughtExceptionHandler{
	public void uncaughtException(Thread t, Throwable e) {
		// TODO Auto-generated method stub
		System.out.println("caught " + e);
	}
}

class HandlerThreadFactory implements ThreadFactory{
	public Thread newThread(Runnable r) {
		// TODO Auto-generated method stub
		System.out.println(this + " creating new Thread");
		Thread t = new Thread(r);
		System.out.println("created " + t);
		t.setUncaughtExceptionHandler(new MyUncaughtExceptionHandler());
		System.out.println("eh = " + t.getUncaughtExceptionHandler());
		return t;
	}
}
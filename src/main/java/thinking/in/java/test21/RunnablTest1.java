package thinking.in.java.test21;

public class RunnablTest1 {
	public static void main(String[] args) {
		System.out.println("Running Thread");
		for(int i = 0; i < 10; i++) {
			Thread t = new Thread(new Running());
			t.start();
		}
		System.out.println("Thread Stop");
	}
}

class Running implements Runnable {
	@Override
	public void run() {
		int i = 3;
		while(i-- > 0) {
			System.out.println("I am running!" + i);
			Thread.yield();
		}
	}
}
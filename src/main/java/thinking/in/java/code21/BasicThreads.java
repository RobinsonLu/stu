package thinking.in.java.code21;

public class BasicThreads {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t = new Thread(new LiftOff());
		t.start();
		System.out.println("waiting for LiftOff");
	}

}

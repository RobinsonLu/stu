package thinking.in.java.code21;

public class DaemonsDontRunFinally {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t = new Thread(new ADaemon());
//		t.setDaemon(true);
		t.start();
	}

}

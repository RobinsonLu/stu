package thinking.in.java.code21;

public class SynchronizedEvenGenerator extends IntGenerator {

	private int currentEvenValue = 0;
	@Override
	public int next() {
		// TODO Auto-generated method stub
		++currentEvenValue;
		Thread.yield();
		++currentEvenValue;
		return currentEvenValue;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EvenChecker.test(new SynchronizedEvenGenerator());
	}

}

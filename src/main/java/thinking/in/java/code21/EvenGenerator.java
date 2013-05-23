package thinking.in.java.code21;

public class EvenGenerator extends IntGenerator {

	private int currentEvenValue = 0;
	@Override
	public int next() {
		// TODO Auto-generated method stub
		++currentEvenValue;
		++currentEvenValue;
		return currentEvenValue;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EvenChecker.test(new EvenGenerator());
	}

}

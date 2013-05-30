package thinking.in.java.code15;

public class SimpleDogsAndRobots {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CommunicateSimply.perform(new PerformingDog());
		CommunicateSimply.perform(new Robot());
	}

}

class CommunicateSimply {
	static void perform(Performs performer) {
		performer.speak();
		performer.sit();
	}
}

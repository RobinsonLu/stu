package thinking.in.java.code15;

import thinking.in.java.code14.Dog;

public class DogsAndRobots {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		PerformingDog d = new PerformingDog();
		Robot r = new Robot();
		Communicate.perform(d);
		Communicate.perform(r);
	}

}

interface Performs {
	void speak();
	void sit();
}
class PerformingDog extends Dog implements Performs {

	@Override
	public void sit() {
		System.out.println("Sitting!");
	}

	@Override
	public void speak() {
		System.out.println("Woof!");
	}
	
	public void reproduce() {}
}
class Robot implements Performs {

	@Override
	public void sit() {
		System.out.println("Clank!");
	}

	@Override
	public void speak() {
		System.out.println("Click!");
	}
	
	public void oilChange() {}
	
}
class Communicate {
	public static <T extends Performs> void perform(T performer) {
		performer.speak();
		performer.sit();
	}
}
package thinking.in.java.code15;

import java.lang.reflect.Method;

public class LatentReflection {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CommuicateReflectively.perform(new SmartDog());
		CommuicateReflectively.perform(new Robot());
		CommuicateReflectively.perform(new Mime());
	}

}

class Mime {
	public void walkAgainstThewind() {}
	public void sit() {
		System.out.println("Pretending to sit");
	}
	public void pushInvisibleWalls() {}
	public String toString() {
		return "Mime";
	}
}
class SmartDog {
	public void speak() {
		System.out.println("Woof!");
	}
	public void sit() {
		System.out.println("Sitting!");
	}
	public void reproduce() {}
}
class CommuicateReflectively {
	public static void perform(Object speaker) {
		Class<?> spkr = speaker.getClass();
		try {
			try {
				Method speak = spkr.getMethod("speak");
				speak.invoke(speaker);
			} catch(NoSuchMethodException e) {
				System.out.println(speaker + " cannot speak");
			}
			try {
				Method sit = spkr.getMethod("sit");
				sit.invoke(speaker);
			} catch(NoSuchMethodException e) {
				System.out.println(speaker + " cannot sit");
			}
		} catch(Exception e) {
			throw new RuntimeException(speaker.toString(), e);
		}
	}
}
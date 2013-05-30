package thinking.in.java.code14;

import java.util.Arrays;
import java.util.List;

import net.mindview.util.Null;

public class SnowRemoveRobot implements Robot{

	private String name;
	
	public SnowRemoveRobot(String name) {
		this.name = name;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Robot.Test.test(new SnowRemoveRobot("Slusher"));
	}

	@Override
	public String model() {
		return "SnowBot Series 11";
	}

	@Override
	public String name() {
		return name;
	}

	@Override
	public List<Operation> operations() {
		return Arrays.asList(
				new Operation() {
					@Override
					public void command() {
						System.out.println(name + " shoveling snow");
					}
					@Override
					public String description() {
						return name + " can shovel snow";
					}
				},
				new Operation() {
					@Override
					public void command() {
						System.out.println(name + " chipping ice");
					}
					@Override
					public String description() {
						return name + " can chip ice";
					}
				},
				new Operation() {
					@Override
					public void command() {
						System.out.println(name + " clearing roof");
					}
					@Override
					public String description() {
						return name + " can clear the roof";
					}
				}
			);
	}

}

interface Operation {
	String description();
	void command();
}

interface Robot {
	String name();
	String model();
	List<Operation> operations();
	
	class Test {
		public static void test(Robot r) {
			if(r instanceof Null) {
				System.out.println("[Null Robot]");
			}
			System.out.println("Robot name: " + r.name());
			System.out.println("Robot model: " + r.model());
			for(Operation operation : r.operations()) {
				System.out.println(operation.description());
				operation.command();
			}
		}
	}
}
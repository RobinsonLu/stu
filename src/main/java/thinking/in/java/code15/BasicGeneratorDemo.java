package thinking.in.java.code15;

import net.mindview.util.Generator;

public class BasicGeneratorDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Generator<CountedObject> gen = BasicGenerator.create(CountedObject.class);
		for(int i = 0; i < 5; i++){
			System.out.println(gen.next());
		}
	}

}

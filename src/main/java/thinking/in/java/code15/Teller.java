package thinking.in.java.code15;

import net.mindview.util.Generator;

public class Teller {

	private static long counter = 1;
	private final long id = counter++;
	private Teller(){}
	public String toString(){
		return "Teller " + id;
	}
	public static Generator<Teller> generator = new Generator<Teller>(){
		public Teller next(){
			return new Teller();
		}
	};
	
}

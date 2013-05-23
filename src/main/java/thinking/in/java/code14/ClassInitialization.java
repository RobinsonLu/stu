package thinking.in.java.code14;

import java.util.Random;

public class ClassInitialization {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Class initable = Initable.class;
		System.out.println("After Creating Initable ref!!");
		System.out.println(Initable.staticFinal);
		System.out.println(Initable.staticFinal2);
		
		System.out.println(Initable2.staticNonFinal);
		
		try {
			Class initable3 = Class.forName("thinking.in.java.code14.Initable3");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("After creating Initable3 ref!!");
		System.out.println(Initable3.staticNonFinal);
		
	}
	
	public static Random rand = new Random(47);

}


class Initable{
	static final int staticFinal = 47;
	static final int staticFinal2 = ClassInitialization.rand.nextInt(1000);
	static {
		System.out.println("Initializing Initable!!");
	}
}

class Initable2{
	static int staticNonFinal = 147;
	static {
		System.out.println("Initializing Initable2!!");
	}
}

class Initable3{
	static int staticNonFinal = 74;
	static {
		System.out.println("Initializing Initable3!!");
	}
}
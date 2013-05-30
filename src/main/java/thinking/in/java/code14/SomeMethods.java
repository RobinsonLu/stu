package thinking.in.java.code14;

public interface SomeMethods {
	
	void boring1();
	void boring2();
	void interesting(String arg);
	void boring3();
}

class Inplementation implements SomeMethods{

	public void boring1() {
		// TODO Auto-generated method stub
		System.out.println("boring1");
	}

	public void boring2() {
		// TODO Auto-generated method stub
		System.out.println("boring2");
	}

	public void boring3() {
		// TODO Auto-generated method stub
		System.out.println("boring3");
	}

	public void interesting(String arg) {
		// TODO Auto-generated method stub
		System.out.println("interesting " + arg);
	}
	
}

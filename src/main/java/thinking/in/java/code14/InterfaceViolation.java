package thinking.in.java.code14;

public class InterfaceViolation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		A a = new B();
		a.f();
		System.out.println(a.getClass().getName());
		if(a instanceof B) {
			B b = (B) a;
			b.g();
		}
	}

}

interface A {
	void f();
}

class B implements A {

	@Override
	public void f() {
		
	}
	
	public void g() {}
}
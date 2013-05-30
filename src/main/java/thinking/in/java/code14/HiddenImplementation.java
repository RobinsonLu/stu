package thinking.in.java.code14;

import java.lang.reflect.Method;

public class HiddenImplementation {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		A a = HiddenC.makeA();
		a.f();
		System.out.println(a.getClass().getName());
		callHiddenMethod(a, "g");
		callHiddenMethod(a, "u");
		callHiddenMethod(a, "v");
		callHiddenMethod(a, "w");
	}
	
	static void callHiddenMethod(Object a, String methodName) throws Exception {
		Method g = a.getClass().getDeclaredMethod(methodName);
		g.setAccessible(true);
		g.invoke(a);
	}

}

class C implements A {
	@Override
	public void f() {
		System.out.println("public C.f()");
	}
	
	public void g() {
		System.out.println("public C.g()");
	}
	
	void u() {
		System.out.println("package C.u()");
	}
	
	protected void v() {
		System.out.println("protected C.v()");
	}
	
	protected void w() {
		System.out.println("protected C.w()");
	}
}

class HiddenC {
	public static A makeA() {
		return new C();
	}
}
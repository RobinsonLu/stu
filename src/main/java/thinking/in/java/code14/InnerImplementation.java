package thinking.in.java.code14;

public class InnerImplementation {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		A a = InnerA.makeA();
		a.f();
		System.out.println(a.getClass().getName());
		HiddenImplementation.callHiddenMethod(a, "g");
		HiddenImplementation.callHiddenMethod(a, "u");
		HiddenImplementation.callHiddenMethod(a, "v");
		HiddenImplementation.callHiddenMethod(a, "w");
	}

}

class InnerA {
	private static class C implements A {
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
	public static A makeA() {
		return new C();
	}
}
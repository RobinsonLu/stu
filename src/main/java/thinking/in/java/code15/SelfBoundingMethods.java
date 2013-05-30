package thinking.in.java.code15;

public class SelfBoundingMethods {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		A a = f(new A());
	}
	
	static <T extends SelfBounded<T>> T f(T arg) {
		return arg.set(arg).get();
	}

}

class NotSelfBounded<T> {
	T element;
	NotSelfBounded<T> set(T arg) {
		element = arg;
		return this;
	}
	T get() {
		return element;
	}
	@Override
	public String toString() {
		return this.getClass().getSimpleName();
	}
}

class A2 extends NotSelfBounded<A2> {}
class B2 extends NotSelfBounded<B2> {}
class C2 extends NotSelfBounded<C2> {
	C2 setAndGet(C2 arg) {
		set(arg);
		return get();
	}
}
class D2 {}
class E2 extends NotSelfBounded<D2> {}
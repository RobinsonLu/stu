package thinking.in.java.code15;

public class CRGWithBasicHolder {

	public static void main(String[] args) {
		SubType st1 = new SubType();
		SubType st2 = new SubType();
		st1.set(st2);
		SubType st3 = st1.get();
		st1.f();
	}
}

class BasicHolder<T> {
	T element;
	void set(T arg) {
		element = arg;
	}
	T get() {
		return element;
	}
	void f() {
		System.out.println(element.getClass().getSimpleName());
	}
}

class SubType extends BasicHolder<SubType> {}
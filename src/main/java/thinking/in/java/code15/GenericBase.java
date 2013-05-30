package thinking.in.java.code15;

public class GenericBase<T> {

	private T element;
	public void set(T arg) {
		arg = element;
	}
	public T get() {
		return element;
	}
}

class Derived1<T> extends GenericBase<T> {}
class Derived2 extends GenericBase {}
package thinking.in.java.code15;

public class CreatorGeneric {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Creator c = new Creator();
		c.f();
	}

}

abstract class GenericWithCreate<T> {
	final T element;
	GenericWithCreate() {
		element = create();
	}
	abstract T create();
}

class X {}

class Creator extends GenericWithCreate<X> {
	@Override
	X create() {
		// TODO Auto-generated method stub
		return new X();
	}
	void f() {
		System.out.println(element.getClass().getSimpleName());
	}
}
package thinking.in.java.code15;

public class OrdinaryArguments {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Base base = new Base();
		Derived derived = new Derived();
		DerivedSetter ds = new DerivedSetter();
		ds.set(derived);
		ds.set(base);
	}

}

class OrdinarySetter {
	void set(Base base) {
		System.out.println("OrdinarySetter.set(Base)");
	}
}

class DerivedSetter extends OrdinarySetter {
	void set(Derived derived) {
		System.out.println("DerivedSetter.set(Derived)");
	}
}

class Base {}
class Derived extends Base {}
interface OrdinaryGetter {
	Base get();
}
interface DerivedGetter extends OrdinaryGetter {
	Derived get();
}
class CovariantReturnTypes {
	void test(DerivedGetter d) {
		Derived d2 = d.get();
	}
}
interface GenericGetter<T extends GenericGetter<T>> {
	T get();
}
interface Getter extends GenericGetter<Getter> {}
class GenericsAndReturnTypes {
	void test(Getter g) {
		Getter result = g.get();
		GenericGetter gg = g.get();
	}
}
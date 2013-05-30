package thinking.in.java.code15;

public class PlainGenericInheritance {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Base base = new Base();
		Derived derived = new Derived();
		DerivedGS dgs = new DerivedGS();
		dgs.set(derived);
		dgs.set(base);
	}

}

class GenericSetter<T> {
	void set(T arg) {
		System.out.println("GenericSetter.set(Base)");
	}
}

class DerivedGS extends GenericSetter<Base> {
	void set(Derived derived) {
		System.out.println("DerivedGS.set(Derived)");
	}
}

interface SelfBoundSetter<T extends SelfBoundSetter<T>> {
	void set(T arg);
}
interface Setter extends SelfBoundSetter<Setter> {}
class SelfBoundingAndCovariantArguments {
	void tesA(Setter s1, Setter s2, SelfBoundSetter sbs) {
		s1.set(s2);
//		s1.set(sbs);
	}
}
package thinking.in.java.code14;

public class FamilyVsExactType {

	/**
	 * @param args
	 */
	
	static void test(Object x){
		System.out.println("Testing x of type : " + x.getClass());
		System.out.println("x instanceOf Base : " + (x instanceof Base));
		System.out.println("x instanceOf Derived : " + (x instanceof Derived));
		System.out.println("Base.instance(x) : " + Base.class.isInstance(x));
		System.out.println("Derived instance(x) : " + Base.class.isInstance(x));
		System.out.println("x.getClass() == Base.class : " + (x.getClass() == Base.class));
		System.out.println("x.getClass() == Derived.class : " + (x.getClass() == Derived.class));
		System.out.println("x.getClass().equals(Base.class) : " + (x.getClass().equals(Base.class)));
		System.out.println("x.getClass().equals(Derived.class) : " + (x.getClass().equals(Derived.class)));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test(new Base());
		test(new Derived());
	}

}


class Base{};
class Derived extends Base{}
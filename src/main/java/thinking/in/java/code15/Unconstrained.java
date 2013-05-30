package thinking.in.java.code15;

public class Unconstrained {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BasicOther b = new BasicOther();
		BasicOther b2 = new BasicOther();
		b.set(new Other());
		Other other = b.get();
		b.f();
	}

}

class Other {}
class BasicOther extends BasicHolder<Other> {}
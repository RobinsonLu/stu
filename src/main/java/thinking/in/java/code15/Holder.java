package thinking.in.java.code15;

public class Holder<T> {

	private T value;
	
	public Holder() {}
	
	public Holder(T val) {
		value = val;
	}
	
	public void set(T val) {
		value = val;
	}
	
	public T get() {
		return value;
	}
	
	@Override
	public boolean equals(Object obj) {
		return value.equals(obj);
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Holder<Apple> apple = new Holder<Apple>(new Apple());
		Apple d = apple.get();
		apple.set(d);
//		Holder<Fruit> fruit = apple;
		Holder<? extends Fruit> fruit = apple;
		Fruit p = fruit.get();
		d = (Apple) fruit.get();
		
		try {
			Orange c = (Orange)fruit.get();
		} catch(Exception e) {
			System.out.println(e);
		}
		System.out.println(fruit.equals(d));
	}

}

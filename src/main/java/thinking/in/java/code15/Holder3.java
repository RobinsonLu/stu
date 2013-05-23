package thinking.in.java.code15;

public class Holder3<T> {

	/**
	 * @param args
	 */
	private T a;
	private Holder3(T a){ this.a = a; }
	public void set(T a){ this.a = a; }
	public T get(){ return a;}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Holder3<Automobile> h3 = new Holder3<Automobile>(new Automobile());
//		Automobile a = h3.get();
		Holder3<String> h3 = new Holder3<String>("");
		h3.set("Not a Automobile");
		System.out.println(h3.get());
//		h3.set(1);
	}

}

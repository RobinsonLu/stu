package thinking.in.java.code15;

public class Holder2 {

	/**
	 * @param args
	 */
	private Object a;
	public Holder2(Object a){
		this.a = a;
	}
	public void set(Object a){
		this.a = a;
	}
	public Object get(){
		return a;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Holder2 h2 = new Holder2(new Automobile());
		h2.set("Not an Automobile");
		String s = (String)h2.get();
		System.out.println(s);
		h2.set(1);
		Integer x = (Integer)h2.get();
		System.out.println(x);
	}

}

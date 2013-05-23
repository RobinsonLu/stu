package thinking.in.java.code15;

public class SimpleHolder {

	private Object obj;
	
	public void set(Object obj) {
		this.obj = obj;
	}
	
	public Object get() {
		return obj;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SimpleHolder holder = new SimpleHolder();
		holder.set("Item");
		String s = (String) holder.get();
		System.out.println(s);
	}

}

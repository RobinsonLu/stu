package thinking.in.java.code15;

public class GenericMethods {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericMethods gm = new GenericMethods();
		gm.f("");
		gm.f(1);
		gm.f(1.0);
		gm.f(1.0f);
		gm.f('c');
		gm.f(gm);
	}

	public <T> void f(T x){
		System.out.println(x.getClass().getName());
	}
}

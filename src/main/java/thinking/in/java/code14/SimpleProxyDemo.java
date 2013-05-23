package thinking.in.java.code14;

public class SimpleProxyDemo {

	/**
	 * @param args
	 */
	public static void consumer(Interface iface){
		iface.doSomething();
		iface.somethingElse("bonobo");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		consumer(new RealObject());
		consumer(new SimpleProxy(new RealObject()));
	}

}

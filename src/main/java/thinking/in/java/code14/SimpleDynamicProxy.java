package thinking.in.java.code14;

import java.lang.reflect.Proxy;

public class SimpleDynamicProxy {

	/**
	 * @param args
	 */
	public static void consumer(Interface iface){
		iface.doSomething();
		iface.somethingElse("bonobo");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RealObject real = new RealObject();
		consumer(real);
		Interface proxy = (Interface)Proxy.newProxyInstance(Interface.class.getClassLoader(),
				new Class[]{Interface.class}, new DynamicProxyHandler(real));
		consumer(proxy);
	}

}

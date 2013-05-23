package thinking.in.java.code14;

import java.lang.reflect.Proxy;

public class SelectingMethods {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SomeMethods proxy = (SomeMethods)Proxy.newProxyInstance(
				SomeMethods.class.getClassLoader(), new Class[]{ SomeMethods.class}, 
				new MethodSelector(new Inplementation()));
		proxy.boring1();
		proxy.boring2();
		proxy.boring3();
		proxy.interesting("bonobo");
	}

}

package thinking.in.java.code14;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;

import thinking.in.java.code15.TwoTuple;

import static thinking.in.java.code15.Tuple.*;

public class DynamicProxyMixin {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Object mixin = MixinProxy.newInstance(tuple(new BasicImpl(), Basic.class),
				tuple(new TimeStampedImpl(), TimeStamped.class),
				tuple(new SerialNumberImpl(), SerialNumbered.class));
		Basic b = (Basic)mixin;
		TimeStamped t = (TimeStamped)mixin;
		SerialNumbered s = (SerialNumbered)mixin;
		b.set("Hello");
		System.out.println(b.get());
		System.out.println(t.getStamp());
		System.out.println(s.getSerialNumber());
	}

}

class MixinProxy implements InvocationHandler {
	Map<String, Object> delegatesByMethod;
	public MixinProxy(TwoTuple<Object, Class<?>>... pairs) {
		delegatesByMethod = new HashMap<String, Object>();
		for(TwoTuple<Object, Class<?>> pair : pairs) {
			for(Method method : pair.second.getMethods()) {
				String methodname = method.getName();
				if(!delegatesByMethod.containsKey(methodname)) {
					delegatesByMethod.put(methodname, pair.first);
				}
			}
		}
	}
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		String methodName = method.getName();
		Object delegate = delegatesByMethod.get(methodName);
		return method.invoke(delegate, args);
	}
	public static Object newInstance(TwoTuple... pairs) {
		Class[] interfaces = new Class[pairs.length];
		for(int i = 0; i < pairs.length; i++) {
			interfaces[i] = (Class)pairs[i].second;
		}
		ClassLoader c1 = pairs[0].first.getClass().getClassLoader();
		return Proxy.newProxyInstance(c1, interfaces, new MixinProxy(pairs));
	}
}
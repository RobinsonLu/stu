package thinking.in.java.code15;

public class Wildcards {

	static void rawArgs(Holder holder, Object arg) {
		holder.set(arg);
		Object obj = holder.get();
	}
	
	static void unboundedArg(Holder<?> holder, Object arg) {
//		holder.set(arg);
		Object obj = holder.get();
	}
	
	static <T> T exact1(Holder<T> holder) {
		T t = holder.get();
		return t;
	}
	
	static <T> T exact2(Holder<T> holder, T arg) {
		holder.set(arg);
		T t = holder.get();
		return t;
	}
	
	static <T> T wildSubtype(Holder<? extends T> holder, T arg) {
		T t = holder.get();
		return t;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Holder raw = new Holder<Long>();
		raw = new Holder();
		Holder<Long> qualified = new Holder<Long>();
		Holder<?> unbounded = new Holder<Long>();
		Holder<? extends Long> bounded = new Holder<Long>();
		Long lng = 1L;
		
		rawArgs(raw, lng);
		rawArgs(qualified, lng);
		rawArgs(bounded, lng);
		rawArgs(unbounded, lng);
		
		unboundedArg(raw, lng);
		unboundedArg(qualified, lng);
		unboundedArg(unbounded, lng);
		unboundedArg(bounded, lng);
		
		Long r2 = exact1(qualified);
		Object r3 = exact1(qualified);
		Long r4 = exact1(bounded);
		
		Long r10 = wildSubtype(qualified, lng);
//		Object rll = wildSubtype(unbounded, lng);
		Long r12 = wildSubtype(bounded, lng);
		
	}

}

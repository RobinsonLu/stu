package thinking.in.java.code17;

public abstract class Test<C> {

	String name;
	public Test(String name){ this.name = name; }
	abstract int test(C container, TestParam tp);
}

class TestParam{
	public final int SIZE;
	public final int loops;
	public TestParam(int size, int loops){
		this.SIZE = size;
		this.loops = loops;
	}
	public static TestParam[] array(int... values){
		int size = values.length / 2;
		TestParam[] result = new TestParam[size];
		int n = 0;
		for (int i = 0; i < size; i++) {
			result[i] = new TestParam(values[n++], values[n++]);
		}
		return result;
	}
	public static TestParam[] array(String[] values){
		int[] vals = new int[values.length];
		for (int i = 0; i < vals.length; i++) {
			vals[i] = Integer.decode(values[i]);
		}
		return array(vals);
	}
}
package thinking.in.java.code15;

public class TwoTuple<A, B> {

	public final A first;
	public final B second;
	public TwoTuple(A a, B b){
		first = a;
		second = b;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "(" + first + ", " + second + ")";
	}
}

package thinking.in.java.code15;

public class Holder1 {
	
	private Automobile a;
	public Holder1(Automobile a){
		this.a = a;
	}
	Automobile get(){ return a;}
}


class Automobile{}
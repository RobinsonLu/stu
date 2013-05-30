package thinking.in.java.code17;

public class SpringDetector2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		SpringDetector.detectSpring(Groundhog.class);
	}

}

class Groundhog2 extends Groundhog{
	public Groundhog2(int n){ super(n); }
	public int hashCode(){ return number; }
	public boolean equals(Object o){
		return o instanceof Groundhog2 && (number == ((Groundhog2)o).number);
	}
}
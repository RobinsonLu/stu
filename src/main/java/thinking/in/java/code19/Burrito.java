package thinking.in.java.code19;


public class Burrito {

	Spiciness degree;
	public Burrito(Spiciness degree){ this.degree = degree; }
	public String toString(){ return "Burrito is " + degree; }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new Burrito(Spiciness.NOT));
		System.out.println(new Burrito(Spiciness.MEDIUM));
		System.out.println(new Burrito(Spiciness.HOT));
	}

}

enum Spiciness{
	NOT, MILD, MEDIUM, HOT, FLAMING
}
package thinking.in.java.code8;

public class Music2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Stringed stringed = new Stringed();
		Brass brass = new Brass();
		Wind wind = new Wind();
		tune(stringed);
		tune(brass);
		tune(wind);
	}
	private static void tune(Instrument in)
	{
		in.play(Note.middle_c);
	}
	private static void tun(Stringed b)
	{
		b.play(Note.b_flat);
	}
}

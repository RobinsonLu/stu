package thinking.in.java.code14;

import net.mindview.util.Null;

public class PersonP {

	public final String first;
	public final String last;
	public final String address;
	
	public PersonP(String first, String last, String address){
		this.first = first;
		this.last = last;
		this.address = address;
	}
	
	public String toString(){
		return "PersonP : " + first + " " + last + " " + address;
	}
	public static class NullPersonP extends PersonP implements Null{
		private NullPersonP(){
			super("None", "None", "None");
		}
		public String toString(){
			return "NullPersonP";
		}
	}
	public static final PersonP NULL = new NullPersonP();
}

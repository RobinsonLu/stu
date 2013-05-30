package thinking.in.java.code11;

import java.util.ArrayList;

public class GerilTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Gerbil> gerbils = new ArrayList<Gerbil>();
		
		for(int i=0; i<4; i++){
			gerbils.add(new Gerbil(i));
		}
		
		for (Gerbil gerbil : gerbils) {
			System.out.println(gerbil.hop());
		}
	}

}

package thinking.in.java.code11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AsListInference {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Snow> snow1 = Arrays.asList(new Crusty(), new Slush(), new Powder());
		
//		List<Snow> snow2 = Arrays.asList(new Light() , new Heavy());
		
		List<Snow> snow3 = new ArrayList<Snow>();
		Collections.addAll(snow3, new Light(), new Heavy());
		
		List<Snow> snow4 = Arrays.<Snow>asList(new Light(), new Heavy());
	}

}


class Snow{}
class Powder extends Snow{}
class Light extends Powder{}
class Heavy extends Powder{}
class Crusty extends Snow{}
class Slush extends Snow{}
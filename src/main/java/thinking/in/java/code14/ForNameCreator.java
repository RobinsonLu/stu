package thinking.in.java.code14;

import java.util.ArrayList;
import java.util.List;

public class ForNameCreator extends PetCreator {

	private static List<Class<? extends Pet>> types = 
		new ArrayList<Class<? extends Pet>>();
	private static String[] typeNames = {"thinking.in.java.code14.Mutt",
		"thinking.in.java.code14.Pug", "thinking.in.java.code14.EgyptianMau",
		"thinking.in.java.code14.Manx", "thinking.in.java.code14.Cymric",
		"thinking.in.java.code14.Rat", "thinking.in.java.code14.Mouse",
		"thinking.in.java.code14.Hamster"};
	
	@Override
	public List<Class<? extends Pet>> types() {
		// TODO Auto-generated method stub
		return types;
	}

	private static void loader(){
		try{
			for(String name : typeNames){
				types.add((Class<? extends Pet>)Class.forName(name));
			}
		}catch(ClassNotFoundException e){
			throw new RuntimeException();
		}
	}
	
	static {loader();};
}

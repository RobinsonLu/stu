package thinking.in.java.code14;

import java.util.ArrayList;

public class Staff extends ArrayList<Position>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * @param args
	 */
	
	public void add(String title, PersonP personp){
		add(new Position(title, personp));
	}
	
	public void add(String... titles){
		for(String title : titles){
			add(new Position(title));
		}
	}
	
	public Staff(String... titles){
		add(titles);
	}
	
	public boolean positionAll(String title){
		for(Position position : this){
			if(position.getTitle().equals(title) && position.getPersonp() == PersonP.NULL){
				return true;
			}
		}
		return false;
	}
	
	public void fillPosition(String title, PersonP hire){
		for(Position position : this){
			if(position.getTitle().equals(title) && position.getPersonp() == PersonP.NULL){
				position.setPersonp(hire);
				return ;
			}
		}
		
		throw new RuntimeException("Position " + title + " not available");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Staff staff = new Staff("President", "CTO", "Marketing Manager", "Product Manager", "Project Lead", "Software Engineer", "Software Engineer", "Software Engineer", "Software Engineer", "Test Engineer", "Technical Writer");
		staff.fillPosition("President", new PersonP("Me", "Last", "The Top, Lonely At"));
		staff.fillPosition("Project Lead", new PersonP("Janet", "Planner", "The Burbs"));
		if(staff.positionAll("Software Engineer")){
			staff.fillPosition("Software Engineer", new PersonP("Bob", "Coder", "Bright Light City"));
		}
		System.out.println(staff);
	}

}

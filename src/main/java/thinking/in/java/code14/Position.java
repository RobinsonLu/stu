package thinking.in.java.code14;

public class Position {
	
	private String title;
	private PersonP personp;
	
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public PersonP getPersonp() {
		return personp;
	}
	public void setPersonp(PersonP personp) {
		this.personp = personp;
		if(this.personp == null){
			personp = PersonP.NULL;
		}
	}
	public Position(String jobTitle, PersonP employee){
		title = jobTitle;
		personp = employee;
		if(personp == null){
			personp = PersonP.NULL;
		}
	}
	public Position(String jobTitle){
		title = jobTitle;
		personp = PersonP.NULL;
	}
	
	public String toString(){
		return "Position : " + title + " " + personp;
	}
}

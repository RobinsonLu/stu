package thinking.in.java.code14;

public class Individual implements Comparable<Individual> {

	private static long counter = 0;
	private final long id = counter++;
	private String name;
	
	public Individual() {
		// TODO Auto-generated constructor stub
	}
	
	public Individual(String name){
		this.name = name;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getClass().getSimpleName() + (name == null? "":" " +name);
	}
	
	public long id(){
		return id;
	}
	
	public boolean equals(Object o){
		return o instanceof Individual && id == ((Individual)o).id;
	}
	
	public int hashCode(){
		int result = 0;
		if(null != name){
			result = 37 * result + name.hashCode();
			result = 37 * result + (int)id;
		}
		return result;
	}
	
	public int compareTo(Individual arg) {
		// TODO Auto-generated method stub
		String first = getClass().getSimpleName();
		String argFirst = arg.getClass().getSimpleName();
		int firstCompare = first.compareTo(argFirst);
		
		if(0 !=firstCompare){
			return firstCompare;
		}
		
		if(null != name && null != arg.name){
			int secondCompare = name.compareTo(arg.name);
			if(0 != secondCompare){
				return secondCompare;
			}
		}
		return (arg.id < id? -1:(arg.id == id? 0:1));
	}
	
}

package thinking.in.java.code14;

import java.util.ArrayList;
import java.util.List;

public class FilledList<T> {

	private Class<T> type;
	public FilledList(Class<T> type){
		this.type = type;
	}
	public List<T> create(int nElements){
		List<T> result = new ArrayList<T>();
		
		try{
			for(int i=0; i<nElements;i++){
				result.add(type.newInstance());
			}
		}catch(Exception e){
			throw new RuntimeException();
		}
		
		return result;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FilledList<CountedInteger> fl = 
			new FilledList<CountedInteger>(CountedInteger.class);
		System.out.println(fl.create(15));
	}

}

class CountedInteger{
	private static long counter;
	private final long id = counter++;
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return Long.toString(id);
	}
}

package thinking.in.java.code11;

import java.util.ArrayList;

public class ApplesAndOrangesWithoutGenerics {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		ArrayList apples = new ArrayList();
//		for(int i=0; i<3; i++){
//			apples.add(new Apple());
//		}
//		apples.add(new Orange());
//		
//		for(int i=0; i<apples.size(); i++){
//			long id = ((Apple)apples.get(i)).id();
//			System.out.println(id);
//		}
		
		
		ArrayList<Apple> apples = new ArrayList<Apple>();
		
		for(int i=0; i<3; i++){
			apples.add(new Apple());
		}
//		apples.add(new Orange());
		for(int i=0; i<apples.size(); i++){
			System.out.println(apples.get(i).id());
		}
		
		for (Apple apple : apples) {
			System.out.println(apple.id());
		}
	}

}


class Apple{
	private static long counter;
	private final long id = counter++;
	public long id(){ return id;}
}

class Orange{}
package thinking.in.java.code15;

import java.util.Iterator;
import java.util.Random;

import net.mindview.util.Generator;

public class CoffeeGenerator implements Generator<Coffee>, Iterable<Coffee>{

	/**
	 * @param args
	 */
	private Class[] types = { Latte.class, Mocha.class, Cappuccino.class, Americano.class,
			Breve.class};
	private static Random rand = new Random(47);
	public CoffeeGenerator(){}
	private int size = 0;
	public CoffeeGenerator(int sz){ size = sz; }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CoffeeGenerator gen = new CoffeeGenerator();
		for(int i = 0; i < 5; i++){
			System.out.println(gen.next());
		}
		for(Coffee c : new CoffeeGenerator(5)){
			System.out.println(c);
		}
	}
	class CoffeeIterator implements Iterator<Coffee>{
		int count = size;

		public boolean hasNext() {
			// TODO Auto-generated method stub
			return count > 0;
		}

		public Coffee next() {
			// TODO Auto-generated method stub
			count--;
			return CoffeeGenerator.this.next();
		}

		public void remove() {
			// TODO Auto-generated method stub
			throw new UnsupportedOperationException();
		}
		
	}
	public Coffee next() {
		// TODO Auto-generated method stub
		try{
			return (Coffee)types[rand.nextInt(types.length)].newInstance();
		}catch(Exception e){
			throw new RuntimeException(e);
		}
	}

	public Iterator<Coffee> iterator() {
		// TODO Auto-generated method stub
		return new CoffeeIterator();
	}

}

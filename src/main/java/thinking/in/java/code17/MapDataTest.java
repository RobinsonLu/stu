package thinking.in.java.code17;

import java.util.Iterator;

import thinking.in.java.code16.CountingGenerator;
import thinking.in.java.code16.RandomGenerator;

import net.mindview.util.Generator;

public class MapDataTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(MapData.map(new Letters(), 11));
		System.out.println(MapData.map(new CountingGenerator.Character(), new RandomGenerator.String(3), 8));
		System.out.println(MapData.map(new CountingGenerator.Character(), "Value", 6));
		System.out.println(MapData.map(new Letters(), new RandomGenerator.String(3)));
		System.out.println(MapData.map(new Letters(), "Pop"));
	}

}

class Letters implements Generator<Pair<Integer, String>>, Iterable<Integer>{
	private int size = 9;
	private int number = 1;
	private char letter = 'A';
	public Pair<Integer, String> next(){
		return new Pair<Integer, String>(number++, "" + letter++);
	}
	public Iterator<Integer> iterator(){
		return new Iterator<Integer>(){
			public Integer next(){ return number++; }
			public boolean hasNext(){ return number < size; }
			public void remove(){ throw new UnsupportedOperationException(); }
		};
	}
} 
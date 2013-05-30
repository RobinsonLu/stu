package thinking.in.java.code11;

import java.util.AbstractCollection;
import java.util.Iterator;

import thinking.in.java.code14.Pet;
import thinking.in.java.code14.Pets;

public class CollectionSequence extends AbstractCollection<Pet>{

	private Pet[] pets = Pets.createArray(8);
	
	public int size(){
		return pets.length;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CollectionSequence c = new CollectionSequence();
		InterfaceVsIterator.display(c);
		InterfaceVsIterator.display(c.iterator());
	}
	@Override
	public Iterator<Pet> iterator() {
		// TODO Auto-generated method stub
		return new Iterator<Pet>(){

			private int index = 0;
			public boolean hasNext() {
				// TODO Auto-generated method stub
				return index < pets.length;
			}
			public Pet next() {
				// TODO Auto-generated method stub
				return pets[index++];
			}
			public void remove() {
				// TODO Auto-generated method stub
				throw new UnsupportedOperationException();
			}
			
		};
	}

	
}

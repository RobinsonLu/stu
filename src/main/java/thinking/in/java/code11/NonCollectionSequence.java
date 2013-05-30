package thinking.in.java.code11;

import java.util.Iterator;

import thinking.in.java.code14.Pet;
import thinking.in.java.code14.Pets;

public class NonCollectionSequence extends PetSequence{

	public static void main(String[] args) {
		NonCollectionSequence nc = new NonCollectionSequence();
		InterfaceVsIterator.display(nc.iterator());
	}
	
	public Iterator<Pet> iterator(){
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

class PetSequence{
	protected Pet[] pets = Pets.createArray(8);
}
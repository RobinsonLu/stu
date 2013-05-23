package thinking.in.java.code15;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class FillTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Contract> contracts = new ArrayList<Contract>();
		Fill.fill(contracts, Contract.class, 3);
		Fill.fill(contracts, Contract.class, 5);
		for(Contract c : contracts) {
			System.out.println(c);
		}
		SimpleQueue<Contract> contractQueue = new SimpleQueue<Contract>();
//		Fill.fill(contractQueue, Contract.class, 3);
	}

}

class Fill {
	public static <T> void fill(Collection<T> collection, Class<? extends T> classToken, int size) {
		for(int i = 0; i < size; i++) {
			try {
				collection.add(classToken.newInstance());
			} catch(Exception e) {
				throw new RuntimeException(e);
			}
		}
	}
}
class Contract {
	private static long counter = 0;
	private final long id = counter++;
	@Override
	public String toString() {
		return getClass().getName() + " " + id;
	}
}
class TitleTransfer extends Contract {}
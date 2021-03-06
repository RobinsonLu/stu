package thinking.in.java.code21;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import net.mindview.util.CountingGenerator;

import thinking.in.java.code17.MapData;

public class MapComparisons {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Tester.initMain(args);
		new SynchronizedHashMapTest(10, 0);
		new SynchronizedHashMapTest(9, 1);
		new SynchronizedHashMapTest(5, 5);
		new ConcurrentHashMapTest(10, 0);
		new ConcurrentHashMapTest(9, 1);
		new ConcurrentHashMapTest(5, 5);
		Tester.exec.shutdown();
	}

}

abstract class MapTest extends Tester<Map<Integer, Integer>> {
	MapTest(String testId, int nReaders, int nWriters) {
		super(testId, nReaders, nWriters);
	}
	
	class Reader extends TestTask {
		long result = 0;
		
		@Override
		void test() {
			for(long i = 0; i < testCycles; i++) {
				for(int index = 0; index < containerSize; index++) {
					result += testContainer.get(index);
				}
					
			}
		}
		
		@Override
		void putResults() {
			readResult += result;
			readTime += duration;
		}
	}
	
	class Writer extends TestTask {
		@Override
		void test() {
			for(long i = 0; i < testCycles; i++) {
				for(int index = 0; index < containerSize; index++) {
					testContainer.put(index, writeData[index]);
				}
			}
		}
		
		@Override
		void putResults() {
			for(int i = 0; i < nReaders; i++) {
				exec.execute(new Reader());
			}
			
			for(int i = 0; i< nWriters; i++) {
				exec.execute(new Writer());
			}
		}
	}
}

class SynchronizedHashMapTest extends MapTest {
	@Override
	Map<Integer, Integer> containerInitializer() {
		return Collections.synchronizedMap(new HashMap<Integer, Integer>(
				MapData.map(new CountingGenerator.Integer(), new CountingGenerator.Integer(), containerSize)));
	}
	
	SynchronizedHashMapTest(int nReaders, int nWriters) {
		super("Synched HashMap", nReaders, nWriters);
	}

	@Override
	void startReadersAndWriters() {
		// TODO Auto-generated method stub
		
	}
}

class ConcurrentHashMapTest extends MapTest {
	ConcurrentHashMapTest(int iReaders, int iWriters) {
		super("ConcurrentHashMap", iReaders, iWriters);
	}

	@Override
	Map<Integer, Integer> containerInitializer() {
		return new ConcurrentHashMap<Integer, Integer>(MapData
				.map(new CountingGenerator.Integer(), new CountingGenerator.Integer(), containerSize));
	}
	
	@Override
	void startReadersAndWriters() {
		// TODO Auto-generated method stub
		
	}
}
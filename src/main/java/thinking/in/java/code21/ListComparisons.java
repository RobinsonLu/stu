package thinking.in.java.code21;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import net.mindview.util.CountingIntegerList;

public class ListComparisons {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Tester.initMain(args);
		new SynchronizedArrayListTest(10, 0);
		new SynchronizedArrayListTest(9, 1);
		new SynchronizedArrayListTest(5, 5);
		new SynchronizedArrayListTest(10, 0);
		new SynchronizedArrayListTest(9, 1);
		new SynchronizedArrayListTest(5, 5);
		Tester.exec.shutdown();
	}

}

abstract class ListTest extends Tester<List<Integer>>{
	ListTest(String testId, int nReaders, int nWriters){
		super(testId, nReaders, nWriters);
	}
	class Reader extends TestTask{
		long result = 0;
		void test(){
			for (int i = 0; i < testCycles; i++) {
				for (int index = 0; index < containerSize; index++) {
					result += testContainer.get(index);
				}
			}
		}
		void putResults(){
			readResult += result;
			readTime += duration;
		}
	}
	class Writer extends TestTask{
		void test(){
			for (int i = 0; i < testCycles; i++) {
				for (int index = 0; index < containerSize; index++) {
					testContainer.set(index, writeData[index]);
				}
			}
		}
		void putResults(){
			writeTime += duration;
		}
	}
	void startReadersAndWriters(){
		for (int i = 0; i < nReaders; i++) {
			exec.execute(new Reader());
		}
		for (int i = 0; i < nWriters; i++) {
			exec.execute(new Writer());
		}
	}
}

class SynchronizedArrayListTest extends ListTest{
	List<Integer> containerInitializer(){
		return Collections.synchronizedList(new ArrayList<Integer>(new CountingIntegerList(containerSize)));
	}
	SynchronizedArrayListTest(int nReaders, int nWriters) {
		super("Synched ArrayList", nReaders, nWriters);
	}
}

class CopyOnWriterArrayListTest extends ListTest{
	List<Integer> containerInitializer(){
		return new CopyOnWriteArrayList<Integer>(new CountingIntegerList(containerSize));
	}
	CopyOnWriterArrayListTest(int nReaders, int nWriters){
		super("CopyOnWriterArrayList", nReaders, nWriters);
	}
}
package thinking.in.java.code11;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class QueueDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> queue = new LinkedList<Integer>();
		Random rand = new Random();
		for(int i = 0; i < 10; i++){
			queue.offer(rand.nextInt(i + 10));
		}
		printQ(queue);
		
		Queue<Character> qc = new LinkedList<Character>();
		for(Character c : "Brontosaurus".toCharArray()){
			qc.offer(c);
		}
		printQ(qc);
	}

	public static void printQ(Queue<?> queue){
		while(null != queue.peek()){
			System.out.print(queue.remove() + " ");
		}
		System.out.println();
	}
}
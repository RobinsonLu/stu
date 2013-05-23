package thinking.in.java.code15;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Random;

import net.mindview.util.Generator;

public class BankTeller {

	/**
	 * @param args
	 */
	public static void server(Teller t, Customer c){
		System.out.println(t + " server " + c);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random(47);
		Queue<Customer> line = new LinkedList<Customer>();
		Generators.fill(line, Customer.generator(), 15);
		List<Teller> tellers = new ArrayList<Teller>();
		Generators.fill(tellers, Teller.generator, 4);
		for(Customer c : line){
			server(tellers.get(rand.nextInt(tellers.size())), c);
		}
	}

}

package thinking.in.java.code15;

import net.mindview.util.Generator;

public class Customer {

	private static long counter = 1;
	private final long id = counter++;
	private Customer(){}
	public String toString(){
		return "Customer " + id;
	}
	public static Generator<Customer> generator(){
		return new Generator<Customer>(){
			public Customer next(){ return new Customer(); }
		};
	}
}

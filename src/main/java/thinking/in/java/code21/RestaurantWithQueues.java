package thinking.in.java.code21;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.TimeUnit;

import cn.haohaowo.entity.Course;
import cn.haohaowo.entity.Food;


public class RestaurantWithQueues {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		ExecutorService exec = Executors.newCachedThreadPool();
		Restaurant1 restaurant = new Restaurant1(exec, 5, 2);
		exec.execute(restaurant);
		if(args.length > 0) {
			TimeUnit.SECONDS.sleep(new Integer(args[0]));
		} else {
			System.out.println("Press 'Enter' to quit");
			System.in.read();
		}
		exec.shutdown();
	}

}

class Order{
	private static int counter = 0;
	private final int id = counter++;
	private final Customer2 customer;
	private final WaitPerson1 waitPerson;
	private final Food food;
	public Order(Customer2 cust, WaitPerson1 wp, Food f){
		customer = cust;
		waitPerson = wp;
		food = f;
	}
	public Food item(){ return food; }
	public Customer2 getCustomer(){ return customer; }
	public WaitPerson1 getWaitPerson(){ return waitPerson; }
	public String toString(){
		return "Order: " + id + " item: " + food + " for: " + customer + " served by: " + waitPerson;
	}
}

class Plate{
	private final Order order;
	private final Food food;
	
	public Plate(Order ord, Food f){
		order = ord;
		food = f;
	}
	
	public Order getOrder(){ return order; }
	public Food getFood(){ return food; }
	public String toString(){ return food.toString(); }
}

class Customer2 implements Runnable {
	private static int counter = 0;
	private final int id = counter++;
	private final WaitPerson1 waitPerson;
	private SynchronousQueue<Plate> placesSetting = new SynchronousQueue<Plate>();
	
	public Customer2(WaitPerson1 w) { waitPerson = w; }
	
	public void deliver(Plate p) throws InterruptedException {
		placesSetting.put(p);
	}
	
	public void run() {
		for(Course course : Course.values()) {
			Food food = course.randomSelection();
			try {
				waitPerson.placeOrder(this, food);
				System.out.println(this + "eating " + placesSetting.take());
			} catch (InterruptedException e) {
				System.out.println(this + "waiting for " + course + " iterrupted");
			}
		}
		System.out.println(this + " finished meal, leaving");
	}
	
	@Override
	public String toString() {
		return "Customer " + id + " ";
	}
}

class WaitPerson1 implements Runnable {
	private static int counter = 0;
	private final int id = counter++;
	private final Restaurant1 restaurant;
	BlockingQueue<Plate> filledOrders = new LinkedBlockingQueue<Plate>();
	
	public WaitPerson1(Restaurant1 rest) { restaurant = rest; }
	public void placeOrder(Customer2 cust, Food food) {
		try {
			restaurant.orders.put(new Order(cust, this, food));
		} catch(InterruptedException e) {
			System.out.println(this + " placeOrder interrupted");
		}
	}
	
	public void run() {
		try {
			while(!Thread.interrupted()) {
				Plate plate = filledOrders.take();
				System.out.println(this + " received " + plate + " delivering to " +
						plate.getOrder().getCustomer());
				plate.getOrder().getCustomer().deliver(plate);
			}
		} catch(InterruptedException e) {
			System.out.println(this + " interrupted");
		}
		System.out.println(this + " off duty");
	}
	
	@Override
	public String toString() {
		return "WaitPerson " + id + " ";
	}
}

class Chef1 implements Runnable {
	private static int counter = 0;
	private final int id = counter++;
	private final Restaurant1 restaurant;
	private static Random rand = new Random(47);
	public Chef1(Restaurant1 rest) { restaurant = rest; }
	
	public void run() {
		try {
			while(!Thread.interrupted()) {
				Order order = restaurant.orders.take();
				Food requestedItem = order.item();
				TimeUnit.MILLISECONDS.sleep(rand.nextInt(500));
				Plate plate = new Plate(order, requestedItem);
				order.getWaitPerson().filledOrders.put(plate);
			}
		} catch(InterruptedException e) {
			System.out.println(this + " interrupted");
		}
		System.out.println(this + " off duty");
	}
	
	@Override
	public String toString() {
		return "Chef " + id + " ";
	}
}

class Restaurant1 implements Runnable {
	private List<WaitPerson1> waitPesons = new ArrayList<WaitPerson1>();
	private List<Chef1> chefs = new ArrayList<Chef1>();
	private ExecutorService exec;
	private static Random rand = new Random(47);
	BlockingQueue<Order> orders = new LinkedBlockingQueue<Order>();
	
	public Restaurant1(ExecutorService e, int nWaitPersons, int nChefs) {
		exec = e;
		for(int i = 0; i < nWaitPersons; i++) {
			WaitPerson1 waitPerson = new WaitPerson1(this);
			waitPesons.add(waitPerson);
			exec.execute(waitPerson);
		}
		for(int i = 0; i < nChefs; i++) {
			Chef1 chef = new Chef1(this);
			chefs.add(chef);
			exec.execute(chef);
		}
	}
	
	public void run() {
		try {
			while(!Thread.interrupted()) {
				WaitPerson1 wp = waitPesons.get(rand.nextInt(waitPesons.size()));
				Customer2 c = new Customer2(wp);
				exec.execute(c);
				TimeUnit.MILLISECONDS.sleep(100);
			}
		} catch(InterruptedException e) {
			System.out.println("Restaurant iterrupted");
		}
		System.out.println("Restaurant closing");
	}
}
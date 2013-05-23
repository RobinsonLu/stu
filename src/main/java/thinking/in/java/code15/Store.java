package thinking.in.java.code15;

import java.util.ArrayList;
import java.util.Random;

import net.mindview.util.Generator;

public class Store extends ArrayList<Aisle> {

	/**
	 * @param args
	 */
	private ArrayList<CheckoutStand> checkouts = new ArrayList<CheckoutStand>();
	private Office office = new Office();
	public Store(int nAisle, int nShelves, int nProducts){
		for(int i = 0; i < nAisle; i++){
			add(new Aisle(nShelves, nProducts));
		}
	}
	public String toString(){
		StringBuilder result = new StringBuilder();
		for(Aisle a : this){
			for(Shelf s : a){
				for(Product p : s){
					result.append(p);
					result.append("\n");
				}
			}
		}
		return result.toString();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new Store(14, 5, 10));
	}

}

class Product{
	private final int id;
	private String description;
	private double price;
	public Product(int IDnumber, String descr, double price){
		this.id = IDnumber;
		this.description = descr;
		this.price = price;
		System.out.println(toString());
	}
	public String toString(){
		return id + " : " + description + " , price : $" + price;
	}
	public void priceChange(double change){
		price += change;
	}
	public static Generator<Product> generator = new Generator<Product>(){
		private Random rand = new Random(47);
		public Product next(){
			return new Product(rand.nextInt(1000), "Test", 
					Math.round(rand.nextDouble() * 1000.0 + 0.99));
		}
	};
}

class Shelf extends ArrayList<Product>{
	public Shelf(int nProduct){
		Generators.fill(this, Product.generator, nProduct);
	}
}

class Aisle extends ArrayList<Shelf>{
	public Aisle(int nShelves, int nProduct){
		for(int i = 0; i < nShelves; i++){
			add(new Shelf(nProduct));
		}
	}
}

class CheckoutStand{}
class Office{}

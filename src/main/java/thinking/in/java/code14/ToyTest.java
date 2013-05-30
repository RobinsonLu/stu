package thinking.in.java.code14;

public class ToyTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class c = null;
		
		try{
			c = Class.forName("thinking.in.java.code14.FancyToy");
		}catch(ClassNotFoundException e){
			System.out.println("Can't find FancyToy!!");
			System.exit(1);
		}
		printInfo(c);
		
		for (Class face : c.getInterfaces()) {
			printInfo(face);
		}
		
		Class up = c.getSuperclass();
		Object obj = null;
		
		try{
			obj = up.newInstance();
		}catch(IllegalAccessException e){
			System.out.println("Cann't access!");
			System.exit(1);
		}catch(InstantiationException e){
			System.out.println("Cann't instantiate!!");
			System.exit(1);
		}
		printInfo(obj.getClass());
	}
	
	static void printInfo(Class cc){
		System.out.println("Class name: " + cc.getName() + " is interface ? [ " +
				cc.isInterface()+" ]");
		System.out.println("Simple name: " + cc.getSimpleName());
		System.out.println("Canonical name: " + cc.getCanonicalName());
	}

}


interface HasBatteries{}
interface Waterproof{}
interface Shoots{}

class Toy{
	public Toy() {
		// TODO Auto-generated constructor stub
	}
	public Toy(int i){}
}

class FancyToy extends Toy implements HasBatteries, Waterproof, Shoots{
	public FancyToy() {
		// TODO Auto-generated constructor stub
		super(1);
	}
}
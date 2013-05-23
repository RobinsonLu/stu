package thinking.in.java.code17;

public class RandomBounds {

	static void usage(){
		System.out.print("Usage");
		System.out.print("\tRandomBounds lower");
		System.out.print("\tRandomBounds upper");
		System.exit(1);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length != 1) usage();
		if(args[0].equals("lower")){
			while(Math.random() != 0.0);
			System.out.println("Produced 0.0!");
		}else if(args[0].equals("upper")){
			while(Math.random() != 1.0);
			System.out.println("Produced 1.0!");
		}else{
			usage();
		}
	}

}

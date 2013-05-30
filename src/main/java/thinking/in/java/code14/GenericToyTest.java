package thinking.in.java.code14;

public class GenericToyTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Class<FancyToy> ftClass = FancyToy.class;
		FancyToy fancyToy = ftClass.newInstance();
		Class<? super FancyToy> up = ftClass.getSuperclass();
//		Class<Toy> up2 = ftClass.getSuperclass();
		Object obj = up.newInstance();
	}

}

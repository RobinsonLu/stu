package thinking.in.java.code15;

public class InstantiateGenericType {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ClassAsFactory<Employee> fe = new ClassAsFactory<Employee>(Employee.class);
		System.out.println("ClassAsFactory<Employee> successed");
		try {
			ClassAsFactory<Integer> fi = new ClassAsFactory<Integer>(Integer.class);
		} catch(Exception e) {
			System.out.println("ClassAsFactory<Integer> failed");
		}
	}

}

class ClassAsFactory<T> {
	T x;
	
	public ClassAsFactory(Class<T> kind) {
		try {
			x = kind.newInstance();
		} catch(Exception e) {
			throw new RuntimeException(e);
		}
	}
}

class Employee {}
package thinking.in.java.code11;

public class StackTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<String> stack = new Stack<String>();
		for(String s : "My dog has fleas".split(" ")){
			stack.push(s);
		}
		
		while(!stack.empty()){
			System.out.print(stack.pop() + " ");
		}
	}

}

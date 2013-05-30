package thinking.in.java.code11;

public class StackCollision {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<String> stack1 = new Stack<String>();
		java.util.Stack<String> stack2 = new java.util.Stack<String>();
		
		for(String s : "My dog has fleas".split(" ")){
			stack1.push(s);
			stack2.push(s);
		}
		while(!stack1.empty()){
			System.out.print(stack1.pop() + " ");
		}
		System.out.println();
		while(!stack2.empty()){
			System.out.print(stack2.pop() + " ");
		}
	}

}

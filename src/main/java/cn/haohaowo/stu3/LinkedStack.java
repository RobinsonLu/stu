package cn.haohaowo.stu3;

public class LinkedStack<T> {

	/**
	 * @param args
	 */
	public Node<T> top = new Node<T>();
	public static void main(String[] args) 
	{
		LinkedStack<String> ls = new LinkedStack<String>();
		for(String s:"Person is max ! !".split(" "))
		{
			ls.push(s);
		}
		String str = null;
		while((str = ls.pop())!= null)
		{
			System.out.println(str);
		}
	}
	private static class Node<U>
	{
		U item;
		Node<U> next;
		Node()
		{
			item = null;
			next = null;
		}
		Node(U item,Node<U> next)
		{
			this.item = item;
			this.next = next;
		}
		boolean end()
		{
			return item == null&&next == null;
		}
	}


	public void push(T item)
	{
		top = new Node<T>(item,top);
	}
	public T pop()
	{
		T result = top.item;
		if(!top.end())
		{
			top = top.next;
		}
		return result;
	}
}

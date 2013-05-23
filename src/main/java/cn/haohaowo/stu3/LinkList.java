package cn.haohaowo.stu3;

public class LinkList<T> {

	/**
	 * @param args
	 */
	private StringBuffer sb = null;
	private int i = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkList ll = new LinkList();
		ll.add("1");
		ll.add("2");
		ll.add("3");
		ll.insert(1, "1.0f");
		for(char c:ll.list())
		{
			System.out.println(c);
		}

	}
	private void add(T t)
	{
		sb.append(t);
	}
	private int length()
	{
		i = sb.length();
		return i;
	}
	private void insert(int index,T t)
	{
		sb.insert(index, t);
	}
	private char[] list()
	{
		char[] c = new char[i];
		while(i-- >0)
		{
			c[i] = sb.charAt(i);
		}
		return c;
	}
}

package cn.haohaowo.stu3;

public class TestStringBuffer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer();
		sb.append("a");
		sb.append("b");
		sb.append("c");
		sb.insert(1, 'a');
		System.out.println(sb.length());
		int i = sb.length();
		while(i -- > 0)
		{
			System.out.println(i+"----"+sb.charAt(i));
		}
	}
}

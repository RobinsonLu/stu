package cn.haohaowo.stu3;

public class TestHolder3 <T> {

	/**
	 * @param args
	 */
	private T content;
	public TestHolder3(T content)
	{
		this.content = content;
	}
	
	public void setContent(T content)
	{
		this.content = content;
	}
	public T getContent()
	{
		return content;
	}
	
	public static void main(String[] args) 
	{
		TestHolder3<Car> h31 = new TestHolder3<Car>(new Car());
		Car bmw = h31.getContent();
		
		Person p = new Person();
//		h31.setContent(p);
	}

}

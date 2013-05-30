package cn.haohaowo.stu3;

public class TestHolder2 {

	/**
	 * @param args
	 */
	private Object content;
	
//	public TestHolder2(Object content)
//	{
//		this.content = content;
//	}
	public Object getContent()
	{
		return content;
	}
	public void setContent(Object content)
	{
		this.content = content;
	}
	
	public static void main(String[] args) 
	{
		TestHolder2 h21 = new TestHolder2();
		h21.setContent(new Car());
		Car bm = (Car)h21.getContent();
		
		TestHolder2 h22 = new TestHolder2();
		h22.setContent(new Person());
		Person ren = (Person)h22.getContent();
		
	}

}

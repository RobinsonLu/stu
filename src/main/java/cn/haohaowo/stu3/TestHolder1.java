package cn.haohaowo.stu3;

public class TestHolder1 {

	/**
	 * @param args
	 */
	private Car content;
	public void setContent(Car content)
	{
		this.content = content;
	}
	public Car getContent()
	{
		return content;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car();
		TestHolder1 h1 = new TestHolder1();
		h1.setContent(new Car());
	}

}

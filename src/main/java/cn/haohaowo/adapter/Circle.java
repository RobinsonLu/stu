package cn.haohaowo.adapter;

public class Circle extends Shape {
	
	private AnotherCircle anotherCircle = new AnotherCircle();

	@Override
	public void draw() {
		anotherCircle.dodraw();
	}

}

package cn.haohaowo.adapter;

import java.util.ArrayList;
import java.util.List;

public class Clients {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Shape> shapes = new ArrayList<Shape>();
		shapes.add(new Square());
		shapes.add(new Triangle());
		shapes.add(new Circle());
		
		for (Shape shape : shapes) {
			shape.draw();
		}
	}

}

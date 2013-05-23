package cn.haohaowo.stu3;
//import java.util.*;

public class TestMothod {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TestMothod tm = new TestMothod();
		Car car = new Car();
		tm.f("abc");
		tm.f('a');
		tm.f(1);
		tm.f(3f);
		tm.f(1.0);
		tm.f(car);
		tm.f(tm);

	}
//	·ºÐÍ·½·¨
	public <T> void f(T t)
	{
		System.out.println("Type name is :"+t.getClass().getName());
	}
}

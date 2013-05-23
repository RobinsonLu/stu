package cn.haohaowo.stu1;

import java.io.Serializable;

public class UsePerson implements Serializable,Person{

	private String name;
	private int age;
	public int getAge() {
		// TODO Auto-generated method stub
		return age;
	}

	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	public void setAge(int age) {
		// TODO Auto-generated method stub
		this.age = age;
	}

	public void setName(String name) {
		// TODO Auto-generated method stub
		this.name = name;
	}
	public String toString()
	{
		return "name:"+name+" age:"+age;
	}
}

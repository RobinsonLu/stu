package cn.haohaowo.stu1;

public class Student implements Teacher {

	public Javateacher getJava() {
		// TODO Auto-generated method stub
		return new Javateacher();
	}

	public Mathteacher getMath() {
		// TODO Auto-generated method stub
		return new Mathteacher();
	}

}

package cn.haohaowo.stu1;

public class StudentTest 
{
	public static void main(String[] arg)
	{
		Teacher su = new Student();
		String mathsu = su.getJava().getjavastudent();
		String javasu = su.getMath().getmathstudent();
		System.out.println(mathsu);
		System.out.println(javasu);
	}
}

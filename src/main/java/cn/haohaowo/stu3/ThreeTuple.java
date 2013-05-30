package cn.haohaowo.stu3;


public class ThreeTuple<A,B,C> extends TwoTuple<A,B>
{
	public final C Third;
	
	public ThreeTuple(A First,B Second,C Third)
	{
		super(First,Second);
		this.Third  = Third;
	}
	public String toString()
	{
		return "( "+First+" , "+Second+" , "+Third+" )";
	}
}

package cn.haohaowo.stu3;

public class TwoTuple <A,B>{
	public final A First;
	public final B Second;
	
	public TwoTuple(A First,B Second)
	{
		this.First = First;
		this.Second = Second;
	}
	
	public String toString()
	{
		return "( "+First+" , "+Second+" )";
	}
}

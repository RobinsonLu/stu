package cn.haohaowo.stu3;

public class Gen <T>
{
	private T obj;
	
	public Gen(T obj)
	{
		this.obj = obj;
	}
	public T getObj()
	{
		return obj;
	}
	public void setObj()
	{
		this.obj = obj;
	}
	
	public void showType()
	{
		System.out.println("Type of T is :"+obj.getClass().getName());
	}
}

package cn.haohaowo.stu1;

public class ThrowsMyException extends Exception 
{
	public ThrowsMyException()
	{
		super();
	}
	public ThrowsMyException(String message,Throwable cause)
	{
		super(message,cause);
	}
	public ThrowsMyException(String message)
	{
		super(message);
	}
	public ThrowsMyException(Throwable cause)
	{
		super(cause);
	}
}

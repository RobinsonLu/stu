package cn.haohaowo.stu3;

public class Stats<T extends Number> 
{
	private T[] nums;
	
	public Stats(T[] obj)
	{
		this.nums = obj;
	}
	
	public double average()
	{
		double sum = 0.0;
		for(T num:nums)
		{
			sum += num.doubleValue();
		}
		return sum/nums.length;
	}
}

package cn.haohaowo.stu3;

public interface MaxMin <T extends Comparable<T>>
{
	public abstract T min();
	public abstract T max();
}

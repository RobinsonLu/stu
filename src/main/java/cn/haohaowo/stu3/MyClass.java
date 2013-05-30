package cn.haohaowo.stu3;


//·ºÐÍ½Ó¿Ú
public class MyClass<T extends Comparable<T>> implements MaxMin<T>
{

	private T[] vals;
	public MyClass(T[] obj)
	{
		vals = obj;
	}
	public T max() {
		// TODO Auto-generated method stub
		T v = vals[0];
		for(T val:vals)
		{
			if(val.compareTo(v)>0)
			{
				v = val;
			}
		}
		return v;
	}

	public T min() {
		// TODO Auto-generated method stub
		T v = vals[0];
		for(T val:vals)
		{
			if(val.compareTo(v)<0)
			{
				v = val;
			}
		}
		return v;
	}

}

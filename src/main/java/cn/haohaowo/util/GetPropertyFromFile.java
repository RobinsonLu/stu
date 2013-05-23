package cn.haohaowo.util;

import java.util.Properties;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileNotFoundException;

public class GetPropertyFromFile
{
	public static String getPropertyValue(String propertyname)
	{
		String propertyValue = null;
		Properties prop = new Properties();
		try
		{
			FileInputStream in = new FileInputStream("src/cn/haohaowo/util/dbinfor.properties");
			//读取文件,获得数据流,在Eclipse中文件读取是从项目的根目录开始
			prop.load(in);
			//载入
			propertyValue = prop.getProperty(propertyname);
			//获得属性表中属性的值
		}
		catch(FileNotFoundException e)
		{
			System.out.println("没有文件");
			e.printStackTrace();
		}
		catch(IOException e)
		{
			System.out.println("读取有误");
			e.printStackTrace();
		}
		return propertyValue;
	}
}

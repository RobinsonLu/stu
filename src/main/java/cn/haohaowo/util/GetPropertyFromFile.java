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
			//��ȡ�ļ�,���������,��Eclipse���ļ���ȡ�Ǵ���Ŀ�ĸ�Ŀ¼��ʼ
			prop.load(in);
			//����
			propertyValue = prop.getProperty(propertyname);
			//������Ա������Ե�ֵ
		}
		catch(FileNotFoundException e)
		{
			System.out.println("û���ļ�");
			e.printStackTrace();
		}
		catch(IOException e)
		{
			System.out.println("��ȡ����");
			e.printStackTrace();
		}
		return propertyValue;
	}
}

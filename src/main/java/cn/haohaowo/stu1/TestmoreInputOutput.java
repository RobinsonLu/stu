package cn.haohaowo.stu1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestmoreInputOutput {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			FileReader fr1 = new FileReader("D:\\mydb.sql");
			FileReader fr2 = new FileReader("D:\\out.txt");
			BufferedReader br1 = new BufferedReader(fr1);
			BufferedReader br2 = new BufferedReader(fr2);
			FileWriter fw = new FileWriter("D:\\output.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			
			String str1 = br1.readLine();
			String str2 = br2.readLine();
			while(str1!=null)
			{
				bw.write(str1);
				bw.newLine();
				str1 = br1.readLine();
			}
			fr1.close();
			br1.close();
			while(str2 != null)
			{
				bw.write(str2);
				bw.newLine();
				str2 = br2.readLine();
			}
			
			fr2.close();
//			fr1.close();
//			br1.close();
			br2.close();
			bw.close();
			fw.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}

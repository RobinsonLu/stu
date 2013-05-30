package cn.haohaowo.stu1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import thinking.in.java.code18.FilterTest;

public class TestFileReader {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			FileReader fr = new FileReader("D://input.txt");
			FileWriter fw = new FileWriter("D://output.txt");
			BufferedReader br = new BufferedReader(fr);
			BufferedWriter bw = new BufferedWriter(fw);
			
			String s = br.readLine();
			while(s!=null)
			{
				s = s.replaceAll("[^A-Z_0-9]", "");
				s = s.replaceAll("[A-C]", "2");
				s = s.replaceAll("[D-F]", "3");
				s = s.replaceAll("[G-I]", "4");
				s = s.replaceAll("[J-L]", "5");
				s = s.replaceAll("[M-O]", "6");
				s = s.replaceAll("[P-S]", "7");
				s = s.replaceAll("[T-V]", "8");
				s = s.replaceAll("[W-Z]", "9");
				s = s.substring(0,3)+"-"+s.substring(3,7);
				System.out.println(s);
				bw.write(s);
				bw.newLine();
				s = br.readLine();
			}
			
			br.close();
			bw.close();
			fr.close();
			fw.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}

	}

}

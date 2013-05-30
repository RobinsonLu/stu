package cn.haohaowo.stu1;

import java.io.File;

public class TestFile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file1 = new File("D:\\");
		File file2 = new File("D:\\out.txt");
		
		System.out.println(file1.isFile());
		System.out.println(file2.isFile());
		System.out.println(file2.isDirectory());
		System.out.println(file2.canRead());
		System.out.println(file2.canWrite());
		System.out.println(file2.isHidden());
		
//		String[] filelist = file1.list();
//		for(String name:filelist)
//		{
//			System.out.println(name);
//		}
	}

}

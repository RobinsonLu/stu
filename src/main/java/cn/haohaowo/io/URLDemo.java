package cn.haohaowo.io;

import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class URLDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			URL url = new URL("http://haohaowo.iteye.com");
			Scanner in = new Scanner(url.openStream());
			while(in.hasNextLine()) {
				System.out.println(in.nextLine());
			}
		} catch(IOException e) {
			e.printStackTrace();
		}
	}

}

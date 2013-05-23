package cn.haohaowo.io;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class URLConnectionDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			URL url = new URL("http://www.google.com");
			URLConnection connection = url.openConnection();
			connection.setDoInput(true);
			connection.setDoOutput(true);
			connection.connect();
			System.out.println(connection.getContentType());
			System.out.println(connection.getContentEncoding());
			System.out.println(connection.getContentLength());
			System.out.println(connection.getDate());
			Scanner in = new Scanner(connection.getInputStream());
			while(in.hasNextLine()) {
				System.out.println(in.nextLine());
			}
		} catch(IOException e) {
			e.printStackTrace();
		}
	}

}

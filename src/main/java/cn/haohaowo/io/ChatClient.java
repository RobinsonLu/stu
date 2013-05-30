package cn.haohaowo.io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class ChatClient {

	private String host = "localhost";
	private int port = 8880;
	
	public ChatClient() {}
	public ChatClient(String host, int port) {
		this.host = host;
		this.port = port;
	}
	public void chat() {
		try{
			Socket socket = new Socket(host, port);
			try {
				DataInputStream in = new DataInputStream(socket.getInputStream());
				DataOutputStream out = new DataOutputStream(socket.getOutputStream());
				Scanner scan = new Scanner(System.in);
				while(true) {
					String send = scan.nextLine();
					System.out.println("客户端： " + send);
					out.writeUTF("客户端：" +send);
					String accpet = in.readUTF();
					System.out.println(accpet);
				}
			} finally {
					socket.close();
			}
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ChatClient().chat();
	}

}

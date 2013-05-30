package cn.haohaowo.io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ChatServer {

	private int port = 8880;
	public ChatServer() {}
	public ChatServer(int port) {
		this.port = port;
	}
	public void service(){
		try {
			ServerSocket server = new ServerSocket(port);
			Socket socket = server.accept();
			try {
				DataInputStream in = new DataInputStream(socket.getInputStream());
				DataOutputStream out = new DataOutputStream(socket.getOutputStream());
				Scanner scanner = new Scanner(System.in);
				while(true) {
					String accpet = in.readUTF();
					System.out.println(accpet);
					String send = scanner.nextLine();
					System.out.println("服务器：" + send);
					out.writeUTF("服务器：" + send);
				}
			} finally {
				socket.close();
			}
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ChatServer().service();
	}

}

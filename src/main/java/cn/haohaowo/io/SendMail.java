package cn.haohaowo.io;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import thinking.in.java.code22.SwingConsole;

public class SendMail extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4579831461060965488L;
	private JTextField from;
	private JTextField to;
	private JTextField server;
	private JTextArea message;
	private JTextArea comm;
	private Scanner in;
	private PrintWriter out;
	
	public SendMail() {
		setTitle("send mail");
		setVisible(true);
		this.setLocationRelativeTo(null);
		
		JPanel pl = new JPanel(new GridLayout(3, 2));
		pl.add(new JLabel("from"));
		from = new JTextField(20);
		pl.add(from);
		pl.add(new JLabel("to"));
		to = new JTextField(20);
		pl.add(to);
		pl.add(new JLabel("SMTP server"));
		server = new JTextField(20);
		pl.add(server);
		add(pl, BorderLayout.NORTH);
		
		JPanel p2 = new JPanel(new GridLayout(2, 1));
		message = new JTextArea();
		p2.add(new JScrollPane(message));
		comm = new JTextArea();
		comm.setEditable(false);
		p2.add(new JScrollPane(comm));
		add(p2, BorderLayout.CENTER);
		
		JPanel p3 = new JPanel();
		JButton sendButton = new JButton("Send");
		p3.add(sendButton);
		add(p3, BorderLayout.SOUTH);
		
		sendButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				comm.setText("");
				sendMail(server.getText().trim(), from.getText().trim(), to.getText().trim(), message.getText());
			}
		});
	}
	private void sendMail(String server, String from, String to, String message) {
		try {
			Socket socket = new Socket(server, 25);
			try {
				in = new Scanner(socket.getInputStream());
				out = new PrintWriter(socket.getOutputStream(), true);
				String host = InetAddress.getLocalHost().getHostName();
				receive();
				send("HELLO" + host);
				receive();
				send("MAIL FROM:<" + from + ">");
				receive();
				send("RCPT TO:<" + to + ">");
				receive();
				send("DATA");
				receive();
				send(message);
				send(".");
				send("QUIT");
			} finally {
				socket.close();
			}
		} catch(IOException e) {
			comm.append("Error:" + e);
		}
	}
	private void send(String s) {
		comm.append(s + '\n');
		out.print(s);
		out.print("\r\n");
		out.flush();
	}
	private void receive() {
		comm.append(in.nextLine() + '\n');
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingConsole.run(new SendMail(), 500, 600);
	}

}

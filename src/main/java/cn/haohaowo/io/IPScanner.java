package cn.haohaowo.io;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class IPScanner {

	public static String scanner(byte[] ip) {
		InetAddress addr = null;
		try {
			addr = InetAddress.getByAddress(ip);
		} catch(UnknownHostException e) {
			e.printStackTrace();
		}
		return addr.getHostName();
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String hostName;
		String ip;
		for (int i = 0; i <= 8; i++) {
			ip = "8.8.8";
			hostName = scanner(new byte[]{8, 8, (byte)8, (byte)i});
			if(!ip.equals(hostName)) {
				System.out.println(ip + " : " + hostName);
			}
		}
	}

}

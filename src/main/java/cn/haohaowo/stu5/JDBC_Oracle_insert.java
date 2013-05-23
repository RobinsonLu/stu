package cn.haohaowo.stu5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBC_Oracle_insert {

	/**
	 * @param args
	 */
	private static Connection con = null;
	private static PreparedStatement pstmt = null;
	private static ResultSet rs = null;
	private static String Driver = "oracle.jdbc.driver.OracleDriver";
	private static String url = "jdbc:oracle:thin:@localhost:1521:ORCL";
	private static String name = "scott";
	private static String password = "admin";
	private static int  i = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName(Driver);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			
			con = DriverManager.getConnection(url,name,password);
			String sql = "insert into course values(?,?,?,?)";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, ++i);
			pstmt.setString(2, "liu");
			pstmt.setInt(3, 100);
			pstmt.setString(4, "OK");
			pstmt.executeUpdate();
			System.out.println("OK");
			pstmt.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

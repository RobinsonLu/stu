package cn.haohaowo.stu5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBC2 {

	/**
	 * @param args
	 */
	private static Connection con = null;
	private static PreparedStatement pstmt = null;
	private static ResultSet rs = null;
	private static String Driver = "com.mysql.jdbc.Driver";
	private static String url = "jdbc:mysql://localhost:3306/mydb";
	private static String name = "root";
	private static String password = "123456";
	private static int count = 10000;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			try {
				Class.forName(Driver);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			con = DriverManager.getConnection(url,name,password);
			String sql = "insert into student(Id,Name,Number,Sex,Birthday,Entrayday,"+
			"Speciality,Course,Address,Comment) values(default,?,?,?,?,?,?,?,?,?)";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, "lwc");
			pstmt.setInt(2, ++count);
			pstmt.setString(3,"ÄÐ");
			pstmt.setLong(4, 1000000000);
			pstmt.setLong(5, 1000000000);
			pstmt.setString(6, "wuliu");
			pstmt.setString(7, "100");
			pstmt.setString(8, "beijing");
			pstmt.setString(9, "no");
			
			pstmt.executeUpdate();
			System.out.println("OKj");
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}

}

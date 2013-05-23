package cn.haohaowo.stu5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBC_Oracle_select {

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
			String sql = "select * from course";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next())
			{
				int id = rs.getInt("no");
				String teacher = rs.getString("teacher");
				int course = rs.getInt("course");
				String description = rs.getString("description");
				
				System.out.println(id+"-------"+teacher+"-------"+course+"-------"+description);
			}
			rs.close();
			pstmt.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

package cn.haohaowo.stu5;
import java.sql.*;

public class JDBC1 {

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
			String s = "insert into s_su (age,name,scoure) values(?,?,?)";
			
//			String sql = "select * from s_su where name=? and age=?";
			pstmt = con.prepareStatement(s);
			pstmt.setInt(1,11);
			pstmt.setString(2, "ll");
			pstmt.setInt(3, 100);
			System.out.println(s);
			pstmt.executeUpdate();
//			pstmt = con.prepareStatement(sql);
//			pstmt.setString(1, "YY");
//			pstmt.setInt(2, 23);
//			rs = pstmt.executeQuery();
//			while(rs.next())
//			{
//				System.out.print(rs.getInt("Id")+"\r");
//				System.out.print(rs.getInt("age")+"\r");
//				System.out.print(rs.getString("name")+"\r");
//				System.out.println(rs.getInt("scoure"));
//			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}

}

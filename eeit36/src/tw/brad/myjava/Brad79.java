package tw.brad.myjava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class Brad79 {

	public static void main(String[] args) {
		
		Properties prop = new Properties();
		prop.put("user", "root");
		prop.put("password", "root");
		
		String sql = "INSERT INTO cust (cname,tel,birthday) VALUES (?,?,?)";
		
		try (Connection connection = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/eeit36", prop)) {
			
			PreparedStatement pstmt = connection.prepareStatement(sql);
			pstmt.setString(1, "Mark");
			pstmt.setString(2, "444");
			pstmt.setString(3, "1988-02-03");
			int i = pstmt.executeUpdate();
			
			System.out.println("OK5:" + i);
		} catch (SQLException e) {
			System.out.println(e.toString());
		}
		
		
		
	}

}

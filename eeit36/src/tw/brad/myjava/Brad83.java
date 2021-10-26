package tw.brad.myjava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Properties;

public class Brad83 {

	public static void main(String[] args) {
		Properties prop = new Properties();
		prop.put("user", "root");
		prop.put("password", "root");
		
		String sql = "INSERT INTO member (account,passwd,realname) VALUES (?, md5(?),?)";

		try (Connection connection = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/eeit36", prop)) {		
			PreparedStatement pstmt = connection.prepareStatement(sql);
			
			pstmt.setString(1, "brad");
			pstmt.setString(2, "123456");
			pstmt.setString(3, "Brad");
			pstmt.executeUpdate();
			
			System.out.println("OK1");
		}catch (Exception e) {
			System.out.println(e.toString());
		}
	}

}

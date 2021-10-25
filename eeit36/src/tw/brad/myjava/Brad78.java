package tw.brad.myjava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class Brad78 {

	public static void main(String[] args) {
		
		Properties prop = new Properties();
		prop.put("user", "root");
		prop.put("password", "root");
		
		try {
			Connection connection = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/eeit36", prop);
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM cust ORDER BY cname");
			
			while (rs.next()) {
				String id = rs.getString(1);
				String cname = rs.getString(2);
				String tel = rs.getString(3);
				String birthday = rs.getString(4);
				System.out.println(id + ":" + cname + ":" + tel + ":" + birthday);
			}
			
			connection.close();
			System.out.println("OK4");
		} catch (SQLException e) {
			System.out.println(e.toString());
		}
		
		
		
	}

}

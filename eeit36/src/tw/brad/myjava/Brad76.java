package tw.brad.myjava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class Brad76 {

	public static void main(String[] args) {
		
		Properties prop = new Properties();
		prop.put("user", "root");
		prop.put("password", "root");
		
		try {
			Connection connection = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/eeit36", prop);
			Statement stmt = connection.createStatement();
			int count = stmt.executeUpdate("DELETE FROM cust WHERE cname = 'Brad'");
			System.out.println(count);
			
			connection.close();
			System.out.println("OK4");
		} catch (SQLException e) {
			System.out.println(e.toString());
		}
		
		
		
	}

}

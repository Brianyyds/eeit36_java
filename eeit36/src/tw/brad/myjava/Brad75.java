package tw.brad.myjava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class Brad75 {

	public static void main(String[] args) {
		
		Properties prop = new Properties();
		prop.put("user", "root");
		prop.put("password", "root");
		
		try {
			Connection connection = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/eeit36", prop);
			Statement stmt = connection.createStatement();
			boolean isQuery = stmt.execute("SELECT * FROM cust");
			System.out.println(isQuery?"Query":"Update");
			
			connection.close();
			System.out.println("OK4");
		} catch (SQLException e) {
			System.out.println(e.toString());
		}
		
		
		
	}

}

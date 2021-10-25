package tw.brad.myjava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class Brad73 {

	public static void main(String[] args) {
		
		Properties prop = new Properties();
		prop.put("user", "root");
		prop.put("password", "root");
		
		try {
			Connection connection = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/eeit36", prop);
			Statement stmt = connection.createStatement();
			boolean isQuery = stmt.execute("UPDATE cust SET cname = 'Eric', tel = '1111' WHERE id = 8");
			System.out.println(isQuery?"Query":"Update");
			
			connection.close();
			System.out.println("OK4");
		} catch (SQLException e) {
			System.out.println(e.toString());
		}
		
		
		
	}

}

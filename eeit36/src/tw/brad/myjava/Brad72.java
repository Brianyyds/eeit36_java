package tw.brad.myjava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class Brad72 {

	public static void main(String[] args) {
		
		Properties prop = new Properties();
		prop.put("user", "root");
		prop.put("password", "root");
		
		try {
			Connection connection = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/eeit36", prop);
			Statement stmt = connection.createStatement();
			stmt.execute("INSERT INTO cust (cname,tel,birthday) VALUES ('Brad','123','1999-01-02')");
			
			connection.close();
			System.out.println("OK4");
		} catch (SQLException e) {
			System.out.println(e.toString());
		}
		
		
		
	}

}

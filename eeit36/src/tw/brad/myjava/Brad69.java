package tw.brad.myjava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Brad69 {

	public static void main(String[] args) {
		// Driver => Connector
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("OK1");
		} catch (ClassNotFoundException e) {
			System.out.println(e.toString());
		}
		
		try {
			Connection connection = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/eeit36?user=root&password=root");
			Statement stmt = connection.createStatement();
			stmt.execute("INSERT INTO cust (cname,tel,birthday) VALUES ('Brad','123','1999-01-02')");
			
			connection.close();
			System.out.println("OK2");
		} catch (SQLException e) {
			System.out.println(e.toString());
		}
		
		
		
	}

}

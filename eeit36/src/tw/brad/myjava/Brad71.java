package tw.brad.myjava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Brad71 {

	public static void main(String[] args) {
		try {
			Connection connection = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/eeit36","root","root");
			Statement stmt = connection.createStatement();
			stmt.execute("INSERT INTO cust (cname,tel,birthday) VALUES ('Brad','123','1999-01-02')");
			
			connection.close();
			System.out.println("OK3");
		} catch (SQLException e) {
			System.out.println(e.toString());
		}
		
		
		
	}

}

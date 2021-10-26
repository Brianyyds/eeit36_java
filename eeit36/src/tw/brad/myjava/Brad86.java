package tw.brad.myjava;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;
import java.util.Scanner;

import tw.brad.myclass.BCrypt;

public class Brad86 {

	public static void main(String[] args) {
		
		Properties prop = new Properties();
		prop.put("user", "root");
		prop.put("password", "root");
		
		String sql = "UPDATE member SET icon = ? WHERE id = ?";

		try (Connection connection = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/eeit36", prop)) {		
			PreparedStatement pstmt = connection.prepareStatement(sql);
			
			File file = new File("dir1/ball3.png");
			if (file.length() <= 60000 ) {
				pstmt.setBlob(1, new FileInputStream(file));
				pstmt.setInt(2, 7);
				pstmt.executeUpdate();
				System.out.println("OK");
			}else {
				System.out.println("File too big!");
			}
			
		}catch (Exception e) {
			System.out.println(e.toString());
		}
	}

}

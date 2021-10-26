package tw.brad.myjava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;
import java.util.Scanner;

import tw.brad.myclass.BCrypt;

public class Brad85 {

	public static void main(String[] args) {
		
//		String test1 = BCrypt.hashpw("1233456", BCrypt.gensalt());
//		System.out.println(test1);
//		System.out.println(test1.length());
//		String test2 = "1233456";
//		if (BCrypt.checkpw(test2, test1)) {
//			System.out.println("OK");
//		}else {
//			System.out.println("XX");
//		}
		

		Scanner scanner = new Scanner(System.in);
		System.out.print("Account: ");
		String account = scanner.next();
		System.out.print("Password: ");
		String passwd = scanner.next();
		
		
		Properties prop = new Properties();
		prop.put("user", "root");
		prop.put("password", "root");
		
		String sql = "SELECT * FROM member WHERE account = ?";

		try (Connection connection = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/eeit36", prop)) {		
			PreparedStatement pstmt = connection.prepareStatement(sql);
			
			pstmt.setString(1, account);
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
				String hashPasswd = rs.getString("passwd");
				if (BCrypt.checkpw(passwd, hashPasswd)) {
					System.out.println(rs.getString("realname") + ", 您好嗎");
				}else {
					System.out.println("get out here!");
				}
			}else {
				// account not exist
				System.out.println("Account NOT exist!");
			}
			
		}catch (Exception e) {
			System.out.println(e.toString());
		}
	}

}

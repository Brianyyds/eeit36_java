package tw.brad.myjava;

import java.io.InputStream;
import java.io.ObjectInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

import tw.brad.myclass.Student;

public class Brad89 {

	public static void main(String[] args) {
		Properties prop = new Properties();
		prop.put("user", "root");
		prop.put("password", "root");
		
		String sql = "SELECT * FROM member WHERE id = ?";

		try (Connection connection = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/eeit36", prop)) {		
			PreparedStatement pstmt = connection.prepareStatement(sql);
			pstmt.setInt(1, 7);
			ResultSet rs = pstmt.executeQuery();
			
			rs.next();
			InputStream in = rs.getBinaryStream("student");
			ObjectInputStream oin = new ObjectInputStream(in);
			Object object = oin.readObject();
			oin.close();
			
			if (object instanceof Student) {
				System.out.println("student");
				Student s3 = (Student)object;
				System.out.println(s3.sum());
				System.out.println(s3.avg());
				System.out.println(s3.getBikeSpeed());

			}
			
			System.out.println("OK2");
		}catch (Exception e) {
			System.out.println(e.toString());
		}

	}

}

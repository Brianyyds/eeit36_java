package tw.brad.myjava;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;
import java.util.Scanner;

import org.xml.sax.ext.Attributes2;

import tw.brad.myclass.BCrypt;
import tw.brad.myclass.Bike;
import tw.brad.myclass.Student;

public class Brad88 {

	public static void main(String[] args) {
		Bike b1 = new Bike();
		b1.upSpeed();b1.upSpeed();b1.upSpeed();b1.upSpeed();
		System.out.println("1. " + b1.getSpeed());
		
		Student s1 = new Student(90, 80, 70, b1);
		b1.upSpeed();b1.upSpeed();b1.upSpeed();b1.upSpeed();
		System.out.println("2. " + s1.getBikeSpeed());
		
		
		Properties prop = new Properties();
		prop.put("user", "root");
		prop.put("password", "root");
		
		String sql = "UPDATE member SET student = ? WHERE id = ?";

		try (Connection connection = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/eeit36", prop)) {		
			PreparedStatement pstmt = connection.prepareStatement(sql);

			ObjectOutputStream oout = 
					new ObjectOutputStream(new FileOutputStream("dir1/s1.brad"));
			oout.writeObject(s1);
			oout.flush();
			oout.close();
			//-------------------------
//			ObjectInputStream oInputStream = new ObjectInputStream(new FileInputStream("dir1/s1.brad"));
//			Object object = oInputStream.readObject();
//			if (object instanceof Student) {
//				Student s2 = (Student)object;
//				System.err.println(s1.sum());
//			}
//			oInputStream.close();
			
			pstmt.setBinaryStream(1, new FileInputStream("dir1/s1.brad"));
			pstmt.setInt(2, 7);
			pstmt.executeUpdate();
			
			System.out.println("OK");
			
		}catch (Exception e) {
			System.out.println(e.toString());
		}
	}

}

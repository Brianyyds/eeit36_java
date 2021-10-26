package tw.brad.myjava;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

import javax.sound.sampled.Line;

public class Brad87 {

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
			Blob blob = rs.getBlob("icon");
			
			FileOutputStream fout = new FileOutputStream("dir1/brad4.png");
			BufferedInputStream bin = new BufferedInputStream(blob.getBinaryStream());
			byte[] buf = new byte[1024*1024];
			int len;
			while ( (len = bin.read(buf)) != -1 ) {
				fout.write(buf, 0, len);
			}
			bin.close();
			fout.flush();
			fout.close();
			System.out.println("OK2");
		}catch (Exception e) {
			System.out.println(e.toString());
		}

	}

}

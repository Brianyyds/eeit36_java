package tw.brad.myjava;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;


public class Brad90 {

	public static void main(String[] args) {
		Properties prop = new Properties();
		prop.put("user", "root");
		prop.put("password", "root");
		
		try (Connection conn = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/eeit36", prop)) {
			DatabaseMetaData metaData = conn.getMetaData();
			boolean isSupport = metaData.supportsResultSetConcurrency(
					ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE);
			System.err.println(isSupport);
			
			String sql = "SELECT * FROM member";
			PreparedStatement pstmt = conn.prepareStatement(sql,
					ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE);
			
			ResultSet rs = pstmt.executeQuery();
			rs.next();
			System.out.println(rs.getString("realname"));
			
//			rs.updateString("realname", "Brad Chao 100");
//			rs.updateString("account", "brad47");
//			rs.updateRow();
//			System.out.println(rs.getString("realname"));
			
//			rs.next();
//			System.out.println(rs.getString("realname"));
//			rs.deleteRow();

			rs.moveToInsertRow();
			rs.updateString("account", "test1");
			rs.updateString("passwd", "test2");
			rs.updateString("realname", "test3");
			rs.insertRow();
			
			
		}catch (Exception e) {
			System.out.println(e.toString());
		}
	}

}

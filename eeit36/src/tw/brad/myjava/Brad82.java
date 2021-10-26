package tw.brad.myjava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;
import java.util.Scanner;

import org.json.JSONStringer;
import org.json.JSONWriter;

public class Brad82 {

	// 看這些open data 要怎麼聯想到有哪些專案或者程式可以發揮
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("頁碼(7筆/頁) = ");
		int page  = scanner.nextInt();
		
		int start = (page - 1) * 7;
		
		Properties prop = new Properties();
		prop.put("user", "root");
		prop.put("password", "root");
		String sql = String.format(
			"SELECT id, name, tel as phone, town, city FROM food ORDER BY id LIMIT %d, 7", start);

		try (Connection connection = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/eeit36", prop)) {		
			PreparedStatement pstmt = connection.prepareStatement(sql);
			
			JSONStringer js = new JSONStringer();
			JSONWriter jw = js.array();
			
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				String id =  rs.getString("id");
				String name =  rs.getString("name");
				String tel =  rs.getString("phone");
				String city =  rs.getString("city");
				String town =  rs.getString("town");
				System.out.println(String.format("%s : %s : %s : %s : %s ", id, city, town, name, tel));
				
				jw.object();
				jw.key("id").value(id);
				jw.key("name").value(name);
				jw.key("area").value(city+town);
				jw.endObject();
			}
			
			jw.endArray();
			
			System.out.println("------");
			System.out.println(jw.toString());
			
		}catch (Exception e) {
			System.out.println(e.toString());
		}
		
		
	}

}

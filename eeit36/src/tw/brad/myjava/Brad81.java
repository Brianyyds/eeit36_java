package tw.brad.myjava;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Properties;

import org.json.JSONArray;
import org.json.JSONObject;

public class Brad81 {

	public static void main(String[] args) {
		String jsonData = fetchOpendata();
		if (jsonData != null) {
			parseOpendata(jsonData);
		}
	}
	
	private static String fetchOpendata() {
		try {
			URL url = new URL("https://data.coa.gov.tw/Service/OpenData/ODwsv/ODwsvTravelFood.aspx");
			URLConnection connection =  url.openConnection();
			connection.connect();
			
			BufferedInputStream bin = new BufferedInputStream(connection.getInputStream());
			
			byte[] buf = new byte[1024*1024]; int len;
			StringBuffer sb = new StringBuffer();
			
			while ( (len = bin.read(buf)) != -1) {
				sb.append(new String(buf,0,len));
			}
			
			bin.close();
			
			return sb.toString();
			
		} catch (Exception e) {
			System.out.println(e.toString());
			return null;
		}

	}
	
	private static void parseOpendata(String json) {
		Properties prop = new Properties();
		prop.put("user", "root");
		prop.put("password", "root");
		String sql = "INSERT INTO food (name,address,tel,hostwords,feature,city,town,coordinate,picurl)" + 
				" VALUES (?,?,?,?,?,?,?,?,?)";

		try (Connection connection = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/eeit36", prop)) {
			
			PreparedStatement pstmt = connection.prepareStatement(sql);
			
			JSONArray root = new JSONArray(json);
			for (int i=0; i<root.length(); i++) {
				JSONObject row = root.getJSONObject(i);
				pstmt.setString(1, row.getString("Name"));
				pstmt.setString(2, row.getString("Address"));
				pstmt.setString(3, row.getString("Tel"));
				pstmt.setString(4, row.getString("HostWords"));
				pstmt.setString(5, row.getString("FoodFeature"));
				pstmt.setString(6, row.getString("City"));
				pstmt.setString(7, row.getString("Town"));
				pstmt.setString(8, row.getString("Coordinate"));
				pstmt.setString(9, row.getString("PicURL"));
				pstmt.executeUpdate();
			}
			System.out.println("OK");
		}catch (Exception e) {
			System.out.println(e.toString());
		}
		
	}
	

}

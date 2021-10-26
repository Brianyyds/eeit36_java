package tw.brad.myjava;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

import org.json.JSONArray;
import org.json.JSONObject;

import netscape.javascript.JSObject;

public class Brad81 {

	public static void main(String[] args) {
		String jsonData = fetchOpendata();
		if (jsonData != null) {
			parseOpendata(jsonData);
			insertOpendata();
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
		JSONArray root = new JSONArray(json);
		for (int i=0; i<root.length(); i++) {
			JSONObject row = root.getJSONObject(i);
			String name = row.getString("Name");
			System.out.println(name);
		}
	}
	
	private static void insertOpendata() {
		
	}

}

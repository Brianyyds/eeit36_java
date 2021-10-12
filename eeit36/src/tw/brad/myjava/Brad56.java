package tw.brad.myjava;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Brad56 {

	public static void main(String[] args) {
		
		try {
			BufferedReader reader = new BufferedReader(
					new FileReader("dir1/maskdata.csv"));
			
			reader.readLine();
			// 醫事機構代碼,醫事機構名稱,醫事機構地址,醫事機構電話,成人口罩剩餘數,兒童口罩剩餘數,來源資料時間
			
			String line;
			while ( (line = reader.readLine()) != null) {
				// 0145080011,衛生福利部花蓮醫院豐濱原住民分院,花蓮縣豐濱鄉豐濱村光豐路４１號,8358141,2450,940,2021/10/12 15:20:24
				String[] row =  line.split(",");
				if (row[2].startsWith("臺中市西屯區")) {
					System.out.println(row[1] + ":" + row[2] + ":" + row[4] + ":" + row[5]);
				}
			}
			
			reader.close();
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		
	}

}

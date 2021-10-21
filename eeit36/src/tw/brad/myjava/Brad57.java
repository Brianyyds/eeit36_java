package tw.brad.myjava;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Brad57 {

	public static void main(String[] args) {
		
		try {
			InetAddress[] ipAddress = InetAddress.getAllByName("www.iii.org.tw");
			for(InetAddress ip : ipAddress) {
				System.out.println(ip.getHostAddress());
			}
		} catch (UnknownHostException e) {
			System.out.println(e.toString());
		}
		
		
	}

}

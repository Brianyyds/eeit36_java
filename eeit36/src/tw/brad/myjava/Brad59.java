package tw.brad.myjava;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class Brad59 {

	public static void main(String[] args) {
		// 有點不太懂58跟59的關聯性是甚麼 為甚麼執行58能抓到59的資料
		byte[] buf = new byte[4096];
		try {
			DatagramSocket socket = new DatagramSocket(7777);
			DatagramPacket packet = new DatagramPacket(buf, buf.length);
			
			socket.receive(packet);
			
			byte[] data = packet.getData();
			System.out.println("len:" + data.length + "; " + packet.getLength());
			System.out.println(new String(data, 0, packet.getLength()));
			
			socket.close();
			System.out.println("Receive OK");
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
	}

}

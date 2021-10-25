package tw.brad.myjava;

public class Brad69 {

	public static void main(String[] args) {
		// Driver => Connector
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("OK");
		} catch (ClassNotFoundException e) {
			System.out.println(e.toString());
		}
	}

}

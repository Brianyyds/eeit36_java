package tw.brad.myjava;

import java.util.HashMap;
import java.util.Set;

public class Brad41 {

	public static void main(String[] args) {
		HashMap<String, Object> person = new HashMap<>();
		person.put("name", "Brad");
		person.put("height", 176);
		person.put("weight", 81.5);
		person.put("age", 18);
		person.put("male", true);
		System.out.println(person);
		System.out.println(person.get("name"));
		person.put("name", "紅鮭魚");
		System.out.println(person.get("name"));
		System.err.println("---");
		Set<String> keySet = person.keySet();
		for (String  key: keySet ) {
			System.out.println(key + ":" + person.get(key));
		}
		
	}

}

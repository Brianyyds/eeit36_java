package tw.brad.myjava;

import tw.brad.myclass.TWId;

public class Brad32 {

	public static void main(String[] args) {
		TWId id1 = new TWId();
		System.out.println(id1.getId() + ":" + id1.isMale());
		
		TWId id2 = new TWId(false);
		System.out.println(id2.getId() + ":" + id2.isMale());
		
		TWId id3 = new TWId(1);
		System.out.println(id3.getId() + ":" + id3.isMale());
		
		TWId id4 = new TWId(true, 1);
		System.out.println(id4.getId() + ":" + id4.isMale());
		
		TWId myId = TWId.createTWId("A123456789");
		if (myId != null) {
			System.out.println(myId.getId() + ":" + myId.isMale());
		}else {
			System.out.println(".......");
		}
	}
	
}

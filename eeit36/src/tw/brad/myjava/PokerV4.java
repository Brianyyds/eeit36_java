package tw.brad.myjava;

import java.util.Collections;
import java.util.LinkedList;

public class PokerV4 {

	public static void main(String[] args) {
		
		LinkedList<Integer> poker = new LinkedList<Integer>();
		for (int i=0; i<10; i++) poker.add(i);
		Collections.shuffle(poker);
		
		for (Integer card : poker) {
			System.out.println(card);
		}
		
	}

}

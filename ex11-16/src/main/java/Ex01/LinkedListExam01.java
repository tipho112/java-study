package Ex01;

import java.util.*;

public class LinkedListExam01 {
	public static void main(String[] args) {
		LinkedList<Integer> list  = new LinkedList<Integer>();
		
		list.add( 11 );
		list.add( 11 );
		list.add( 22 );
		list.add( 22 );
		list.add( 33 );
		
		list.add(3, 25);
		System.out.println("현재 데이터 수: " + list.size());
		for(int i = 0; i < list.size(); i++) {
			System.out.println(i + "번째 데이터: " + list.get(i));
		}
		System.out.println();
		
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()) {
			int i = it.next();
			System.out.println("hasNext() : " + i);
		}
		System.out.println();
		
		for(int i : list) {
			System.out.println("for() : " + i);
		}
	}
}
package Ex01;

import java.util.*;

public class ArrayListExam01 {
	public static void main(String[] args) {
		
		// ArrayList 생성 및 초기화
		List<Integer> list = new ArrayList<Integer>();
				
		// 5개의 데이터 추가
		list.add( 11 );
		list.add( 11 );
		list.add( 22 );
		list.add( 22 );
		list.add( 33 );
		
		//int count = list.size();
		System.out.println( "현재 데이터 수:" + list.size() );
		for( int i = 0; i < list.size(); i++ ) {
		    System.out.println( i + "번째 데이터 : " + list.get( i ) );
		}
		System.out.println();
		
		list.add(3, 100);
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()) {
			int i = it.next();
			System.out.println("hasNext()로 출력 : " + i);
		}
		System.out.println();
		
		for(int i : list) {
			System.out.println("for()로 출력 : " + i);
		}
		
		/*
		// 전체 데이터 수 출력
		int count = list.size();
		System.out.println( "현재 데이터 수:" + count );
				
		// 전체 데이터 순서대로 가져오기
		for( int i = 0; i < count; i++ ) {
		    System.out.println( i + "번째 데이터 : " + list.get( i ) );
		}
		System.out.println();

		// 전체 데이터 삭제
		//list.removeAll();
		
		list.add(2, 3);
		System.out.println( "현재 데이터 수:" + count );
		for( int i = 0; i < count; i++ ) {
		    System.out.println( i + "번째 데이터 : " + list.get( i ) );
		}
		System.out.println();
		
		// 중간 데이터 삭제
		list.remove(3);
		System.out.println( "현재 데이터 수:" + count );
		for( int i = 0; i < count; i++ ) {
		    System.out.println( i + "번째 데이터 : " + list.get( i ) );
		}
		System.out.println();
		
		
		try {
			list.get(0);
		} catch (IndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		
		
		// 전체 데이터 삭제
		//list.removeAll();
		*/
		
		//list.add( 11 );
		//list.add( 11 );
		//list.add( 22 );
		//list.add( 22 );
		//list.add( 33 );
		
		// 전체 데이터 수 출력
		//System.out.println( "현재 데이터 수:" + count );
		

	}
}
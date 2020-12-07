package Ex01;

import java.util.*;

public class ArrayListExam01 {
	public static void main(String[] args) {
		
		// ArrayList ���� �� �ʱ�ȭ
		List<Integer> list = new ArrayList<Integer>();
				
		// 5���� ������ �߰�
		list.add( 11 );
		list.add( 11 );
		list.add( 22 );
		list.add( 22 );
		list.add( 33 );
		
		//int count = list.size();
		System.out.println( "���� ������ ��:" + list.size() );
		for( int i = 0; i < list.size(); i++ ) {
		    System.out.println( i + "��° ������ : " + list.get( i ) );
		}
		System.out.println();
		
		list.add(3, 100);
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()) {
			int i = it.next();
			System.out.println("hasNext()�� ��� : " + i);
		}
		System.out.println();
		
		for(int i : list) {
			System.out.println("for()�� ��� : " + i);
		}
		
		/*
		// ��ü ������ �� ���
		int count = list.size();
		System.out.println( "���� ������ ��:" + count );
				
		// ��ü ������ ������� ��������
		for( int i = 0; i < count; i++ ) {
		    System.out.println( i + "��° ������ : " + list.get( i ) );
		}
		System.out.println();

		// ��ü ������ ����
		//list.removeAll();
		
		list.add(2, 3);
		System.out.println( "���� ������ ��:" + count );
		for( int i = 0; i < count; i++ ) {
		    System.out.println( i + "��° ������ : " + list.get( i ) );
		}
		System.out.println();
		
		// �߰� ������ ����
		list.remove(3);
		System.out.println( "���� ������ ��:" + count );
		for( int i = 0; i < count; i++ ) {
		    System.out.println( i + "��° ������ : " + list.get( i ) );
		}
		System.out.println();
		
		
		try {
			list.get(0);
		} catch (IndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		
		
		// ��ü ������ ����
		//list.removeAll();
		*/
		
		//list.add( 11 );
		//list.add( 11 );
		//list.add( 22 );
		//list.add( 22 );
		//list.add( 33 );
		
		// ��ü ������ �� ���
		//System.out.println( "���� ������ ��:" + count );
		

	}
}
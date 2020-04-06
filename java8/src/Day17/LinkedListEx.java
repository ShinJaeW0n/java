package Day17;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListEx {

	public static void main(String[] args) {
		List<String> arrayList = new ArrayList<>();
		List<String> linkedList = new LinkedList<>();
		
		//���������� �־����� , ���� �ڿ� �Ҷ��� array�� �� ������.
		
		System.out.println("ArrayList�� LinkedList ��");
		long start = System.currentTimeMillis();
		for(int i = 0; i < 10_000_000; i++) {

			arrayList.add(String.valueOf(i));
		}
		
		System.out.println("===================");
		
		long end = System.currentTimeMillis();
		System.out.println("ArrayList: " + (end - start)/1000 + "ms");
		
		
		start = System.currentTimeMillis();
		for(int i = 0; i < 10_000_000; i++) {

			linkedList.add(String.valueOf(i));
		}
		
		end = System.currentTimeMillis();
		System.out.println("LinkedList: " + (end - start)/1000 + "ms");
		
		
		System.out.println("======================");
		
		
		
		//�߰��� �������ٶ� linked�� �� ������.
		
		System.out.println("ArrayList�� LinkedList ��");
		start = System.currentTimeMillis();
		for(int i = 0; i < 10000; i++) {
						
						//0���� ��Ʈ���� �־��ֶ��. 0���� �־��༭ �ϳ��ϳ��� �� �и�.
			arrayList.add(0, String.valueOf(i));
		}
		
		System.out.println("===================");
		
		end = System.currentTimeMillis();
		System.out.println("ArrayList: " + (end - start)/1000 + "ms");
		
		
		start = System.currentTimeMillis();
		for(int i = 0; i < 10000; i++) {

			linkedList.add(0, String.valueOf(i));
		}
		
		end = System.currentTimeMillis();
		System.out.println("LinkedList: " + (end - start)/1000 + "ms");
		
		
	}
}

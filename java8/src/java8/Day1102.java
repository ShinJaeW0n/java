package java8;

public class Day1102 {
	
	//0���� 9���� ��� �� 0���� �ٽ� �ʱ�ȭ�϶�.
	public static void main(String[] args) {
		int [] a = new int[10];
		
		for(int i =0; i<a.length; i++) {
			a[i] = i;
			
		}
		
		for(int number : a) {
			System.out.println(number);
		}

//		for(int i = 0; i<a.length; i++) {  <= ������ ��Ҹ� 0���� ����
//			a[i] = 0; //��� 0���� �ʱ�ȭ�ض�.
//		}
	
		for(int number : a) {
			System.out.println(number);
		}
		
		//0���� �ʱ�ȭ�ϴ� �� �ٸ� ���.
		a = new int[10]; //���ο� ��ü�� ����, �ʱ�ȭ��.
		
		for(int number : a) {
			System.out.println(number);
		}
		

// ���� �� �ͤ�.		
//		int [] a1 = new int [9];
//		
//		for(int i =0; i<a.length; i++) {
//			System.out.println(a1[i]);
//		}
		
	}
}

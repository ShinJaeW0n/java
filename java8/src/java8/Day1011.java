package java8;

public class Day1011 {
		// ���� for��. for-each
		// ���� for���� �� �����ٴ°� �����Ϸ���.
		// ��� �����͸� ����Ϸ��� - ����for�� (�� ���� �����.)
		// Ư�� �����͸� �̾Ƽ� ����Ϸ��� - �Ϲ� c�� for��
	
		public static void main(String[] args) {
		int[] arr = new int[300_000_000]; //3�ﰳ¥�� �迭
		int sum = 0;
		int sum2 = 0;
		
		System.out.println("C�� for��: ");
		long sTime = System.currentTimeMillis();
		for(int i =0; i<arr.length; i++) {
			sum +=i;
		}
		
		long eTime = System.currentTimeMillis();
		System.out.println(eTime - sTime);
		System.out.println();
		
		
		
		System.out.println("���� for��: ");
		long sTime2 = System.currentTimeMillis();
		for(int number1 : arr) {
			sum2 +=number1;
		}
		long eTime2 = System.currentTimeMillis();
		System.out.println(eTime2 - sTime2);
		
		
		
		
		}
}

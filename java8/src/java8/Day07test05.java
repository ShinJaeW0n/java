package java8;

public class Day07test05 {

	public static void main(String[] args) {
		
		//1���� 50������ �� �� 3�� ����� �հ踦 ���϶�.
		int sum = 0;
		
		for (int i = 1; i<=50; i++ ) {
			
			if(i % 3 == 0) {
				sum += i;
			}
		}
		
		System.out.print("1���� 50��� ��3 �� ����� �հ�:" + sum);
	}
	
}

package java8;

public class Day07test07 {

	//1���� 50������ ���� �� 3�� ����� ������ ���϶�.
	public static void main(String[] args) {
	//������ count�� ����.
		
		int cnt = 0;
		
		for(int i = 1; i <= 50; i++) {
			if(i % 3 == 0) {
				cnt++;
			}
		}
		System.out.println("1���� 50���� �� 3�� ����� ������? : " + cnt);
		

	//�̰� ���� �Ѱ���. �� Ʋ����.
//		int sum = 0;
//		
//		for(int i = 0; i <=50; i++) {
//			if(i%3!=0) {
//				continue;
//			}
//		}
//		
//		System.out.println("3�� ����� ������?: ");
	}
	
}

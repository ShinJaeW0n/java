package java8;

public class Day07test08 {
	
	
	//1���� 10���� ����ϴ� �����Դϴ�.
	public static void main(String[] args) {
		for(int i = 1; i <= 10; i++) {
			System.out.print(i + " "); //���η� ��ĭ�� ������.
		}
	System.out.println();
	
	
	//10���� 1���� ����ϴ� ����
	
	
	for(int i = 10; i >= 1; i--) {
		System.out.print(i + " ");
		
		
	}
	
	System.out.println(); //��ĭ�� ����ٷ���
	
	//�Ǵ� �̷� ������ ����.
	for(int i = 0; i <= 10; i++) {
		System.out.print(10 - i + " " );
		
		
	}
	
	System.out.println();
	
	//���� ��� ����#���� ���
	for(int i = 1; i <= 10; i++) {
		for(int j = 0; j < i; j++) {
			System.out.print("#");
		}
		System.out.println(); //���ο��� ���� ������ ���͸� ���ִ� ��
	
	}
	
	//10������ 1������ #�� ���.
//	�ڿ� ���ڸ�ŭ �ݺ��Ѵ�.
//	�ڿ� ���ں��� ���������� �ݺ��Ѵ�.
//	�ܺ� for���� ���� for �� ����.
//	#�� 10�� ġ�� �������´�.
//	
	for(int i = 10; i >= 1; i--) {
		for(int j = 0; j < i; j++) {
			System.out.print("#");
		}
	System.out.println();
	}
	
	}
}

package java8;

public class Day07test10 {
	public static void main(String[] args) {
		//1���� 100���� ����ؼ� 3�� ������� ping�� �ٵ��� �ض�.
		//5�� ������� pong�� �ٰ��ض�.
		
		int sum = 0;
		
		for(int i = 1; i <= 100; i++) {
			
			
			//3�� 5�� ��������� pingpong�� �ٰ��϶�.
			//�̷��� �ϸ� pingpong �� �ȳ���. �ֳ��ϸ� if���� �����͸� 1���� ���⶧��.
			//�׷� ������� ���� ���� �÷�����Ѵ�.
			
			//if (i % 15 == 0 )
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println(i + "pingpong");
			}
			
			else if(i % 3 == 0) {
				System.out.println(i + "ping");
			}
			
			else if (i % 5 == 0) {
				System.out.println(i + "pong");
			}
			
			
			
			else {
				System.out.println(i);
			}
			
		}
		
		//�̷� ����� ����. �̷��� �ϸ� ��������� ������ �پ��.
		for (int i = 1; i <= 100; i++) {
			System.out.print(i + " ");
			
			if ( i % 3 == 0 ) {
				System.out.print("ping");
			}
			
			if ( i % 5 == 0) { 
				System.out.print("pong");
			}
			System.out.println();
		}
		
	}
	
	

}

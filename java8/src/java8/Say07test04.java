package java8;

public class Say07test04 {
	
	public static void main(String[] args) {
		
		int sum = 0;
		
		for (int i = 1; i <= 10; i++) {
			if(i % 2 == 0) {
				sum += i;
			} 
			
			
			//�̷��� continue ���� ����� �� �ִ�.
//			for (int i = 1; i <= 10; i++) {
//				if(i % 2 == 0) {
//					continue;
//				} 
//			
//				sum += i;
//			}
				
			
		}
		
		//for�� ������ ���������� ������. for�� �ȿ��� ����Ʈ �ϸ� ��� �ݺ���.
		System.out.print("1���� 10���� �� ¦���� �հ�: " + sum);
	
	}

}

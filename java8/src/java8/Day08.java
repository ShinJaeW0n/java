package java8;

public class Day08 {
	
	public static void main(String[] args) {
		/*1���� 100���� ���*/
		
		
		
		for(int i =1; i <=100; i++) {
			System.out.println(i);
			
			}
		
		//1���� 100�߿� 3�� 5�� ������� ����?
		int sum = 0;
		for(int i =1; i <=100; i++) {
			if(i%3==0 && i%5==0) {
				sum+=i; }
			}
		
		System.out.println("3�� 5�� ���������: "+ sum); //������ ������ �� ��
	
	
		//1���� 100�߿� ¦���� ���ϰ� Ȧ���� �� ����� ����ϼ���.
		//���� �Ѱ�.
//		int sum1 = 0;
//		int sum2 = 0;
//		for(int i = 0; i<=100; i++) {
//			if(i%2==0) {
//				sum1+=i;
//				
//			}else if (i%2 !=0)
//				{sum2-=i;
//				
//		}
//		
//	}	
//
//	System.out.println("¦���� ���Ѱ�:"+sum1);
//	System.out.println("Ȧ���� �� ��:"+sum2);

		//���� �� ��.
	int sum1 = 0;
	int sum2 = 0;
	for(int i = 0; i<=100; i++) {
		if( i%2==0) {
			sum1+=i;
		}else {
			sum2+=i;
		}
	}
	
	System.out.println("¦���� ���ϰ� Ȧ���� �� ���" + (sum1 - sum2));
	
	sum=0;
	
	for(int i = 1; i<=100; i++) {
		if( i%2==0) {
			sum +=i;
		}else {
			sum -=i;
		}
	
	
	}System.out.println(sum); //���� �ٱ����� ���ֱ�.

	
	
	}
}

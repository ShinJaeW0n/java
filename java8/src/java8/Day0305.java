package java8;

public class Day0305 {
	public static void main(String[] args) {
		int num1 = 10,  num2 = 20 ,  num3 = 20; //�̷��� �ϴ� �͵� ����
		System.out.println("num1 = 10,  num2 = 20 ,  num3 = 20");
		System.out.println("num1 < num2:" + (num1 < num2) ); // +�� �켱�ϱ� ������ ��ȣ�� �ֿ켱 �������� �ٲ������.
		System.out.println("num1 <= num2:" + (num1 <= num2) );
		System.out.println("num1 >= num2:" + (num1 >= num2) );
		System.out.println("num1 > num2:" + (num1 > num2) );
		System.out.println("num1 == num2:" + (num1 == num2) );
		System.out.println("num1 != num2:" + (num1 != num2) );
		
		System.out.println("num3 < num2:" + (num3 < num2) ); // +�� �켱�ϱ� ������ ��ȣ�� �ֿ켱 �������� �ٲ������.
		System.out.println("num3 <= num2:" + (num3 <= num2) );
		System.out.println("num3 >= num2:" + (num3 >= num2) );
		System.out.println("num3 > num2:" + (num3 > num2) );
		System.out.println("num3 == num2:" + (num3 == num2) );
		System.out.println("num3 != num2:" + (num3 != num2) );
	
		//��+��+a = �ѹ��� �ٲ��ٶ�.
		
		/* �����߿��Ѱ� : =�� 1�� ����ϸ� ���Կ����ڷ� �������� ���� �������� �����Ѵ�.
		 *			==�� ����ϸ� ���ʰ� ������ ���� ���������� �Ǵ��մϴ�.
		 * 			=�� ==�� ����� �ٸ���. *****
		 */
	
	
		boolean result = num1 < num2;
		System.out.println(result); //�� ������ boolean�̶�� �ڷ����� ����Ѵ�.
	
	
	}
}

package java8;

public class Day0203 {
	public static void main(String[] args) {
		int number1 = 1000000000;
		int number2 = 2000000000; //2�ʾ��� �־����� ������ ���� �����°��� �����÷ο�����.
		//int�� 20�� �̻��� ���� �� ���� ������ �� �̻��� ������ �����÷ο찡 �߻�.
		//int�� ������ -21�￡�� 21������̴�.
		
		int result = number1 + number2; //������ �Ѿ�� �����÷ο찡 �߻��Ѵ�.
		System.out.println(result);
		
		long result2 = number1 + number2;
		System.out.println(result2); //�������� ������ int + int �̴�.
										//�׷��� ������� int �̴�.
		long num3 = 1000000000;
		long num4 = 2000000000;
		long result3 = num3 + num4;
		System.out.println(result3); //long���� 30���� ǥ���̵ȴ�.
		
		long result4 = 1000000000l + 2000000000L;
		System.out.println(result4); //�Ϲ������� ���꿡�� ����ϴ� ������ int�Դϴ�.
					//�׷��� ���� ���� int ������ ǥ���� ���̶� ���� ��¾ȵ�.
	//�׷��� long���� ǥ���Ϸ��� ���� �ڿ� l�̳� L�� ���. ��ҹ��� �������. �׷��� 1�� ������ ����
		//�빮��L�� ����ϴ� ���� ����.
	
		byte num5 = 15;
		byte num6 = 1;
		int result5 = num5 + num6;
		//�� byte rfesult5��� �ϸ� �������� ����°� : �ڹ��� �⺻������ int��.
				//byte + byte �� ����� int���̴�. �׷��� byte�� ���� �� ����.
				//int�� ��������Ѵ�.
		System.out.println(result5);
		
		short num7 = 3000;
		short num8 = 5000;
		int result6 = num7 + num8; //short + short�� ����� int�Դϴ�.
		System.out.println(result6);
		
		long result7 = num7 + num8; //�������� �ڷ����� ������ �ڷ�������
					//���� ���, �����ʿ��� �������� ������ �����մϴ�.
					//�ڵ� ����ȯ. ������ ����ȯ. = promotion
		
		
		/*int result8 = 10L; //long���� int�� ������ �� ����. 
		//�������� ���ʺ��� ũ�� ������ �Ұ���.
		*/
		
//		ctrl+shift+c �巡���ؼ� ������ ���� �ٵ� �ּ����� ����.
//		ctrl+7�� ������ �����ּ�
		
		int num9 = 10;
		int num10 = 20;
		short result9 = (short)(num9 + num10); 
		System.out.println(result9);
		//�̰��� ���� ����ȯ�̶�� �Ѵ�. ����� ����ȯ. =casting
		//ū �ڷ����� ���� �ڷ������� ��ȯ�Ҷ��� ���� ����ȯ�� �ؾ��մϴ�.
		//������ ������ �Ұ���. ()�� ���ְ� �տ� �ٲ� �ڷḦ �����.
		
		
		int num11 = 10000;
		int num12 = 30000;
		short result10 = (short)(num11 + num12); 
		//�̷��� �ϸ� -25536�� ����. �̰� �����÷ο찡 �ƴ�.
		//casting�� ǥ���� �� ���� ��Ʈ�� ������.
		System.out.println(result10);
		//1��+3���� 4��
		
//	4���� 2������ 1001 1100 0100 0000�̶�� ���� ���´�.
//	(���α׷��� ���� bin��.)
		
	}									
}

package java8;

public class Day0303 {
	public static void main(String[] args) {
		int number1 = 100; //��������(���� ���ȣ�ȿ� �ֱ� ����)
		System.out.println(number1);
		
		{ //�߰�ȣ ��
			System.out.println(number1);
			int number2 = 200; //������
			System.out.println(number2);
		}
		
		System.out.println(number1);
		System.out.println(number2); 
		//�̷��� �ϸ� �ѹ�2�� ��������. ���ο� �������ȿ��� �������
		//�� ���� �ݾ��ܰ� ���ÿ� ��������. �ܺ��� ���� ���ο��� �� �� �ְ�
		//���ο��� ������ �ܺο��� �� ��.
		
	}

}

package java8;

//����ȯ�� �߿��ϱ� ������ �� �˰���***

public class Day0204 {
	public static void main(String[] args) {
	 
	 double num1;
	 num1 = 3.14;
	 double num2 = 1.23;
	 double result1 = num1 + num2;
	 System.out.println(result1);
	 
	 //8����Ʈ�� 4����Ʈ�� �������� �ϸ� �̷��� �������� ����
	 //float result2 = num1 + num2;
	 //�׷��� �̷��� ����ȯ �������.
	 float result2 = (float)(num1+num2);
	 System.out.println(result2);
	 
	 
	 double result3 = 3.14 + 1.23;
	 System.out.println(result3);
	 
	 //float result4 = 3.14 + 1.23; //�Ǽ��� �⺻���� double�̱� ������
	 //���� ���� ����� ����ȯ�� �ʿ�������.
	 
	 float result4 = 3.14f + 1.23f;
	 System.out.println(result4);
	 //float�� ������ ���� ���� f�� ���δ�. float�� �Ϲ������� �ҹ���f�� ���´�.(�빮�ڵ� �����)
	 //�Ǽ��� �⺻���� double�̶� �ڿ� f�� ���̸� ����ȯ�� ���ذ��̴�.

	 double result5 = 3.14f + 1.23; //���� �ٸ� �ڷ����� �����ϰ� �Ǹ� ū �ڷ������� 
	 								//�ڵ� ����ȯ�մϴ�.
	 
	 //int result6 = 10 + 20L; //int10�� long�� 20�� �������� long�� 30�� �ȴ�.
	 //�׷��� int�� �ƴ϶� �Ʒ�ó�� long������ �ٲ���Ѵ�.
	 
	 
	 long result6 = 10 + 20L; // ������ �����ϰ� ���� �ٸ� �ڷ������� �����ϰԵǸ�
	 							//ū ������ �ڵ� ����ȯ�մϴ�.
	 
	 
	 int numb1 = 100;
	 System.out.println(numb1);
	 numb1 =200;
	 System.out.println(numb1);
	 
	 
	 
	}

}

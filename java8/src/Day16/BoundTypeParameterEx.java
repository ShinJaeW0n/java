package Day16;

public class BoundTypeParameterEx {

	public static void main(String[] args) {
		
		//String str;//Object�� ������.
		//String srt = Util1.compare("a", "b"); <- String�� Number�� ������ �ƴϴ�. �׷��� String�� �� �� ����.
		
								//compare -> //�տ����� ������ -1 ����
		int result1 = Util1.<Integer>compare(10,20); //t1�� t2�� int �̹Ƿ� Integer�� ���߰� �����ϴ�. integer ��������.
		System.out.println(result1);
									//�տ����� ũ�� 1 ����
		int result2 = Util1.<Number>compare(4.5, 3); //t1�� double, t2�� int�̴� 2�� ��� ������ �� �ִ� Number�� ����.
		System.out.println(result2);
								//int, int�� ���Ǿ <Integer>�� ���ɰŴ�.				
		int result3 = Util1.compare(100, 100);//���� ����� ��� 0 ����.
		System.out.println(result3);
	
	}
	
}

package Day20;

		//������ ����ȭ 4
	
public class CalcuratorEx {
		public static void main(String[] args) {
			Calculator calc = new Calculator();
			User1 user1 = new User1();
			User2 user2 = new User2();
			
			user1.setCalculator(calc);
			user2.setCalculator(calc);
			
			user1.start(); //����1�� 100�� �����ϰ� 2�� ���� �߰��� ����2 50�� ���͹���. �׷��� ����1�� �����
			user2.start(); //����1 ���� 50�� �Ǿ����.
			
		}
}

//[���]
//User2: 50
//User1: 50
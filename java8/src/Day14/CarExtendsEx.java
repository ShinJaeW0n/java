package Day14;

public class CarExtendsEx { //**Ÿ�̾�� �ѱ�Ÿ�̾ ��ȣŸ�̾ �� �� �ִ�.
		public static void main(String[] args) {
			CarExtends car = new CarExtends();
			for(int i = 0; i <= 5; i++) {
				int problemLocation = car.run();
				switch(problemLocation) {
				case 1:
					System.out.println("�� ���� HankookTire�� ��ü");
					car.frontLeftTire = new HankookTire("�� ����", 15);
					break;
				
				case 2:
					System.out.println("�� ������ KumhoTire�� ��ü");
					car.frontRightTire = new KumhoTire("�� ������", 13);
					break;
				
				case 3:
					System.out.println("�� ���� HankookTire�� ��ü");
					car.backLeftTire = new HankookTire("�� ����", 14);
					break;
				
				case 4:
					System.out.println("�� ������ KumhoTire�� ��ü");
					car.backRightTire = new KumhoTire("�� ������", 17);
					break;
					
					
					
				}
			
			System.out.println("----------------------------");
			
			}
			
			
			
			
			
		}
	
	
}

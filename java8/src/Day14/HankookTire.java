package Day14;

public class HankookTire extends Tire {

		public HankookTire(String location, int maxRotation) {
			//�θ� ����Ʈ�����ڰ� ���� ������ �θ�� ����
			super(location, maxRotation);
		}
	
		
		@Override
		public boolean roll() {
			++accumulatedRotation;
			if(accumulatedRotation < maxRotation) {
				System.out.println(location + "HankookTire ����: " + (maxRotation - accumulatedRotation) + "ȸ");
				return true;
			}else {
				System.out.println("*** " + location + "HankookTire ��ũ ***");
				return false;
			}
		
		}
	
	
	
}

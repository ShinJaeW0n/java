package Day16;

public class ThrowsEx {

		public static void calc1()  throws ArithmeticException{
			calc2();
		}
		
		public static void calc2()  throws ArithmeticException{
			int num = 5/0;
			
		}
		
		public static void main(String[] args) {
			System.out.println("�޼ҵ忡�� ������ ���� �˸���");
		try {
			calc1();
			
				//�������� �̼����� �ƹ����Գ� �ص� �ؿ� catch ���� �̼��� �������� ó���ȴ�.
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage()); //<-�߸��� �� �ϳ���.
			e.printStackTrace(); // <-��ü������ ��� �߸������
			
		}finally {
			System.out.println("�޼ҵ忡�� ������ ���ܾ˸��� ���α׷� ����");
		}
		
	}
						//�̷��� �ϸ� ����ó���� ���ص��ȴ�. try touch�� �ۼ����ص� �ȴٸ� �ؿ� throws�� ������ش�.
		public static void calc3() throws InterruptedException {
			Thread.sleep(1000);
			
		}



}

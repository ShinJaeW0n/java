package Day21;

		//������ �ǽ����� - 2 ���๮, Bank Ŭ���� �ϳ��� �ҷ��� �� ���� ���������.
public class Contribution {
	public static void main(String[] args) {
		Bank acc = new Bank();
		
		Customer cust[] = new Customer[4];
		//������ ȣ�� , 1���� ���¸� 4���� ���� ���� ����.
		for(int i = 0; i < 4; i++) {
			cust[i] = new Customer(acc);
			cust[i].start();
		}
		
		for(int i = 0; i < 4; i++) {
			try {
				cust[i].join(); //4���� �����尡 ������ ����
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	
		System.out.println("�Ѿ���: " + acc.getamt());
	
		//�����Ҷ����� �� �� �����尡 �����ߴ����� ����� �ٲ��.
		
	}
	
	
}

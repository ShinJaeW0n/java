package Day14;

	//������, �ʵ�, �޼ҵ�� ������ �ٲ��� ��� ��
public class CellPhone {
		//�ʵ�
		String model = "";
		String color = "";
		
		//������
		//�����ڴ� ���� ������ �ʾƼ� ����Ʈ ������ �ڵ� ������.		
		
		//�޼ҵ�
		void powerOn() {
			System.out.println("������ �մϴ�.");
		}
		void powerOff() {
			System.out.println("������ ���ϴ�.");
		}
		void bell() {
			System.out.println("���� �︳�ϴ�.");
		}
		
		void spendVoice(String message) {
			System.out.println("�ڱ�: " + message);
		}
		void receiveVoice(String message) {
			System.out.println("����: " + message);
		}
		void hangUp() {
			System.out.println("������ �����ϴ�.");
		}
	
}

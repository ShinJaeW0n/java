package Day14;

public class CellPhoneEx {

	public static void main(String[] args) {
		
		//�ڽ��� ��ü�� �θ��� �ν��Ͻ� ����� ȣ�� �� �� ����.
		DmbCellPhone dcp = new DmbCellPhone("������s20", "����", 10);
		
		dcp.powerOn(); //�θ��� �޼ҵ�
		dcp.bell();		//�θ��� �޼ҵ�
		dcp.spendVoice("��������."); 	//�θ��� �޼ҵ�
		dcp.receiveVoice("�ù��Դϴ�."); //�θ��� �޼ҵ�
		dcp.spendVoice("�� �տ� ���� �ּ���."); //�θ��� �޼ҵ�
		dcp.receiveVoice("�˰ڽ��ϴ�."); //�θ��� �޼ҵ�
		dcp.hangUp(); //�θ��� �޼ҵ�
		dcp.turnOndmb(); //�ڽ��� �޼ҵ�
		dcp.setChannel(100); //�ڽ��� �޼ҵ�
		dcp.turnOffdmb(); //�ڽ��� �޼ҵ�
		dcp.powerOff(); //�θ��� �޼ҵ�
	
		
		//�θ��� ��ü�� �ڽ��� �ν��Ͻ� ����� ȣ�� �� �� ����. �ڱ� �ڽ� �͸� ����� �� �ִ�.
		CellPhone cp = new CellPhone();
		cp.powerOn();
		
	
	
	
	}
		
}

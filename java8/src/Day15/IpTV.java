package Day15;

public class IpTV implements RemoteControl, Internet {

	//���ÿ� 2�� Ŭ���� ��������
	//��ӿ����� ���߻���� �Ұ����ϳ�, �������̽������� ���߱����� �����ϴ�. 
	//�׷��� ó�� �����Ҷ����� �޼ҵ尡 ���Ƽ� ȥ���� ���� �ʵ��� ���� �ٸ� �޼ҵ带 �ۼ��������.
	
	
	private int volume;
	
	//Internet
	@Override
	public void searchWeb() {
		System.out.println("���ͳ��� �˻��մϴ�.");
		
	}

	
	//RemoteControl
	@Override
	public void turnOn() {
		System.out.println("TV�� �մϴ�.");
		
	}

	@Override
	public void turnOff() {
		System.out.println("TV�� ���ϴ�.");
		
	}

	@Override
	public void setVolume(int volume) {
		this.volume = volume;
		System.out.println(this.volume + "���� ������ �����մϴ�.");
	}
				
	
			
}

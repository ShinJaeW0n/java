package Day15;

public class RemonteControlEx {

			public static void main(String[] args) {
			
				TV tv = new TV();
				Audio ad = new Audio();
//				RemoteControl rc = new RemoteControl(); //�������̽��� �����ڰ� �����ϴ�.
				RemoteControl rc; //������ ���� �� �� �ִ�.
				
				rc = tv; //�������̽� �������� ���� Ŭ������ ��ü�� ���Ե˴ϴ�.
				rc = new TV(); // <-�̷��� �ص� �������.
				
				RemoteControl.changeBattery(); //static�޼ҵ带 ȣ���� �� ������ <�������̽���.�޼ҵ� > �̷��� ȣ���ؾ��Ѵ�. ��ü�� �����.
				rc.turnOn();
				rc.setVolume(5);
				rc.setMute(true);
				rc.setMute(false);
				rc.turnOff();
				System.out.println();
				
				rc = ad;
				rc.turnOn();
				rc.setVolume(5);
				rc.setMute(true); //��������� �����Ǿ���. �������̽����� ������ ����Ʈ�� �״�� �����޴´�.
				rc.setMute(false); //�������̽� ������ �޴´ٸ� �������̽��� �����ϴ� ��ü���� ���Ե� �� �ִ�.
				rc.turnOff();
				System.out.println();
				
				
	}
}

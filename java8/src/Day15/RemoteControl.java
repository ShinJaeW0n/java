package Day15;

public interface RemoteControl {

	//�Ϲ�Ŭ�������� ��� ������� public static �� �ٿ���� �ߴµ�
	//�������̽����� �ʵ�� ������ �빮�ڷ� ������Ѵ�. 
	//public static�� �ڵ����� �����Ǳ� ������ ���� ������� �ʾƵ��ȴ�.
		
		//����ʵ�
		int MAX_VOLUME = 10;
		int MIN_VOLUME = 0;
	
		//�߻�޼ҵ�
		void turnOn();
		void turnOff();
		void setVolume(int volume);
		
		//7���������� �Ϲ�(����Ʈ) �޼ҵ�� ���� �� ����. 8�������ʹ� �����ϰ� ��.(�տ� default�� ����).
		
		//����Ʈ�޼ҵ�
		default void setMute(boolean mute) {
			if(mute) {System.out.println("���Ұ� ���¸� �����մϴ�.");
			}else {System.out.println("���Ұ� ���¸� �����մϴ�.");
			}
		}
			
		//���� �޼ҵ�
		static void changeBattery() {
			System.out.println("�������� ��ȯ�մϴ�.");
		}
			
			
		}


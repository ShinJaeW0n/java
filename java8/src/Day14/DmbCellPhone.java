package Day14;

public class DmbCellPhone extends CellPhone {
			
			int channel;
			
			//�����ڰ� �̷��� �ϳ��� ������ ����Ʈ �����ڰ� ������ �ʴ´�.
			DmbCellPhone(String model, String color, int chennel) {
				this.model = model; //�θ��� �ʵ嵵 ���� �� �ִ�.
				this.color = color;
				this.channel = chennel;
			}


				void turnOndmb() {
					System.out.println("DMB�� �մϴ�.");
				}
				
				void turnOffdmb() {
					System.out.println("DMB�� ���ϴ�.");
				}
				
				void setChannel(int channel) {
					this.channel = channel;
					System.out.println(channel + "���� ä���� �����մϴ�.");
				}

}

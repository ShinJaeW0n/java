package Day12;

public class Car { // Ŭ������ �빮�ڷ� ����!!! ���ϸ�� ������ Ŭ������ public�̾���Ѵ�. 
	//���赵 ������ ����.
							/* �ʵ� , ��ü�� �Ӽ� */
			String company = "����ڵ���";  //car���ٰ� ���� �ʱ�ȭ
			String model = "���";
			String color = "�Ķ�";
			int maxSpeed = 250;
			int speed = 0;
	
				/*������*/
			Car(){ //<= �⺻������.  �����ڸ� �������� ������ �⺻ �����ڰ� �ڵ����� �ۼ��˴ϴ�.
				//�����ڸ� ������ָ� �⺻ �����ڴ� �ڵ����� �������������.
//				this.company = "����ڵ���";
//				this.color = "����";
//				this.maxSpeed = 300;
				this("����ڵ���" , "����" , 300); //�̷��� �ڱ� �ڽ��� ȣ���ؼ� �� �� �ִ�. �ڵ带 ���� �� ����.
				
				}
			
			
			//�Ű������� ������ ���� ������� ������ �� �ְ� ���� �����ڵ��� ���� �� �ִ�. �����ε�
			//�����ڴ� �ʿ��Ѹ�ŭ �ߺ�����(����) �� �� �ִ�.
			
			Car(String company, String col, int maxSpeed){
				this.company = company; //�ʵ� company�� �Է��ؾ��ؼ�. this.company = car.company
				color = col; //�Ű������� �̸��� ���ϴ´�� �ٲ� �� �ִ�. ������ �̸��� �ٸ��� ������ this�� �����.
				//���� �̸��� ����Ҷ��� �ʵ�� �Ű������� ����������ؼ� this�� ���������.
				this.maxSpeed = maxSpeed; //�̸� �Ȱ��� �ϰ� this�� ����ϴ� ���� �� ���� ��ȣ�Ѵ�. �� �̷��� ����.
				//������ ���Ŀ��� �� ���� �� �� ����. �� ���� ��밡���ϴ�.
				//���� �ٲܷ��� ��Ʈ������ . �� �̿��ؾ��Ѵ�.
			}
			
			Car(String color, int maxSpeed){
				this("����ڵ���", color, maxSpeed); //�ڱ� �ڽ��� ȣ���ؼ�, �� �ڽ��� ȣ���Ҷ��� this�� ����Ѵ�. 
			}
			
			Car(int maxSpeed){
				this("����ڵ��� " , "����", maxSpeed);
//				this.company = "����ڵ���";
//				this.color = "����";
//				this.maxSpeed = maxSpeed;
			}
			

			
			
			
			
//			Car(String company, int maxSpeed, String color){
//				}
//			
//			Car(String color, int speed, int maxSpeed){
//				}
//			
//			Car(String company, String color, int maxSpeed, int speed){
//				
//			}
//			
//			//��� �ȵȴ�. �ڷ����� ���°� �����ϸ� �ߺ����� �� �� ����. �ڷ��� ���°� �ٸ��ų� ������ �ٸ��ų� �ؾ� 
//			//�ߺ� ���ǰ� �ȴ�.!!
////			Car(String color, String company, int maxSpeed){
////				
////			}
//			
//			//��� �ȴ�. �ڷ��� ���°� �߿��ϴ�. ex)int, String ��..
//			Car(int color, String company, int maxSpeed){
//				
//			}
			
				/*�޼��� ����*/
			void accel() {
				speed+=10; //this.speed�� �� ��Ȯ�ϴ�.
				if(speed > maxSpeed) {
					speed = maxSpeed;
				
				
				}
				System.out.println("���� �ӵ�: " + speed);
			}
			
			void brake(){
				speed = 0;
				System.out.println("���� �ӵ�: " + speed);
				
			}






}

package Day19;

import java.awt.Toolkit;



public class BeepClass {
		
		public static void main(String[] args) {
			Toolkit tk = Toolkit.getDefaultToolkit();
			System.out.println("���� �������: " + Thread.currentThread().getName()); // <-������ �̸�.
			
			//�갡 ������1
			Thread t1 = new Thread(new Runnable() { //�͸�����ü ���ʺ�
				
				@Override
				public void run() {
					for(int i= 0; i <5; i++) {
				
						tk.beep(); //������ 5�� ����.
						try {
						Thread.sleep(1000); //1�ʵ��� ����.
						}catch( InterruptedException e ){
							
						}
					
						
					}
					
				}
			});
			
			
			    //������2 //������� ����� ������� ��ȣ�� �Է¹޴´�.
				t1 = new Thread(() -> { //���ٽ� ���ʺ�
				
				System.out.println("t1 �������: " + Thread.currentThread().getName());	
				for(int i= 0; i <5; i++) {
					tk.beep(); //������ 5�� ����.
						try {
						Thread.sleep(1000); //1�ʵ��� ����.
						}catch( InterruptedException e ){

				}

			}

		});
				t1.start(); //������ ���� �޼ҵ�. ������� �ݵ�� start�� ����� ����ȴ�.
				
				for(int i= 0; i <5; i++) {
					System.out.println("���");
					try {
					Thread.sleep(1000); //1�ʵ��� ����.
					}catch( InterruptedException e ){
						
					}
				}
	}
}
			
	


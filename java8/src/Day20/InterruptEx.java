package Day20;

//interrupt -2
public class InterruptEx {
	
		public static void main(String[] args) {
			Thread thread = new PrintThread2();
			thread.start();
			
			try {
				Thread.sleep(1000);
			}catch (InterruptedException e) {}
			
			thread.interrupt(); //Ÿ�� �����带 ���ͷ�Ʈ. �빮�� ���� �ڱ��ڽ��� ���ͷ�Ʈ�ϰ� �Ǽ�.
		} 	

}

package Day20;


public class StatePrintThread extends Thread {

		private Thread targetThread;
		
		public StatePrintThread (Thread targetThread) {
			this.targetThread = targetThread;
		}


		public void run() {
			while(true) { //������ ���¸� 0.5�ʿ� �ѹ��� ���
				Thread.State state = targetThread.getState(); //Ÿ�پ������� ������� ���.
				System.out.println("Ÿ�� ������ ����: " + state);
				if(state == Thread.State.NEW) { //������Ʈ�� ���θ��� ���¶�� Ÿ�Ͼ����带 �����ض�.
						targetThread.start();
				}
				if(state == Thread.State.TERMINATED) { //������Ʈ�� ����Ǿ��ٸ�
						break;
				}
				try {
					Thread.sleep(500); //0.5�ʰ� �Ͻ�����
				}catch(Exception e) {}
			}
		}
}


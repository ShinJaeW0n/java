package Day20;

		//�ٸ� �����忡�� ����纸 yield - 1
public class ThreadA extends Thread {

		public boolean stop = false;
		public boolean work = true;
		
		public void run() {
			while(!stop) {
				if(work) {
					System.out.println("ThreadA �۾� ����");
				} else {
					Thread.yield(); //�ڱ��ڽ� ������A�� �纸�ϰԵȴ�.
				}
			}System.out.println("ThreadA ����");
		}
}

package Day20;

		
		//�ٸ� �����忡�� ����纸 yield - 3
public class YieldEx {
		public static void main(String[] args) {
			ThreadA threadA = new ThreadA();
			ThreadB threadB = new ThreadB();
			
			threadA.start();
			threadB.start();
			
			try {Thread.sleep(3000);} catch (InterruptedException e) {} 
			threadA.work = false; //a�� �纸�ϰ� �ǰ� b�� ��� ���ư�.
			
			try {Thread.sleep(3000);} catch (InterruptedException e) {}
			threadA.work = true; //a�ٽ� ���ư�.
			
			try {Thread.sleep(3000);} catch (InterruptedException e) {}
			threadA.work = true; //2�� �� ����.
			threadB.work = true;
			
			
			
		}

}


public class ThreadNameEx {

		public static void main(String[] args) {
			Thread maiThread = Thread.currentThread();
			System.out.println("���α׷� ���� ������ �̸�: " + maiThread.getName());
			
			ThreadA threadA = new ThreadA();
			System.out.println("�۾� ������ �̸�: " + threadA.getName());
			threadA.start();
			
			ThreadB threadB = new ThreadB();
			System.out.println("�۾� ������ �̸�: " + threadB.getName());
			threadB.start();
			
		}
}

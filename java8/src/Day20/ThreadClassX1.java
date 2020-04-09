package Day20;

public class ThreadClassX1 extends Thread{

	//������ �ǽ����� -1
	
		int delay;
		
		ThreadClassX1(String name, int delay) {
			super(name);
			this.delay = delay;
		}
		
		@Override
		public void run() {
			try {
				while(true) {
					System.out.println(getName() + " ");
					Thread.sleep(delay);
				}
			} catch (Exception e) {
				System.out.println("error"); 
				return;
			}
		}
		
		public static void main(String[] args) {
			ThreadClassX1 t1 = new ThreadClassX1("������", 500);
			ThreadClassX1 t2 = new ThreadClassX1("������2", 700);
			
			t1.start();
			t2.start();
		
		
		}
		
		
		
}

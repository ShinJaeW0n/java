package Day21;


		//������ �ǽ����� - 1
	public class ThreadClassEx extends Thread{
		int delay;
	
			public ThreadClassEx(String name, int delay) {
				super(name);
				this.delay = delay;
				}

			@Override
			public void run() {
				
				try {
					
				for(int i = 0; i < 5; i++) {
					System.out.println(Thread.currentThread().getName()); //���� �ڽ��� �̸��� ������.
					Thread.sleep(delay);
					}
				}
					catch (Exception e) {
				
					System.out.println("error"); 
					return;
				}
				 
				}
					
			
				
			
			
			public static void main(String[] args) {
				ThreadClassEx t1 = new ThreadClassEx("������1", 300);
				ThreadClassEx t2 = new ThreadClassEx("������2", 800);
				ThreadClassEx t3 = new ThreadClassEx("������3", 400); 
				
				//���ÿ� ����Ǽ� 1,2,3 ������ �ٲ� �� �� �ִ�.
				
				t1.start();
				t2.start();
				t3.start();
				
				
			}
			
			
	
}

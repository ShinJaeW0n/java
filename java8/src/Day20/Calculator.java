package Day20;

	//������ ����ȭ1 // ��Ƽ �����尡 ���� ��ü�� �����Ҷ� ����� ����.
	//���� ��ü�� ������ ������ 1, 2. // 1�� ������ ���� 2�� �����鼭 ������ ������ �ٲ�������.
public class Calculator {
		
		private int memory;
		
		public int getMemory() {
			return memory;
		}
				//synchronized ����ȭ. �س����� 1���� ���� �� 2�� ��µ�. ����1�� ���������� �޸��ʵ带 ��ų��´�.
		public synchronized void setMemory(int memory) {
//			synchronized (this) { �� ����ȭ
				
			
			this.memory = memory;
			try {
				Thread.sleep(2000); //2�ʵ��� ����.
			}
			catch(InterruptedException e) {}
//			}	
			//2�ʵ��� �����ߴٰ� �̰��� ����ض�.
			System.out.println(Thread.currentThread().getName() + ": " + this.memory);
		
		}
}
		
		
	


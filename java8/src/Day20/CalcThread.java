package Day20;

public class CalcThread extends Thread{
	
			//������1
	
		public CalcThread (String name) {
			setName(name); //�̸��� �������ֵ��� ��.
		}


		public void run() {
			for(int i = 0; i<2_000_000_000; i++) {
				//20��� �ݺ��Ѵ�.
			}
			System.out.println(getName()); //�������� �̸��� ����϶�.
		}
}

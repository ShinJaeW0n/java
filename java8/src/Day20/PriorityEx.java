package Day20;


			//������2
public class PriorityEx {

		public static void main(String[] args) {
			
			for(int i = 0; i<=10; i++) {
				Thread thread  = new CalcThread("thread" + i);
				if(i != 10) { //������ �̿��߱⿡ 10���� ���ÿ� �����.
					thread.setPriority(Thread.MIN_PRIORITY);
				}else {
					thread.setPriority(Thread.MAX_PRIORITY);
				}
				thread.start();
			
				//�켱 ������ ���� ���⿡ 10�� ���� ���� �����Ű�
				//�ؿ� �ֵ��� �������� ���� : ������ �켱�����̱� ������ ��ǻ�Ͱ� �˾Ƽ� �����ϴ� ������ �����ϱ� ������, �����ϰ� ����.
				//�����Ҷ����� ���� �����°� �޶�����.
			}
			
		}
}

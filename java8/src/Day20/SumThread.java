package Day20;

			//join 1 (�ٸ� �޼ҵ尡 ���� �� ������ ��ٷ� �ִ°�)
			
public class SumThread extends Thread {

		private long sum;

		public long getSum() {
			return sum;
		}

		public void setSum(long sum) {
			this.sum = sum;
		}
		
		public void run() {
			for( int i = 0; i<=1_000_000_000; i++) { //5050 1���� 10����� �����ִ� ����.
				sum+=i;
			}
		}
		
}

package Day20;

	//join 2 (�ٸ� �޼ҵ尡 ���� �� ������ ��ٷ� �ִ°�)
		public class JoinEx {
			public static void main(String[] args) {
				SumThread t = new SumThread(); //������ ����
				t.start();
				
				try {
					Thread.sleep(10); //�����Ҷ����� ����� �ٸ��� ��?-sleep���� 100���� 1�� ���� �߰����� ����� ���� �������� ���̴�.
					t.join(); //t�� ������ ����(terminated)�� �Ŀ��� ������ �� �ִ�. //�׷��� ���� �ջ갪�� �� �� �ִ�.
				} catch (InterruptedException e) {}
				
				System.out.println(t.getSum()); //�濡 ����� ���� ������ �ȴ�.
				
				
				
			}
			
			
		}	

package Day14;

public class OverrideChild extends OverrideParent {

		void method3() {
			System.out.println("�ڽ� �޼ҵ�3");
		}
		
		//@ - ��ǻ�Ϳ��� �˷��ֱ� ���� �������̼�
		//�θ��� �޼ҵ� �� ����, �θ�� �Ȱ��� ���¸� �����Ͽ����Ѵ�.
		@Override //<-���� ����� �׳� ���ο� �޼ҵ带 ����� ��.
		//�� �� ������ source���� �������̵� �޼ҵ带 �����ؼ� �ڵ����� �߰��ϴ� ������
		//�ڵ��ý����� �̿��ϸ� ��Ÿ�� �ȳ��� �ڵ��ӵ��� ��������..
		void method2() {
		System.out.println("�ڽ� �޼���2");
		
		}
		
		
	
}

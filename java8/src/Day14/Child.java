package Day14;

public class Child extends Parent  {
		
		//�θ��� �����ڰ� �Ű������� �����ٸ�, 
		//�θ� ����Ʈ �����ڰ� ���ٸ�, �ڽ��� �����ڿ� super��� �θ��� ������ȣ����
		//��������� �־�����Ѵ�.
		Child(String name){
			super(name); 	//��� ������� ������ �ڵ������ȴ�.
			
			System.out.println("�ڽ��� �����մϴ�.");
		}
}

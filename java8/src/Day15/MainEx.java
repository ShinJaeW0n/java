package Day15;

public class MainEx {
		public static void main(String[] args) {
			/*����ƽŬ����*/
			
			A.C.field2 = 10;		//static ����� ��ü���� ����� �����մϴ�.
			A.C.method2();
			A.C c = new A.C(); // <-��ü�� ����� �ν��Ͻ� ��� ȣ�� ����
			c.field1 = 10;
			c.field2 = 10;
			c.method1();
			c.method2();
			
			
			/*�ν��Ͻ� ��� Ŭ����*/
			
			A a = new A();
			A.B b = a.new B(); //A��� ��ü�� �־�� B�� ����� �� �ִ�. �ν��Ͻ� ��� Ŭ������ ��üȭ(�������Ŭ������ ��üȭ�� �ڵ尡 �ٸ���.)
			b.field1 = 10;
			b.method1();
			
			a.method();//���� Ŭ���� D�� ����ϴ� �޼ҵ�.
			
			
		}
	
	
}

package Day15;


/*��ø */
public class A {
	
	A(){
		System.out.println("A��ü�� ������");
	}
	
			
	/* �ν��Ͻ� ��� Ŭ���� */
	class B { // <-Ŭ���� �����ϴ� ���
		B() {
			System.out.println("B ��ü�� ������.");
		}

		int field1;

		//static int field2; //���� �Ұ���.
		
		void method1() {
			}
		// static void method2;
		}
	
	
	/*���� ��� Ŭ����*/
	
	static class C{ // <-Ŭ���� �����ϴ� ���!! 
		C(){
			System.out.println("C ��ü�� ������");
		}
		
		int field1;
		static int field2;
		
		void method1() {
			
		}
	
		static void method2() {
			
		}
	
	}
	
	void method() {
		/*���� Ŭ����*/
		class D {
			D() {
				System.out.println("D��ü�� ������");
			}
			
			int field1;
			
			//static int field2;
			void method1(){
				
			}
			//static void method2(){}
		}
			D d = new D();
			d.field1 = 3;
			d.method1();
		
	
	}
	
	
	
	
	//���ο��� ����� ��!!!
	//�ν��Ͻ��� ����ƽ�� �ν��Ͻ� �Ѵ� ��밡��.
	//����ƽ�� ����ƽ�� ��밡��.
	
	
	//�ν��Ͻ� �ʵ�
	
	B outerfield1 = new B(); // (o)
	C outerfield2 = new C(); // (o)

	
	//�ν��Ͻ� �޼ҵ�
	
	void method1() {
		B var1 = new B(); //(o)
		C var2 = new C(); //(o)
	}
	
	
	//���� �ʵ� �ʱ�ȭ
	//static B outerfield3 = new B(); // (x) A��ü ����
	static C outerfield4 = new C(); // (o) ������ ���� //���ο��� ����ƽ����� ����ƽ�� ����Ѵ�. �ֳ��ϸ� ���� �ε��Ƿ��� ��ü ���� ���� �ؾ��ؼ�.
	
	
	//�����޼ҵ�
	
	static void method2() {
		//B var1 = new B(); // (x) A��ü ����
		C var2 = new C(); // (o) ������ ����
	}
	
	
	
			
			
}

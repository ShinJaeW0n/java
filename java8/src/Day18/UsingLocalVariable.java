package Day18;

public class UsingLocalVariable {
	
		//���ٽ� final ��ȯ
	
	void method(int arg) {// arg�� final Ư���� ����.
		int localVar = 40; // localVar�� finalƯ���� ����.
		//���ٴ� �޼ҵ������� �ȿ� ���� �ٲٴ°� ���ȵ�.
		//���ٸ� ȣ���ϸ� �ڵ����� final�� ��ȯ��.
		
		//arg  = 31;		//final Ư�� ������ ���� �Ұ�, ���ٽ��� ȣ���ϸ� ���� �ٲ��� ���Ѵٴ� ��.
		//localVar = 41;	//final Ư�� ������ ���� �Ұ�
		
		//���ٽ�
		MyFunc fi = () -> {
			//���ú������ 
		System.out.println("arg: " + arg);
		System.out.println("localVar: " + localVar + "\n");
		};
		fi.method();
		
		
	}
		//���� �޼ҵ�� �̷��� ���� �ٲٴ°� ����. ������ ���ٽ�ȣ���ϸ� ����
		void method2(int x) {
			System.out.println(x);
			x = 50;
			System.out.println(x);
		}

}

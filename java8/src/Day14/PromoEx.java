package Day14;

public class PromoEx {
		public static void main(String[] args) {
			PromoChild pc = new PromoChild();
			pc.method1();
			pc.method2();
			pc.method3();
			
			//�ڽ��� �θ� ������ �����մϴ�.
			PromoParent pp = new PromoChild();
			pp.method1();
			pp.method2();//�θ� ���ԵǴ��� �������̵��� �޼ҵ尡 ���.
//			pp.method3(); // <= �θ��� �����̱� ������ �θ𿡴� method3�� ����. �׷��� method3 ����� �Ұ����ϴ�.
			
//			pc = pp;  //�ڽĿ� �θ� ������ �� �����ϴ�.
				
			
			//���� ����ȯ , �θ��� ���¿��� �ڽ����� �ٲ�� �ڽĸ޼ҵ带 ȣ���� �� �ִ�.
			pc = (PromoChild)pp; // <- ������ �ڽĿ� �θ� ������ �� �ִ�.
			pc.method1();	//�θ��� ��ü�� �ڽ��� ��ü�� ���Ե� ������ �������� �ڽ� ��ü����߸� �մϴ�.
			pc.method2();
			pc.method3();
			
			
			PromoParent pp2 = new PromoParent();
					
					//instanceof ->�ڷ��� ���¸� Ȯ���Ҷ� ���, ����ȯ�� �������� boolean ������ ��ȯ�մϴ�. ��(��ü) ��(Ÿ��)
			if (pp instanceof PromoChild) {
				pc = (PromoChild)pp;
				pc.method3();
			}else {
				System.out.println("��������ȯ�� ����� �� �����ϴ�.");
			}
			
			
//			pc = (PromoChild)pp2;
//			pc.method3(); // <- ��������ȯ�� ������ ���·� ������ �����մϴ�. pp2�� ���θ����ϵ� ���� �ƴϱ� ������ ����� �ȵ�.
//			
			
	}

}

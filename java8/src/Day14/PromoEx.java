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
				
			
			//���� ����ȯ
			pc = (PromoChild)pp; // <- ������ �ڽĿ� �θ� ������ �� �ִ�.
			
			
	}

}

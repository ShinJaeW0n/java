package Day16;

public class ProductEx {

	public static void main(String[] args) {
		Product<TV, String> p1 = new Product<TV, String>();
		p1.setKind(new TV()); //��ü�� ��¾ȵǰ�
		p1.setModel("�Ｚ �ĺ�");
		System.out.println(p1.getModel());
		
					//int�� �⺻���¶� ���ȵ�.
		Product<Car, Integer> p2 = new Product<Car, Integer>();
		p2.setKind(new Car());
		p2.setModel(30); // new Integer(30) ���� ���൵ ������ �ڵ����� �ڽ̵Ǽ� 30 �������.
		System.out.println(p2.getModel());
		
		
		
		
	}
}

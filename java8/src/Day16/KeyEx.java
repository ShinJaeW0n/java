package Day16;

public class KeyEx {

			public static void main(String[] args) {
				Key k1 = new Key(1);
				Key k2 = new Key(1);
				
				System.out.println(k1 == k2);
				System.out.println(k1.equals(k2)); //equals�� ������ �ϸ� ������ �ּҺ񱳰� �ƴ϶� ���ϴ� ���� �񱳷� ����� �� �� �ִ�.
				//equals�� ��ü�� ��ü�� ���� �� �ּҺ��ε� �������ϸ� ���̳� �ʵ�� ���� �� �ִ�.
				
				
				//�ּҰ� �ٸ��� �ؽ��ڵ尡 �ٸ��� ���´�.
				System.out.println(k1.hashCode()); //�ؽ��ڵ嵵 �������ؼ� ����� �� �ִ�.
				System.out.println(k2.hashCode());
				System.out.println(k1); //����Ҷ��� ���ڿ��� ��ȯ�ؾ��ϱ� ������ �ڵ����� toString���� �ȴ�.
				//toString�� �������ϸ� ���ϴ� ��� ��°����ϴ�.
				
			}
				
	
}

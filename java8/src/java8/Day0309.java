package java8;

public class Day0309 {
	public static void main(String[] args) {
		int daegu = 2_000_000; // �� ���ڸ� �������ֱ� ���ؼ� _������. �ڹٿ����� _�� �ƹ��͵� �ƴ϶�� �ν��Ѵ�.
		int global = 100_0000;
		
		String str = ((daegu >= global)? "�뱸������" : "�뱸��"); // <- ���׿�����
		//�뱸�����ð� ���ڿ��̱� ������ string�� ����ȴ�.
			
		System.out.println(str);
		
		//System.out.println(daegu >= global?"�뱸������":"�뱸��"); //����? ��:����
		
		
		
		
	}
}

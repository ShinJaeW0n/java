package java8;

public class Day1004 {

	public static void main(String[] args) {
		int[] arr1 = {10,20,30,40,50};
		int[] arr2 = {0,0,0,0,0}; // 0���� ä���� ũ�Ⱑ 5�� �迭
		int[] arr3 = new int[5]; //�迭�� ũ�Ⱑ 5�� ���� ���� �迭. ũ�⸸ ����. ���� �־����� �ʾ���.
		
		//���� �Է����� ������ 0�� ����.
		for(int i =0; i<arr3.length; i++) {
			System.out.println(arr3[i]);
		}
		
		//false�� 0�̱� ������.
		boolean[] arr4 = new boolean[5];
		for(int i =0; i<arr4.length; i++) {
			System.out.println(arr4[i]);
		}
		
		//object�� �ƹ��͵� ���ٴ� null�� ���. ������, ���۷��� Ÿ��  = �⺻�� null
		String[] arr5 = new String[5];
		for(int i =0; i<arr5.length; i++) {
			System.out.println(arr5[i]);
		}
	
		//arr3 = {10,20,30,40,50}; // <=�̷��� �ϸ� �ȵ�. �߰�ȣ �ʱ�ȭ�� ������ �ѹ��� ��밡���մϴ�.
		//�迭�� ���ʿ� �ѹ��� �ʱ�ȭ����. �ι�°���� �߰�ȣ�� �ʱ�ȭ�ϴ� ���� �Ұ���.
		arr3[0] = 10; //������ �ε����� �����ϴ� ���� �����մϴ�.
		arr3[1] = 20;
		arr3[2] = 30;
		arr3[3] = 40;
		arr3[4] = 50;
		//�ڹ��� �迭�� ��ü�� ����. �ڹٴ� ��ü�� �������� �� �ִ�.
		
		
	
	}
	
	
	
}

package java8;

public class Day1101 {

	/*1���� 100���� �����ϴ� �迭�� ����� ��ü�� ���� ����϶�*/
	
	public static void main(String[] args) {
		//���� �迭�� 1���� 100�� �����ϴ� ������ ����.
		int[] a = new int[100];
		
		for(int i = 0; i <a.length; i++) {
			a[i] = i + 1; //1���� 100���� ����Ϸ���	
			
		}
		
		for(int i=0; i < a.length; i++) {
			System.out.print(a[i] + " ");
			//1���� 100���� ���� �� 5�� ������ �������� ��������.
			if((i+1)%5==0) {
				System.out.println();
			}
		}
	
		int sum = 0;
		for(int i =0; i <a.length; i++) {
			sum += a[i];
		}
		System.out.println("1~100������ ��: " + sum);
	
	}
	
}

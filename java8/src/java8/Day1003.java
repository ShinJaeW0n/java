package java8;

public class Day1003 {

		public static void main(String[] args) {
		int[] arr = {10,20,30};
		int sum = 0;
		for(int i = 0; i < 3; i++) {
			sum+=arr[i];
		}
		System.out.println(sum);
		
		int[] arr2 = {10,20,30,40,50};
		int sum2 = 0;
		double avg2 = 0;
		for(int i = 0; i <5; i++) {
			sum2+=arr2[i];
		}
		avg2 = sum2 / 5.0; // int / int �� 5.0���� �Ǽ��� �ٲ������. ��->ũ �� ������ �ٲ��ָ� �ڵ� ����ȯ��.
		System.out.println("�迭�� �հ�: " + sum2);
		System.out.println("�迭�� ���: " + avg2);
		System.out.println("�迭�� ����: " + arr2.length); // lengh�� �迭�� ũ��(����)�� ����Ѵ�.
		//arr�� ���̸� �����.	
		
		
		
		int[] arr3 = {10,20,30,40};
		System.out.println("arr�� ũ��: " + arr3.length);
		
		for (int i = 0; i<arr3.length; i++) {
			System.out.println(arr3[i]);
		
		}
		
		
			
	}
}

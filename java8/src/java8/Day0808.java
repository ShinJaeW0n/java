package java8;

import java.util.Scanner;

public class Day0808 {
	public static void main(String[] args) {
	
		//�� ���� �Է¹޾� �� ���� �ִ�����, �ִ������� ����϶�.
		//�� ���� ���� �ִ�����*�ּҰ����
		//3 12 => [3, 12] 2 5 =>[1,10]
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�� ���� �Է��Ͻÿ�: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int min = 0; //�ּҰ����
		int max = 0; //�ִ�����
							
		
						//12�� ���ڳ����� ���°�.
		for (int i=1; i<=Integer.MAX_VALUE; i++) {
			if(i % a == 0 && i % b == 0) {
				min = i; //�ּҰ����
				break; //12�� ������ �� �ʿ䰡 ���
			}
		}
		
		max = a * b / min;
		System.out.println("�ּҰ���� " + min + ", �ִ�����" + max);
		sc.close();
		
		
		
		
//		min = a*b;
//		max = a/b;
//		System.out.println("�ִ�����" + min/a);
//		System.out.println(max/b);
	
	}
}

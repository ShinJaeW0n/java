package java8;

import java.util.Scanner;

public class Day1107 {

	public static void main(String[] args) {
		//0���� �Է¹��� ������
		//1���� ������ �Է¹޾Ƽ� 5�� ����� ������ ���� ���
		//��³���: �Է¹��� ��, 5�� ����� ����, 5�� ����� ��.
		Scanner sc = new Scanner(System.in);
		System.out.print("������ 1�� �Է��Ͻÿ�: ");
		int num = sc.nextInt();
		int cnt = 0;
		int sum = 0;
		
		for(int i = 1; i <= num ; i++) {
			if (i % 5 == 0) {
				cnt++;
				sum+=i;
			}
		}
		
		//���� �������ͼ�.
		System.out.println("5�� ����� ������: " + cnt + " ��");
		System.out.println("5�� ����� �հ��: " + sum);
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("������ �Է��Ͻÿ�: ");
//		int me = sc.nextInt();
//		int sum = 0;
//		int cnt = 0;
//		
//		for(int i = 0; i <= me ; i++) {
//			if (i % 5 == 0){
//				cnt++;
//				System.out.println("5�� ����� ������: " + cnt + " ��");
//				sum+=i;
//				System.out.println("5�� ����� �հ��: " + sum);
//			}else { 
//				break;
//			}
//		System.out.println();
//		
//		}
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}

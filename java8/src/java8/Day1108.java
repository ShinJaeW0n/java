package java8;

import java.util.Scanner;

public class Day1108 {
			/* 2���� ������ �Է¹޾Ƽ� ū���� ������ ��� 
			 * �ݵ�� if~else�� ����ϼ���.
			 */
			public static void main(String[] args) {

				Scanner sc = new Scanner(System.in);
				System.out.print("������ 2�� �Է��϶�: ");
				int[] a = new int[2];
				for(int i =0; i < a.length; i++) {
					a[i] = sc.nextInt();
				}
				
				if(a[0] > a[1]) {
					int temp = a[0];
					a[0] = a[1];
					a[1] = temp; //�̷��� �ϸ� ������ �տ����� �������� �ȴ�.
				}
				System.out.println("������: " + a[0] + ",  ū ��: " + a[1]);
				sc.close();
				
				
				
//				Scanner sc = new Scanner(System.in);
//				System.out.print("1�� ������ �Է��϶�: ");
//				int a = sc.nextInt();
//				
//				System.out.print("2�� ������ �Է��϶�: ");
//				int b = sc.nextInt();
//				
//				int min = 0;
//				int max = 0;
//				
//				if(a>b) {
//					a = max;
//					b = min;
//					System.out.println("ū ��: " + max + " ������: " + min);
//				
//				}else {
//					b = max;
//					a = min; 
//					System.out.println("ū ��: " + min + " ������: " + max);
//				}
//				
//			sc.close();
				
				
				
	}
}

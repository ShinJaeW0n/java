package java8;

import java.util.Scanner;

public class Day0606 {
	
	public static void main(String[] args) {
		/* �� ���� ������� �Է¹޾Ƽ� ȭ�鿡 ����ϴ� ���α׷��� �ۼ��ϼ��� */
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �� ��? : ");
		int num = sc.nextInt();
		
		for(int i = 1; i<10; i++) {
			System.out.println(num + "x" + i + "=" + (num*i));
		}
		
		sc.close();
		
		
		
//		int r = sc.nextInt();
//		System.out.println(r + "���� :");
//		
//		for(i = 2; i <=9; i++) {
//			for(j = 1; j <= 9; j++) {
//				
//				System.out.println(r + "x" + j + "=" + (j*i) + "\t");
//			}
//			
//			System.out.println();
//		}
//		
		
	
	}

}

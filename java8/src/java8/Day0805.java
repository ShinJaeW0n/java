package java8;

import java.util.Scanner;

public class Day0805 {

	public static void main(String[] args) {
		/*
		 * �� ���� ������� �Է¹޾Ƽ�
		 *@
		 *@@
		 *@@@
		 *@@@@
		 *@@@
		 *@@
		 *@
		 *���� ���� ���·� ����ϼ���
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�� �� ����Ұ���(Ȧ���� �Է�): ");
		int r = sc.nextInt();
		if(r % 2 ==0) {
			System.out.println("¦�� �Է�. ���α׷� ����");
			System.exit(0);
		}
		int upLine = r/2;
		int downLine = r-upLine;
		
		for(int i=0; i<upLine; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("@");
			}System.out.println();
		}
		
		for(int i=downLine; i>0; i--) {
			for(int j = 0; j<i; j++) {
				System.out.print("@");
			}System.out.println();
		}
		
		
		
		
//		System.out.println();
		
//		for (int i = 0; i<r; i++) {
//			for(int j = 0; j<=i; j++) {
//				System.out.print("@");
//			}System.out.println();
//		}
//		
//		for (int i = r; i>0; i--) {
//			for(int j = 0; j<i; j++) {
//				System.out.print("@");
//			}System.out.println();
//		}
		
		
		
	}
	
}

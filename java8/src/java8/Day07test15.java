package java8;

import java.util.Scanner;

public class Day07test15 {

		public static void main(String[] args) {
			/*1���� 100���� �߿� 5�� ����� ���� ����ϼ���.*/
			int sum = 0;
			
			for (int i = 1; i <= 100; i++) {
				if (i % 5 == 0) {
					sum +=i;
					
				}
				
				} System.out.println("1���� 100������ �� �� 5�� ����� ��: " + sum);
			
		//1���� 50 �߿� 3�� ����� ȭ�鿡 ����ϼ���.
				
				
				
				for (int i = 1; i <= 50; i++) {
					if ( i % 3 == 0) {
						System.out.println(i);
						
					}
			}
				
			/*1���� 50 �߿� 3�� ����� �� �հ� ������ ����ϼ���.*/
				int sum2 = 0;
				int cnt = 0;
				
				for (int i = 1; i<=50; i++) {
					if(i % 3 == 0) {
						sum2 += i;
						cnt++;
						}
						
					}System.out.println("1���� 50���� �� �� 3�� ����� �� :" + sum2 
							+ " ������? : " + cnt);
					
				
				
		}
}
		



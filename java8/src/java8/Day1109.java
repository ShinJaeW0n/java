package java8;

import java.util.Scanner;

public class Day1109 {

	/*Ű����κ��� �� ���� �������� �Է¹޾Ƽ�, ���� ���ϴ� ���α׷� �ۼ��ϱ�
	 * �� �Է¹��� �� ���� ���� 500�� �ʰ��ϸ� ���α׷� �ߴ�, while, do while ����ϱ�. */
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			
			while(true) {
			System.out.print("2���� ������ �Է��϶�: ");
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			//2���� ���� ����.
			int res = num1*num2;
			System.out.println(num1 + "x" + num2 + "=" + res);
			
			if(res > 500) {
				break;
			}
			
			
			}System.out.println("��� ���� 500�� �ʰ��Ͽ� ���α׷��� �����մϴ�.");
			sc.close();
			
			
			
			
			
			
			
			
			
			

			
//			System.out.print("2���������� �Է��϶�: ");
//			int a = sc.nextInt();
//			int b = sc.nextInt();
//			
//			int c = a*b;
//			
//			do { 
//
//			 if(c>500){System.out.println("��� ���� 500�� �ʰ��Ͽ� ���α׷��� �����մϴ�.");	
//			}
//			
//			System.out.print("���� ���� �Է��Ͻÿ�: ")
//			
//			}while(c > 500);
//			System.out.print(a + "x" + b + "=" + c)
//			
			
		}
		}










package java8;

import java.util.Scanner;

public class Day07test01 {	
		public static void main (String[]args) {
		
			//2���� ������ �Է¹޾� ���� ���ٸ� same �ٸ��� different ���.
			
			Scanner sc = new Scanner(System.in);
			System.out.println("�� ���� ������ �Է����ּ���");
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			
			//���� �� �ڵ�.
//			System.out.print("ù��° ������ �Է��ϼ���: ");
//			int num1 = sc.nextInt();
//			System.out.print("�ι�° ������ �Է��ϼ���: ");
//			int num2 = sc.nextInt();
			
			if(num1==num2) {
				System.out.println("Same");
			} else {
				System.out.println("Different");
			}
			
//			���׿����ڸ� ����غ���(�� �ٸ� ����غ��Ŷ��)
//			String result = num1 == num2 ? "����" : "�ٸ�";
//			System.out.println(result);
//			sc.close();
			
			
			sc.close();
			
		}

}

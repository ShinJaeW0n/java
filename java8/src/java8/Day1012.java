package java8;

import java.util.Scanner;

public class Day1012 {
	public static void main(String[] args) {
		//5���� ������ �Է¹޾� �ִ밪�� ���ϱ�.
		
		//���� �Ѱ�
		System.out.print("5���� ������ �Է¹޾� �ִ밪�� ���ϴ� ���α׷�: ");
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		for (int i = 0; i < arr.length; i++) {
			System.out.print(i + 1 + "��° ������ �Է��ϼ���: ");
			arr[i] = sc.nextInt();
		}
		int max = Integer.MIN_VALUE; // int���� ���� ���� ��
		for (int num : arr) {
			if (max < num) {
				max = num;
			}
		}
		System.out.println("�ִ밪: " + max);
		
		
		
		
		
		
//		System.out.print("5���� ������ �Է¹޾� �ִ밪�� ���ϴ� ���α׷�: ");
//		Scanner sc = new Scanner(System.in);
//		
//		
//		
//		int[] number = new int[5]; 
//		int max = number[0];
//		int num;
//						
//		for(int i=0; i<number.length; i++) {
//			num = sc.nextInt();
//			number[i] = num;
//			
//			if(number[i] > max) {
//				max = number[i];
//			}
//			
//		}
//			System.out.println("�ִ밪�� " + max + "�Դϴ�." );
		
		
	
	
	
	}

}

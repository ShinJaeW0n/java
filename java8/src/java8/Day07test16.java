package java8;

import java.util.Scanner;

public class Day07test16 {
	
	//�������� 2�ܺ��� 9�ܱ��� ����ϼ���
	//��ø ����
		public static void main(String[] args) {
			
		for(int i = 2; i <= 9; i++) {
		for(int j = 1; j <= 9; j++) {
						
		System.out.print(i + "x" + j + "=" + (i*j) + "\t");
		}
		System.out.println();
		}
				
		
		/*�� ���� ������� �Է¹޾Ƽ� ������ּ���*/
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�� ���� ����Ұǰ���?: ");
		int r = sc.nextInt();
		System.out.println(r + "�� ���");
		
		for (int i = 1; i <= 9; i++) {
			System.out.println(r + "x" + i + "=" + (r*i));
			}
		
		sc.close();
		}
		
				
	}



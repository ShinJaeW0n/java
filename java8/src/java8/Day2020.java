package java8;

import java.util.Scanner;

public class Day2020 {
	public static void main(String[] args) {
		//��ĳ�ʸ� �ۼ��ϼ���
		//Scanner ch = new Scanner(System.in); 
		Scanner ch = new Scanner(System.in);		
		
		
		//int number1 , number2;
		int number1 , number2;
		
		System.out.println("number1 + number2�� ���� ���ʴ�� �־��ּ���.");
		System.out.println("�����̳� ����Ű�� ���� �������ּ���.");
		
		
		number1 = ch.nextInt();
		number2 = ch.nextInt();
		
		int result = number1 + number2;
		
		System.out.print("�� ���� �հ��");
		System.out.print(result);
		System.out.print("�Դϴ�.");
		
		ch.close();
		
	/*	number1 = 10;
		number2 = 20;
		
		number1 + number2;
		
		System.out.println("���� �Ϸ��ϼ���:");
		System.out.printf(number1 + number2, ch.nextInt());
		
		ch.close();
		
		*/
	}
}

package java8;

import java.util.Scanner;

public class Day2 {
	public static void main (String[] args) {
		Scanner ch = new Scanner(System.in);
		//��ĳ�� �Է����ְ� ����Ʈ ���ֱ�.
		int number1 , number2 , result;
		
		//ȭ�鿡 number1�� number2�� �Է��ϵ��� �ȳ������� ����� �ּ���.
		System.out.println("number1�� number2�� ���� ���ʴ�� �־��ּ���.");
		System.out.println("����� ���ͷ� ���� �������ּ���.");
		
		//�ۼ��� ��ĳ�ʷ� number1�� number2�� ���� �Է��ϼ���.(nextInt() ����ؾ���)
		number1 = ch.nextInt();
		number2 = ch.nextInt();
		
		//number1�� number2�� �հ踦 ������ּ���.
		result = number1 + number2;
		
		System.out.print("�� ���� �հ��");
		System.out.print( result);
		System.out.print("�Դϴ�.");
		
		ch.close();
		
		
	}		
}

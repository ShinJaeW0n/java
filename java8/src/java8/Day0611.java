package java8;

import java.util.Scanner;

public class Day0611 {
	public static void main(String[] args) {
		int intvalue;
		int resvalue = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڸ� �Է��ϼ���: ");
		intvalue = sc.nextInt();
		
		while (intvalue > 0) {
			resvalue *= 10;
			resvalue = resvalue + (intvalue % 10); //1�� �ڸ� ���� //10���� ������ 1�� �ڸ��� �����Ŵ�.
			intvalue /= 10;
			
		
		}
	
		System.out.println("�ٲ����: " + resvalue);	
	}
}

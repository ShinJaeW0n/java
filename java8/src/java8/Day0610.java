package java8;

import java.util.Scanner;

public class Day0610 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Ǻ��� �⵵ �Է�! : ");
		int year = sc.nextInt();
		
		//�����̳� �������� �����Ǹ� Ʈ���.
		if ((year%4 == 0 && year%100 != 0) || year%400 == 0){
			
			System.out.println(year + "���� �����̴�");
		}
		
		else {
			System.out.println("������ �ƴϴ�.");
		}
		
		
		
		sc.close();
	}
}

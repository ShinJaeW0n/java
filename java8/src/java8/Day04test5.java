package java8;

import java.util.Scanner;

public class Day04test5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//String st = "";
		 
		
		System.out.println("�̸�, �й�, ���� ������ �Է��ϼ���: ");
		String name = sc.next(); //������ ����Ͽ� //����-��������� �Ѱ��� ����Ÿ�� �ν�.
		
		//st = sc.next();
		System.out.println("���� �̸��� " + name + " �Դϴ�.");
		
		int no = sc.nextInt();
		System.out.println("�й��� " + no + " �Դϴ�.");
		
		int score = sc.nextInt();
		System.out.println("�׸��� ���������� " + score +" ���Դϴ�.");
		
		sc.close();
	}
}


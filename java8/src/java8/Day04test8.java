package java8;

import java.util.Scanner;

public class Day04test8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n , m;
		
		System.out.println("n�� ���� �Է�: ");
		n = sc.nextInt();
		System.out.println("m�� ���� �Է�: ");
		m = sc.nextInt();
		
		String stra = "n(" + n + ")";
		String strb = "m(" + m + ")";
		
		System.out.println("�Է� : " + stra + " , " + strb);
		
		
		String result = n >= m ? stra : strb ; 
		System.out.println("���: " + result);
		
		//System.out.println("n�� ��: " + n + "m�� ��" + m);
		//int x = (n>m)? n:m;
		//System.out.println("���:" + x); 
		
	}

}

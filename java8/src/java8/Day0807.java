package java8;

import java.util.Scanner;

public class Day0807 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("a��b�� ���� ���ʴ�� �Է��ϼ���:");
		int a = sc.nextInt(); 
		int b = sc.nextInt();

//		�� ������ ���������� �ؿ� !���� ������ �� ���־��δ�.	
//		if(a >= -10_000_000 && a <= 10_000_000) {
//		}else {
//			System.out.println("�Է¹����� �ʰ��Ͽ����ϴ�.");
//			System.exit(0);
//		}
		
		
		//-õ�� ~ õ�� ������ �Է��� �� �ִٴ� ���� �˷��ִ� ��.
		if(!(a >= -10_000_000 && a <= 10_000_000)) {
			System.out.println("a ���� �Է¹����� �ʰ��Ͽ����ϴ�.");
			System.exit(0);
		}
		
		if(!(b >= -10_000_000 && b<= 10_000_000)) {
			System.out.println("b ���� �Է¹����� �ʰ��Ͽ����ϴ�.");
			System.exit(0);
		}
		
		
		
		int min =0 , max =0 , sum =0;
		
		
		if(a>b) {
			max = a;
			min = b;
		}else if(a==b){
			System.out.println("a���� b������ ��: " + a);
			System.exit(0);
		}else {
			max = b;
			min = a;
		}
		
		for (int i = min; i<=max; i++) {
			sum+=i;
		}
		
		System.out.println("a���� b������ ��: " + sum);
		
		
//		for (int i = 0; i>=a; i++) {
//			
//		
//		if(a<b) {
//			System.out.println(a+i+b);
//		}else if (a>b) {
//			System.out.println(a+b+i);
//		}else if(a==b) {System.out.println(a);
//			
//		}else {break;
//		}
//		
//		}
//	
	
	
	
	}
}

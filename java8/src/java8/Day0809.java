package java8;

import java.util.Random;
import java.util.Scanner;

public class Day0809 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڸ� �Է��ϼ���: ");
		
		
		Random rd = new Random();
		
		
		for (int i = 0; i<=100; i++) {
		
		int me = sc.nextInt();
//		int com = rd.nextInt(99)+1;
		int com = 84;
		if(me<com) {System.out.println("�Է��Ͻ� ���ں��� �̻��Դϴ�.");
		
		}else if(me==com) {
			System.out.println("�����Դϴ�. ���α׷��� �����մϴ�.");
			System.exit(0);
			
		}else {
			System.out.println("�Է��Ͻ� ���ں��� �����Դϴ�. ");
		}
		
		}
		
		sc.close();
	
		
		}
	
}

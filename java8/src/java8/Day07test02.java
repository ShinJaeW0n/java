package java8;

import java.util.Scanner;

public class Day07test02 {
	
	//1���� ������ �Է��ؼ� �� ������ ¦���� Ȧ������ �Ǻ��ϴ� �ڵ�.
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("�����Է� :");
		int num1 = sc.nextInt();
		
		if (num1 % 2 == 0) {
			System.out.println("¦��");
		}else {
			System.out.println("Ȧ��");
		}
		
		
		//���׿����ڸ� �̿��Ϸ��� 2���� ������ ���;���.
//		String r = (int)(r % 2 == 0 ?) "¦��":"Ȧ��";
//		System.out.println(r);

		sc.close();
	}

	
}

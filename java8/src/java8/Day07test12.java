package java8;

import java.util.Scanner;

public class Day07test12 {

		//Ȧ���� $ ¦���� @ �� ��µǵ����϶�.
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("���ڸ� �Է��ض�: ");
		int line = sc.nextInt();
		
		//line�� 1�̶�� ������ i�� 0�̰ų� 1���� ���� ���̱� ������ j�� 1�� ����.
		for (int i = 0; i < line; i++) {
			for ( int j = 0; j <= i; j++) {
				if(j % 2 == 0) {
					System.out.print("$"); //ù��° ����� �� ¦������. -> ���α׷����� ���ڸ� 0���� ���� ������.
				} else {System.out.print("@"); // \�� ������ ����� �ȵ�. \\�̷��� �ؾ� ���ڰ� ��µ�.
			}
		}
		System.out.println();
	}
	
	}
}

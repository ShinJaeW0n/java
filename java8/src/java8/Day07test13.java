package java8;

import java.util.Scanner;

public class Day07test13 {
	
	public static void main(String[] args) {
		//�׽�Ʈ 12�� �Ųٷ� ����Ͻÿ�.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڸ� �Է��ض�: ");
		int line = sc.nextInt();
						//i�� line���� ���������� �ݺ��Ѵ�.
		
		//�ܺ� ������ �ٲٴ°� ���� ������ ���鶧 �� ����.
		for(int i = line; i > 0; i--) {
			for(int j = 0; j < i; j++ ){
				if ( j % 2 == 0 ) {
					System.out.print("$");
				}else {
					System.out.print("\\");
				}
			
			}
			System.out.println();
		}
		
//		for(int i = line; i > 0; i--) {
//			System.out.println(i);
//		}
		
	}
}

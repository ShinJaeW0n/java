package java8;

import java.util.Scanner;

public class Day07test14 {
		public static void main(String[] args) {
			//¦���� �Է¹����� �����Ű�� Ȧ�� �� ��츸 ��½�Ų��.
			//�����ߴ� �����ϴ� �ݺ����� �������� �ʴ´�.
			//������ ���ұ����� ���ε��� ����ؾ��Ѵ�.
			
			//�����Ҷ� ¦�� �Է� �� ���ᰡ �̻��ϰ� ��. -> ¦�� if���� for�� �ۿ� �����ϸ� �ذ�.
			Scanner sc = new Scanner (System.in);
			System.out.print("���� �Է��ض�: ");
			int line = sc.nextInt();
			
			if (line % 2 == 0) {
				System.out.println("���α׷��� �����մϴ�.");
				System.exit(0); //0���� �����ڵ� �⺻��.
			}
			
			int upLine = line / 2; // 9�� �־����� 2�� ������ 4.5�� ����. int �̱� ������ 4�� �� ���´�.
			int downLine = line - upLine; // 9���� 4�� ���� 5�� �ȴ�. 
			//�׷��� �� ���� ���ϸ� 9�� �����°��̴�.
			
			for (int i = 0; i < upLine; i++) {
				for (int j = 0; j <= i; j++) {
					System.out.print("*");
				}
			System.out.println();
			}
			
			
			for (int i = downLine; i > 0; i--) {
				for(int j = 0; j < i ; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			
//			for(int i = 0; i < line; i++) {
//				for(int j = 0; j <= i; j++) {
//					System.out.print("#");
//					
//					}
//				System.out.println();
//				}
//				
//				System.out.println();
//			
//			
//			for (int i = line-1; i > 0; i--) {
//				for(int j = 0; j < i; j++) {
//					System.out.print("#");
//					
//					}
//			System.out.println();
//			}
				
		}
	
		}


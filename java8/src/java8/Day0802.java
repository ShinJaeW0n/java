package java8;

import java.util.Scanner;

public class Day0802 {
	public static void main(String[] args) {
		//��ο��� 0����~9���� ����ϱ�
	for(int i = 0; i<10; i++) {
		System.out.println("hello world " + i);
		}
	
	System.out.println();
	
	//�� ������� �������Ѽ� �������� ����ϱ�
	for(int i = 9; i>=0; i--) {
		System.out.println("hello world " + i);
	}
		
	
	
	// ��ø ���� �̿��ؼ� @�� 5���� 7�� ����ϱ�
	for (int i = 0; i<7; i++) {
		for(int j = 0; j<5; j++) {  //j�� 5���� ���� ������ �ݺ��Ѵ�.
			System.out.print("@");
			
		}System.out.println();
		}
	
	System.out.println();
	
	//@�� 5���� 7�� ����ϱ�
	for (int i = 0; i < 7; i++) {
		System.out.println("@@@@@");
	}
	
	System.out.println();
	
	
	//���� ��¹����� 2,4���� # 1,3,5����  @
	for(int i =0; i<7; i++) {
		for(int j = 0; j<5; j++) { //5��(ĭ) 7��(��)¥���� ��µȴ�. 
			if(j % 2== 0) {
				System.out.print("@"); //���ڸ� 0���� ���� ������ 0�� ���� ���۵ǹǷ� Ȧ��@�� �־������.
			}else {System.out.print("#");
			
			}
			}
		System.out.println();//���� ���� ������ ����.
	}
	
	
	
	//���ڿ��� �Է¹޾Ƽ� for ������ ����ϱ�

	Scanner sc = new Scanner(System.in);
	System.out.print("���ڿ��� �Է����ּ���: ");
	String str = sc.nextLine();
	
	for(int i = 0; i < str.length(); i++) {
		System.out.println(str.charAt(i)); //���ڿ� �ѱ��ھ� �߶� ������ִ� ����.
	}
	System.out.println();
	
	
	}
}

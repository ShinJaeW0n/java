package java8;

import java.util.Scanner;

public class Day0612 {
		public static void main(String[] args) {
		System.out.println("�޼����� �Է��ϼ���");
		System.out.println("���α׷��� �����Ϸ��� q�� �Է��ϼ���.");
		
		Scanner sc = new Scanner(System.in);
		String inputString;
		
		//do������ �ѹ� �����ϰ� while�� ��. 
		//while�� �̾��ٸ� do������ ���� �ȵ�����.
		
		do {System.out.println(" > ");
			inputString = sc.nextLine(); //�����Է�
			System.out.println(inputString);
			
		}while (!inputString.equals("q"));//!��ǲ�� ����Ȱ� q�� �ƴ϶��
		System.out.println();
		System.out.println("���α׷� ����");
		
		}
}



package java8;

import java.util.Scanner;

public class Day05test1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("��ȣ�� �Է����ּ���: ");
		String r = sc.next();
		
		switch (r)
		{case "a" :
		case "A" :
			System.out.println("�Ƹ޸�ī��");
			break;
		
		case "C" :
		case "c" : 
			System.out.println("īǪġ��");
			break;
			
		case "L" :
		case "l" : 
			System.out.println("ī���");
			break;
			
		case "M" :
		case "m" : 
			System.out.println("ī���ī");
			
		}
	
		sc.close();
		
	}

}

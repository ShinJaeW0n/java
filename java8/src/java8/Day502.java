package java8;

import java.util.Scanner;

public class Day502 {

	public static void main(String[] args) {
		/*�Էµ� ���� ¦������ Ȧ������ Ȯ���ϴ� ���α׷�*/
		Scanner sc = new Scanner (System.in);
		int inputNumber = 0;
		System.out.println("Ȧ���� ¦���� �Ǻ��ϴ� ���α׷��Դϴ�.");
		System.out.print("���ڸ� �Է��� �ּ���: ");
		
		inputNumber = sc.nextInt();
//		String result = inputNumber % 2 == 0? "¦��" : "Ȧ��"; //���׿����ڸ� ���. ������ ���׿����ڴ� �� �ٸ� ��°���.
		String result = ""; //�������� 0���� �ʱ�ȭ�ϰ� ���ڿ��� ""���� �ʱ�ȭ �մϴ�.
		
		if (inputNumber % 2 == 0) { //if���� ����Ͽ� ������ ���� ��� �����ϴ� �߰�ȣ ������ �ۼ�.
			result = "¦��";
			System.out.println("¦������ �Ǻ� ���Դϴ�.");
			}
		
		else { result = "Ȧ��";
		System.out.println("Ȧ������ �Ǻ� ���Դϴ�.");
		}
			//if���� ��ø�� ������ �������� �� �� �ִ�.
		
		
		System.out.println("�Է��Ͻ� ���ڴ� " + inputNumber + 
				" �̰� �� ���ڴ� " + result + " �Դϴ�.");
		sc.close();
		
		
	}
}
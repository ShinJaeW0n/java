package java8;

import java.util.Scanner;

public class Day0503 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("����� ���������� �Է��� �ּ���(0~100): ");
		int score = sc.nextInt();

		String pass = "";
		
		//�ϳ��� ������ �ƴ϶� �������� ������ ������. if if �� �뷮�� ũ�� �ӵ��� ����. �׷��� else if��.
		if (score>=90) {
			pass = "A����";
			}
		else if //�̷��� �ϸ� �ȵ�.(90>score>=80) ���׿����ڷ� �ؾ��ؼ�. 3���� ���� �ȵ�. else if�� ��������
		(score >= 80) { pass = "B����";}
		
		else if (score >= 70) { pass = "C����";}
		
		else if (score >= 60) { pass = "D����";}
		
		//else if (score < 60) { pass = "F����";}
		else { pass = "F����"; }
		
		System.out.println("���� ������" + pass + "�Դϴ�.");
		
		sc.close();
	
	}
	
}

//else if�� ������ ����ص� ���� , else�� 1���� ��밡��. �� �� �ʿ����� ������ ���� ����.

/* 90�� �̻��� A����
 * 90�� �̸� 80�� �̻��� B����
 * 80�� �̸� 70�� �̻��� C����
 * 70�� �̸� 60�� �̻��� D����
 * 60�� �̸��� F����
 * */

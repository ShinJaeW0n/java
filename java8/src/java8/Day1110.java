package java8;

import java.util.Scanner;

public class Day1110 {

		/*�� �л��� �ڹ� ������ �⼮, ����, �߰����, �⸻��� ����(����100�� ����)�� Ű����κ���
		 * ������ �Է¹޾� ������ ȭ�鿡 ����϶�*/
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			int a = 0 , b = 0 , c = 0 , d = 0;
			char grade;
			
			do {
				if(a < 0 || a > 100) {
			System.out.print("�Է� ������ �ʰ��Ͽ����ϴ�.");
			}
			System.out.println("�⼮����: ");
			a = sc.nextInt();
			
			
			}while(a < 0 || a > 100);
			

			do {
				if(b < 0 || b > 100) {
			System.out.print("�Է� ������ �ʰ��Ͽ����ϴ�.");
			}
			System.out.println("��������: ");
			b = sc.nextInt();
			
			
			}while(b < 0 || b > 100);
			

			do {
				if(c < 0 || c > 100) {
			System.out.print("�Է� ������ �ʰ��Ͽ����ϴ�.");
			}
			System.out.println("�߰���� ����: ");
			c = sc.nextInt();
			
			
			}while(c < 0 || c > 100);
			

			do {
				if(d < 0 || d > 100) {
			System.out.print("�Է� ������ �ʰ��Ͽ����ϴ�.");
			}
			System.out.println("�⸻��� ����: ");
			d = sc.nextInt();
			
			
			}while(d < 0 || d > 100);
			
			//�Ҽ����� ������ ��Ʈ�� ���������� ���� ����ȯ.
			int score =(int)(a/100.0*20  + b/100.0*20 + c/100.0*30 + d/100.0*30); 
			System.out.println("���� : " + score + "�Դϴ�." );
			
			if (score >=90) {
				grade = 'A';
				
			}else if (score >= 80) {
				grade = 'B';
			}else if (score >= 70) {
				grade = 'C';
			}else if (score >= 60) {
				grade = 'D';
			}else {
				grade = 'F';
			}
			
			System.out.println("����� ������" + grade + "�Դϴ�.");
			
			
//			Scanner sc = new Scanner(System.in);
//			System.out.println("�⼮ , ����, �߰����, �⸻��� ���� �Է��ϼ���.");
//			
//			System.out.print("�⼮: ");
//			double ch = sc.nextDouble();
//			System.out.print("����: ");
//			double ga = sc.nextDouble();
//			System.out.print("�߰����: ");
//			double ju = sc.nextDouble();
//			System.out.print("�⸻���: ");
//			double gi = sc.nextDouble();
//			
//			double hak = ch*0.2 + ga*0.2 + ju*0.3 + gi*0.3;
//			
//			
//			if(hak >= 90 && hak <=100) {
//					System.out.println("���� : A");
//			}else if (hak >=80 && hak <= 89) {
//				System.out.println("���� : B");
//			}else if (hak >= 70 && hak <= 79) {
//				System.out.println("���� : C");
//			}else if (hak >= 60 && hak <= 69) {
//				System.out.println("���� : D");
//			}else {
//				System.out.println("���� : F");
//			}
//			
			
			
		}
	
}

package java8;

import java.util.Scanner;

public class Day1113 {
					/*���� ���� �� ����*/
			public static void main(String[] args) {
			
			final String ga = "����"; //1
			final String ba = "����"; //2
			final String bo = "��";  //3
			
			int com , user; 
			
			
			Scanner sc = new Scanner(System.in);
			
			while(true) {
				com = (int)(Math.random()*3)+1; // 1 2 3 �� ����.
			
				do {
				
			System.out.println("���������� ���� ����");
			System.out.print("���� = 1 , ���� = 2 , �� = 3, ���� = 4 : ");
			user = sc.nextInt();
			
			if(user < 1 || user > 4) {
				System.out.println("�� �� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
			}else if (user == 4) {
				System.out.println("������ �����մϴ�.");
				System.exit(0);
			}
			}while(user < 1 || user > 3); //�� ����� �ٽ� �����ؾ���.
			
			
			String userStr = user == 1 ? "����" : user == 2 ? "����" : "��";
			String comStr = com == 1 ? "����" : com == 2 ? "����" : "��";
			
			if((user == 1 && com == 3) || (user == 2 && com ==1) || (user ==3 && com ==2)){
				System.out.println("���� ��! ���� : " + userStr + ", ��ǻ��: " + comStr);
			}else if (user == com) {
				System.out.println("�����! ����: " + userStr + ", ��ǻ��: " + comStr);
			}else {
				System.out.println("��ǻ�� ��! ��ǻ�� : " + comStr + ", ����: " + userStr);
			}
			//���ӳ�
			
			
			
			}
			
			
		}
}

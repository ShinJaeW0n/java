package java8;

import java.util.Scanner;

public class Day1014 {
		public static void main(String[] args) {
		//�� ������ �Է� �ް� ���� �󸶰� ���԰� �� ���� ������ ���϶�.
			
			Scanner sc = new Scanner(System.in);
			
			//final=�ٲ� �� ���� ��
			final int k = 2000;
			final int dd = 2000;
			final int o = 500;
			final int s = 2000;
			int a,b,c,d;
			
			
			
			System.out.println("�����н�. �޴��� ������ ����");
			System.out.println("��� 1�� : 2000��  , ������ 1�κ� : 2000��");
			System.out.println("���� 1�� 500��, ���� 1�κ� 2000��");
			System.out.println("��� ������ ���� ���� ������ �Է����ּ���.");
			System.out.println();
			
			
			System.out.println("����� �� �� �����ϰڽ��ϱ�?: ");
			a = sc.nextInt();
			System.out.println("�����̴� �� �κ� �����ϰڽ��ϱ�?: ");
			b = sc.nextInt();
			System.out.println("������ �� �� �����ϰڽ��ϱ�?: ");
			c = sc.nextInt();
			System.out.println("����� �� �κ� �����ϰڽ��ϱ�?: ");
			d = sc.nextInt();
			System.out.println();
			
			System.out.println("�����" + a + "�κ� �����ϼ̽��ϴ�.");
			System.out.println("���: " + k*a);
			System.out.println("�����̴�" + b + "�κ� �����ϼ̽��ϴ�.");
			System.out.println("������: " + dd*b);
			System.out.println("������" + c + "�κ� �����ϼ̽��ϴ�.");
			System.out.println("����: " + o*c);
			System.out.println("����� " + b + "�κ� �����ϼ̽��ϴ�.");
			System.out.println("����: " + s*d);
			System.out.println();
			
			System.out.println("�� �ݾ�: " + (k*a + dd*b + o*c + s*d));
			sc.close();
//			
//			
//			String [] str = new String[4];
//			
//			String ��� = "2000��";
//			String ������ = "2000��";
//			String ���� = "500��";
//			String ���� = "2000��";
//			int sum = 0;
//			
//			Scanner sc = new Scanner(System.in);
//			System.out.print("�� ������ �Է��Ͻÿ�: ");
//			String me = sc.next();
//			
//			if(me == ���) {
//				sum = 2000;
//			}else if(me == ������) {
//				sum = 2000;
//			}else if(me == ����) {
//				sum = 500;
//			}else {
//				sum = 2000;
//			}
			
			
			
			
			
			}
	
	
	
	
}

package java8;

import java.util.Random;
import java.util.Scanner;

public class Day07test17 {

	public static void main(String[] args) {
		// ���������� ����, ���۽� ������ 3��, ����0��, ���� �¸��� 100�� �߰�, ����� �� 10�� �߰�,
		// ��ǻ�� �¸��� ������ 1�� ���� , q�� �Է¹����� ���α׷��� �����մϴ�. �������� 0���� ������ ����ϼ���.
		// static final - ���� �����س��°�.
		// ��ǻ�ʹ� ���� ���ֱ�.

		// final - ���� ������ �� �� ����.
		String user = "";
		String com = "";
		final String ga = "����";
		final String ba = "����";
		final String bo = "��";
		int score = 0;
		int life = 3;

		Scanner sc = new Scanner(System.in);
		
		//���� �Ǻ����� ������ ������ while ������ �ݾ���.
		while (true) {
			// ������ �Է¹�
			do {
				System.out.println("���������� ������ �����մϴ�. 1 = ����, 2 = ����, 3 = ��, 4 = ���� ");
				System.out.print("������ ���ðڳ���? : ");

				int temp = sc.nextInt();

				switch (temp) {
				case 1:
					user = ga;
					break;

				case 2:
					user = ba;
					break;

				case 3:
					user = bo;
					break;

				case 4:
					System.out.println("4���� �����Ͽ� ���α׷��� �����մϴ�.");
					System.out.println("score : " + score + ", life : " + life);
					System.exit(0);

				default:
					System.out.println("�� �� �Է��ϼ̽��ϴ�."); // �߸��Է��ϸ� �ٽ� do��
				}

			} while (user.equals(""));

			// ��ǻ�Ͱ� ����
			Random rd = new Random();
			int temp = rd.nextInt(3);
			switch (temp) {
			case 0:
				com = ga;
				break;
			case 1:
				com = ba;
				break;
			case 2:
				com = bo;
				break;
			}

			// ������ �����Ǻ�
			if ((user.equals(ga) && com.equals(bo)) || (user.equals(ba) && com.equals(ga))
					|| (user.equals(bo) && com.equals(ba))) {
				score += 100;
				System.out.println("���� ��!" + " ���� : " + user + ", ��ǻ��" + com);

			} else if (user.equals(com)) {
				score += 10;
				System.out.println("�����! ����: " + user + ", ��ǻ��: " + com);
			} else {
				life -= 1;
				System.out.println("��ǻ�� ��! ���� :" + user + ", ��ǻ��: " + com);
			}
			System.out.println("score: " + score + ", life: " + life);

			if (life == 0) {
				System.out.println("������ �����մϴ�.");
				System.exit(0);
			}

		}
//		int number = (int)(Math.random()*3); // 0 1 2 �� ���´�.
//		
//		switch (number) {
//		case 0 : 
//			com = ga;
//			break;
//			
//		case 1 : 
//			com = ba;
//			break;
//			
//		case 2 :
//			com = bo;
//			break;
//		}
//		
//		if ((user.equals(bo) && com.equals(ba)) || (user.equals(ba) && com.equals(ga))
//		|| (user.equals(ga) && com.equals(bo))) {
//			
//			System.out.println("��� ��! " + "��� : " + user + ", ��ǻ��: " + com);
//			score += 100;
//			
//			}
//		else if (user.equals(com)) {
//			System.out.println("�����ϴ�!");
//			score += 10;
//			
//		}else if (life == 0) {
//			System.out.println("�ý����� ����Ǿ����ϴ�.");
//			System.exit(0);
//		}
//		
//		else  {
//			System.out.println("��ǻ�� ��!" + " ��� : " + user + ", ��ǻ��: " + com);
//			life -= 1;
//		}
//	
//		
//		System.out.println("�ý��� ��������: " + score + ", ���� ������: " + life);
//		
//		sc.close();
//		

	}

}

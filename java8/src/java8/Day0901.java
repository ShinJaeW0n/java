package java8;

import java.util.Random;
import java.util.Scanner;

public class Day0901 {

	public static void main(String[] args) {
		/* 1���� 100 �߿� �����ϰ� ������ �����Ѵ�.
		 * �Է��� ���� ���亸�� ũ�� "up" ������ "down" ���� ����մϴ�. 
		 * �ִ� Ƚ���� 10ȸ�� �����մϴ�.
		 * ���� �� ��Ҹ� ���� ������ ����մϴ�.*/
		
		
		//��������
		int number = (int) (Math.random() * 100) + 1; // ������ �Ǽ��� ���ͼ� ������ ���� ����ȯ ����.
		int inputNum = 0;
		int cnt = 0;
		Scanner sc = new Scanner(System.in);
		
		
		//���ӽ���
		long startTime = System.currentTimeMillis();
		
		
		while (true) {
			
			//�����Է�
			do {
				if (inputNum != 0) {
					System.out.println("�߸� �Է��ϼ̽��ϴ�.");
				}

				System.out.print("������ �Է����ּ���(1~100): ");
				inputNum = sc.nextInt();
			} while (inputNum < 1 || inputNum > 100);
			
			//������
			cnt++; //do while�� �ݺ��Ҷ����� 1ȸ�� �����Ѵ�.
			if (number == inputNum) {
				System.out.println("�����Դϴ�." + cnt + "ȸ �Է��Ͽ����ϴ�.");
				break; //���������� ����ؾ��ؼ�. if���� ���������� ������ ����Ʈ���� ��µǰ� �Ϸ���.
			} else if (number > inputNum) {
				System.out.println("UP!" + cnt + "ȸ �Է��Ͽ����ϴ�.");
			} else {
				System.out.println("Down!" + cnt + "ȸ �Է��Ͽ����ϴ�.");

			}
			if (cnt == 10) {
				System.out.println("���������� 0 ���Դϴ�. ������ �����մϴ�.");
				System.exit(0);
			}

		} 
		
		//�������
		long endTime = System.currentTimeMillis();
		long playTime = (endTime - startTime) / 1000; //�ʷ� ǥ���ϱ� ���ؼ�. �и��� -> ��
		
		//3�оȿ� ������ �����°ɷ� �����ؼ�		//180.0���� ������ ������ 0�� ���´�.
		//���ϴ� �ð�-playtime, 1���̶�� 60 2���̶�� 180 , ���� ������� ������� �����Եȴ�.
		double score = (180 - playTime) / 1.8; // <-100���� 180 / %�� ������ �ϱ����ؼ�. 
		//3���� �ѱ�� �Ǹ� 0���� ���´�. ���� Ǯ���� ������ �������� �ϱ� ���ؼ�.
		
		
		
		//�Ǵ� �̷��� �ص���.
		//long score = (long) ((180 - playTime) / 18000.0);
		
		System.out.println("����������: " + score + " �� �Դϴ�. ������ �����մϴ�.");
		

	}
}

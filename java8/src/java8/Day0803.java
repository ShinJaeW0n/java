package java8;

import java.util.Random;
import java.util.Scanner;

public class Day0803 {
	public static void main(String[] args) {
		// ������ ����ؼ� ������ ������ ����ϰ�, ���� �Է��ϵ��� �ۼ��ϼ���
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		int r, r2, quiz, answer;
		
		//���� �ð� ���ϱ� //long���� �ҹ��ڷ� ������Ѵ�.
		long startTime = System.currentTimeMillis(); //�и��� = �и�����. 1000���� 1��.���� 1000�̸� 1��
		//Long startTime = System.nanoTime(); //10�� 9���� �̿��Ѵ�. 10���� �Ǹ� 1��.
		//System.out.println(startTime);
		
		//�� 10���� �ݺ�
		for (int i = 0; i <= 10; i++) {
			r = (int) (Math.random() * 8 + 2); // 0���� 9���� ������ �ɰ��̴�.
			r2 = rd.nextInt(9) + 1; // 0���� 9����

			quiz = r * r2;
			System.out.print(r + "x" + r2 + "=");
			answer = sc.nextInt();

			if (quiz == answer) {
				System.out.println("�����Դϴ�.");
			} else {
				System.out.println("Ʋ�Ƚ��ϴ�. ������ �����մϴ�.");
				//break; Ʋ������ �����ϴ� ����
				System.exit(0); 
			} 

		} 
		
		long endTime = System.currentTimeMillis();
		System.out.println("[��������ð�]");
		System.out.println(endTime - startTime + "ms"); //ms = �и�����
		
	//�� ���� �̳� ���̾���. �����ð� - �����ѽð� = ������ �ð�***
	}
}
package java8;

import java.util.Random;
import java.util.Scanner;

public class Day0806 {

	public static void main(String[] args) {
		//������ 10ȸ �Ϸ�� ����ð��� ����ϼ���.
		
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		int r, c, b, answer;
		
		long startTime = System.currentTimeMillis();
		
		for(int i = 0; i <=10; i++) {
		
		r = (int)(Math.random()*8+2); //0���� 7 + 2 = 9 , 2���� 9�� ������ �Ϸ���.
		c = rd.nextInt(9)+1; //0����8+1 = 9 , 1���� 9 ������ �Ϸ���.
		
		answer = r*c;
		System.out.print((i+1) +"�� ����"+ " : " + r + "x" + c +"=");
		b = sc.nextInt();
		
		if(answer==b) {
			System.out.println("�����Դϴ�.");
		}else { System.out.println("Ʋ�Ƚ��ϴ�.������ �����մϴ�.");
				System.exit(0);
		}
			
	}
		long endTime = System.currentTimeMillis();
		System.out.println("[���ӽ���ð�]" + (endTime-startTime) +"ms");
		//������ �� ������ �� �� ������ ����.
		//������ ���ʺ��� ���. �׷��� () �����൵ �Ǵµ� Ȯ���ϰ� �Ϸ��� ()�� �־���.
		//������ �����ʺ��� ���.
		
		}
}

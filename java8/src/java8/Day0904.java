package java8;

import java.util.Random;
import java.util.Scanner;

public class Day0904 {

	public static void main(String[] args) {
		//������ ������ �ۼ��ϼ���
		Scanner sc = new Scanner (System.in);
		
		int a , b , an, r;
		int sScore = 0; //����
		
		
		long startTime = System.currentTimeMillis();
		
		
		for(int i = 0; i <=10; i++) 
		
		{
			
			 a = (int)(Math.random()*8)+2;
			 b = (int)(Math.random()*9)+1;
			an = a*b;
			System.out.print(a + "x" + b + "= ");
			r = sc.nextInt();
		
		if(r==an) {System.out.println("�����Դϴ�.");
					
		}else {
			sScore +=5; //���߿� �� ���� �Ǳ� ������ +�� ��.
			System.out.println("Ʋ�Ƚ��ϴ�. " + sScore + " �� �����Դϴ�.");
		}
				
		}
		
		long endTime = System.currentTimeMillis();
		long playTime = (endTime-startTime) / 1000;
		long score = 200 - playTime - sScore;  // 200-����ð�-����
		
		if(score > 100) {
			score = 100;
		}else if ( score < 0) {
			score = 0;
		}
		
		
		System.out.println("���������� " + score + " �Դϴ�." );
		sc.close();
		
		
		
	}
}

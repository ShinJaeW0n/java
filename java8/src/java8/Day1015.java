package java8;

import java.util.Random;
import java.util.Scanner;

public class Day1015 {
			//���ھ߱�����
			/*1���� 9������ ���� �߿� 3���� �������� ��� ���� �ǰ� �Ѵ�.
			 * ex) 3 7 5 �� ���̶��
			 * 	   1 2 3 <- 1��
			 * 	   1 2 4 <- �ƿ�
			 * 	   3 5 6 <- 1��Ʈ����ũ 1��
			 * 	   3 5 7 <- 1��Ʈ����ũ 2��
			 * 	   3 7 5 <- 3��Ʈ����ũ */
		public static void main(String[] args) {
			Random rd = new Random();
			int[] com = new int[3];
			com[0] = rd.nextInt(9)+1;
			do {
				com[1] = rd.nextInt(9)+1; //x��y�� ���ٸ� y�� �ٽ� ������
			}while(com[0]==com[1]);
			
			do {
				com[2] = rd.nextInt(9)+1; //z�� x�� ���ų� y�� �Ȱ��ٸ� �ٽ� ������
			}while(com[0]==com[2] || com[1]==com[2]);

			Scanner sc =  new Scanner(System.in);
			int [] user = new int[3];
			int strike = 0, ball = 0;
			
			
			for(int x = 0; x < 11; x++) {
			//user�Էºκ�
			System.out.print("ù ��° ���� �Է��� �ּ���(1~9): ");
			
			do {
				if(user[0] != 0) {
					System.out.println("������ �ʰ��Ͽ����ϴ�. �ٽ� �Է����ּ���.");
				}
				user[0] = sc.nextInt();
			}while(user[0] < 1 || user[0] > 9);
			
			do {
				if (user[0] == user[1]) {
					System.out.println("������ ���ڴ� �Է��� �� �����ϴ�.");
				}
				System.out.print("�� ��° ���� �Է����ּ���.(1~9): ");
				do {
				if(user[1] != 0) {
					System.out.println("������ �ʰ��Ͽ����ϴ�. �ٽ� �Է����ּ���.");
				}
				user[1] = sc.nextInt();
			}while(user [1] < 1 || user[1] > 9);
			
		}while(user[0] == user [1]);
			
			
			do {
				if (user[0] == user[2] || user[1] == user [2]) {
					System.out.println("������ ���ڴ� �Է� �� �� �����ϴ�.");
				}
				System.out.println("�� ��° ���� �Է����ּ���.(1~9)");
				do {
				if(user[2] != 0) {
					System.out.println("������ �ʰ��Ͽ����ϴ�. �ٽ� �Է����ּ���.");
				}
				
				user[2] = sc.nextInt();
			}while(user[2] < 1 || user[2] > 9);
		}while(user[0] == user[2] || user[1] == user[2]);
			
			
			
			
			for(int i = 0; i < 3; i++) {
			if(com[0] == user [i]) {
				strike++;
			}
			}
		
			if(com[0] == user [1] || com[0] == user[2]) {
				ball++;
			}
			if(com[1] == user [0] || com[1] == user[2]) {
				ball++;
			}
			if(com[2] == user [0] || com[2] == user[1]) {
				ball++;
			}
			
			System.out.println(strike + "��Ʈ����ũ" + ball + "��");
			
			if(strike == 3) {
				System.out.println("�����Դϴ�. ������ �����մϴ�.");
				System.exit(0);
			}
			
			strike = ball = 0; //=�� 2�� �̹Ƿ� �������� �������� ������ �ȴ�.
			
			for(int i = 0; i < user.length; i++) {
			user = new int [3]; //user�� 0���� �ʱ�ȭ ������Ѵ�.
			}
			
			}
		}
}

//Scanner sc = new Scanner(System.in);
//int ba [] = new int[3];
//
//Random rd = new Random(9);
//int x = rd.nextInt();
//x = ba[0];
//int y = rd.nextInt();
//y = ba[1];
//int z = rd.nextInt();
//z = ba[2];
//
//int cnt = 0; //��Ʈ����ũ
//int cnt1 = 0; //��
//
//	System.out.print("���� 3���� �Է��ϼ���: ");
//	int me = sc.nextInt();
//	
//	for(int i=0; i<11; i++) {
//	
//	if(x==me) { 
//	cnt++;
//	System.out.println(cnt + "ȸ ��Ʈ����ũ �Դϴ�.");
//		}
//	
//	
//	}














//if(me==ba[0]) {
//cnt++;
//System.out.println(cnt + "�� �Դϴ�.");
//}else if (me==ba[1]) {
//cnt++;
//System.out.println(cnt + "�� �Դϴ�.");
//}else if (me==ba[2]) {
//cnt++;
//System.out.println(cnt + "�� �Դϴ�.");
//}else if (x != me && y != me && z !=me){ 
//System.out.println("�ƿ� �Դϴ�.");
//}else if (x==me || y==me || z==me) {
//cnt1++;
//System.out.println(cnt1 + "��Ʈ����ũ �Դϴ�.");
//}
//
//else {
//System.out.println();
//}
//

package java8;

import java.util.Scanner;

public class Day1111 {
				//���ε� ��ǰ�ܰ�*����
	
		public static void main(String[] args) {
		
			Scanner sc= new Scanner (System.in);
			System.out.print("������ �Է��ϼ���: ");
			
			int price = sc.nextInt();
			
			System.out.print("������ �Է��ϼ���: ");
			int amount = sc.nextInt();
			
			int res1 = price * amount;
			System.out.println("��ǰ�ܰ�: " + price + "��");
			System.out.println("��ǰ ����: " + amount + "��");
			
			int sale = 0; //�������� ���ٴ� ���� ǥ��������ؼ�.
			
			//50������ �Ѵ°� 100���� �Ѵ°͵� �����̾ 100������ ���� ǥ���������.
			if(res1 >= 1_000_000) {
				price *=0.6; //40���� ���� �� �ݾ�
				sale = 40;
				
			}else if(res1 >= 500_000) {
				price *=0.7; //30���� ���� �� �ݾ�
				sale = 30;
			} 

			System.out.println("������: " + sale + "%");
			System.out.println("���ұݾ�: " + price*amount + "��");
			
			sc.close();
			
			
			
//			int me = sang*cnt;
//			int hal = 0; //�� ���ұݾ�
//			int hal1 = 0;
//			
//			
//			if(me >= 500_000) {
//				hal =  sang - (int)(sang / 100.0 * 30);
//				hal1 = 30;
//			
//			}else if (me >= 1_000_000) {
//				hal = sang - (int)(sang / 100.0 * 40);
//				hal1 = 40;
//			}
//			
//			System.out.println(" ��ǰ�ܰ�: " + sang + " ��ǰ�� ����: " + cnt + " ���ұݾ�: " + me + " ������ : " + hal1 + "%");
//			
	}
	
}

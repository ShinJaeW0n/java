package java8;

import java.util.Random;
import java.util.Scanner;

public class Day05test2 {
	public static void main(String[] args) {
		
		String ga = "����";
		String ba = "����";
		String bo = "��";
		String user = "";
		String com = "";
		
		/*��� �Է�*/
		Scanner sc = new Scanner(System.in);
		System.out.println("����, ����, �� �� �ϳ��� �����ϼ���. < ���� = a, ���� = b , �� = c > :  ");
		user = sc.next();
		
		switch(user) {
		case "a":
		case "A":
			user = ga;
			break;
			
		case "b" :
		case "B" :
			user = ba;
			break;
			
		case "c" :
		case "C" :
			user = bo;
			break;
			
			default:
				user = "error";
				System.out.println("�� �� �Է��ϼ̽��ϴ�."); 
		}
		
		if(user == "error") {
			System.out.println("�� �� �Է��ϼ̽��ϴ�. ���α׷��� �����մϴ�."); // �����. �̹� ���� �Է� �س���.
			System.exit(0); // �ý����� �����ϴ� ����.
		}
		
		
		/*��ǻ�� ����*/
		int number = (int)(Math.random()*3); //0 1 2 �� ���´�.
		
		switch(number) {
		case 0:
			com = ga;
			break;
			
		case 1:
			com = ba;
			break;
			
		case 2:
			com = bo;
			break; //�����.
		}
		
		//�� 3���� ��쿣 ����� ��.
		//if((user == bo && com == ba) || (user == ga && com == bo) || (user == ba && com == ga)) //�̰� �� �߸���. �⺻���̸� �´µ�,
		if((user.equals(bo) && com.equals(ba)) || (user.equals(ga) && com.equals(bo)) || (user.equals(ba) && com.equals(ga)))	
		
		//�⺻�ڷ����� �ƴϰ� �������� ��� ������ �� �ּҿ� ������ �� �ּҰ� ���Ķ�� ����°�.
			//== : (�⺻��)���ʰ� ������ ���� ������ ����� ��. 
			//== : (���ڿ��� �⺻���� �ƴϴ�.)���� �ּҰ� ������ ����� ��.
			//String ga ba bo �� user�� com�� �쿬�� ���� �ּҸ� �����߱� ������ �̰� �׳� �Ѿ�� �����. ������ ������ �ϸ� �ȵ�.
			//�ּҰ� �ٸ� �⺻���� ��� equals�� ����ؾ���. ex)str2.equals(str3); = true, �ڹٴ� ��ü�� ��ü�� �񱳴� equals�� �̿���.
		{
			System.out.println("��� ��! ��� : " + user + ", ��ǻ�� : " + com);
		} else if ( user.equals(com)) { System.out.println("�����ϴ�! ��� : " + user + ", ��ǻ�� : " + com);
		
		}else {
			System.out.println("��ǻ�� ��! ���: " + user + " ,��ǻ��: " + com);
		}
		
		
		
//		switch (r)
//		{case "a" : 
//		System.out.println("��ǻ�� ��!");
//		System.out.println("��ǻ�� : ��"  + "��� : ����" );
//		break;
//	
//		case "b" : 
//		System.out.println("��ǻ�� ��!");
//		System.out.println("��ǻ�� : ����"  + "��� : ��");
//		break;
//		
//		case "c" : 
//		System.out.println("��ǻ�� ��!");
//		System.out.println("��ǻ�� : �� " + " ��� :��" );
//		break;
//		
//		default :
//		System.out.println("��� ��!");
//		System.out.println("��ǻ�� : " +   + "��� : " + );	
//		
		}
	
	
	}



package java8;

import java.util.Random;
import java.util.Scanner;

public class Dayhappy {
	public static void main (String[] args) {
		Scanner ch = new Scanner(System.in);
		String name = "";
		
		
		int happy = 0;
		Random rd = new Random();
		happy = rd.nextInt(101); //0~100
		
		
		
		System.out.print("�̸��� �Է��� �ּ���:");
		name = ch.next();
		System.out.println("¦¦¦!" + name + "���� ������ �����");
		System.out.println(happy + "%�Դϴ�.");
		
		
		ch.close();
		
		
		
	}
	
}

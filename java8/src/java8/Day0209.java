package java8;

import java.util.Random;
import java.util.Scanner;

//��ĳ�� �̿��ؼ� � �����, String ������ ������ ���ؼ�.

public class Day0209 {

	public static void main(String[] args) {
		Scanner ch = new Scanner(System.in);
		String name = ""; //String���� ���ڿ�(�ؽ�Ʈ)�� �Է��մϴ�.
		//�ʱ�ȭ�� ""���� �� �� �ֽ��ϴ�.
		
		
		
		
		int happy = 0;
		Random rd = new Random();
		happy = 50 + rd.nextInt(51); //50���� 100���� ������ �Ϸ��� �̷���.
		//happy = rd.nextInt(101); �̷��� �ϸ� 0���� 100������ ����.
		happy = (int)(Math.random() * 51) + 50; //�̷��Ե� ����.
		
		
		
		//happy = (int)(Math.random() * 100); = �̰͵� ������.
		
		
		//������� �̸��� �Է� �޽��ϴ�.
				System.out.print("�̸��� �Է����ּ���:");
				name = ch.next(); //�Ǵ� next ������ ����ص���.
		
		//������ � ���
		System.out.println(name + "���� ������ �����?");
		String str = "%�Դϴ�." //String ������ ���ڿ��� ������ �� �ֽ��ϴ�.
				//String�� ���������� �� ���� ����Ǵ� ���� �ƴ϶�
				//���� ������ �ִ� �޸� �ּҰ� ����˴ϴ�.
				//���� ����ǥ�� ���θ� char���̰� ū ����ǥ�� ���θ� String�� �Դϴ�.
				
				
		System.out.print(happy + str); //0~100������ ���� ���.
		//��������� 50���� 100 ���̸� ����ϰ� �������ּ���.
		
		
		
		ch.close();
		
		
	}

}

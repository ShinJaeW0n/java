package java8;

import java.util.Scanner;

public class Day0310 {
	public static void main(String[] args) {
		//Ű�����Է��� ���� ��ü
		Scanner sc = new Scanner(System.in);
		
		
	
		System.out.print("�����Դϱ�?(����:1 , �����ƴ�:0 - ");
		int capital = sc.nextInt();
		boolean isCapital = capital == 0 ? false : true;
		//0�� false �ٸ� ���ڴ� true �����.
		
		
		System.out.println("�α�(����:��) - ");
		int citizen = sc.nextInt();
		
		System.out.println("������ ��(����:��) - ");
		int rich = sc.nextInt();		
		
		  
		
		//�Ǵ� ��Ʈ�� ������ ���� (�� ������)
		//�ѳ����� �����̰� �α��� 100�� �̻��̾�� �Ѵ�. (���迬����)
		boolean isMetro1 = isCapital && (citizen >= 100); //���迬���ں��� �ϰ� 
		
		//�� �ҵ��� 1�� �̻��� �α��� 50�� �̻��̾�� �Ѵ�.
		
		boolean isMetro2 = rich >= 50;
	
		boolean isMetro = isMetro1 || isMetro2;
		
		System.out.println("��Ʈ�������� ����: " + isMetro);
		
	
	}

}

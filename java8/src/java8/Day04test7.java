package java8;

import java.util.Scanner;

public class Day04test7 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n , m;
		int temp;
		
		
		System.out.println("�Է�N: ");
		n = sc.nextInt();
		
		System.out.println("�Է�M: ");
		m = sc.nextInt();
		
		System.out.println("��ȯ ��: N = " + n + "  , M = " + m);
		
		
		//���� ��ȯ�ϴ� swap code�� �ʿ�. (n =10, m=20���� ����)
		//n = m;
		//m = n; <-�̷��� ��µǸ� m�� n�� �Ȱ��� ���� ���´�.
		
		temp = n;
		n = m;
		m = temp;
		
		//�ַ� ��������, ������������ ���Ŀ� ����.**
		
		System.out.println("��ȯ ��: M = " + m + "  , N = " + n);
	}

}

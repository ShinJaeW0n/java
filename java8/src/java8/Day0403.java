package java8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Day0403 {
	public static void main(String[] args) throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr); //���ڸ� �Է¹��� �� �ִ�.
													//���ڵ� ���ڷ� �ν�
		
		System.out.println("Ű���带 ������ ���ڿ��� �Է����ּ���.");
		String str = br.readLine();
		System.out.println(str);
		
		System.out.println("���ڸ� �Է��� �ּ���.");
		String number = br.readLine();
		int num1 = Integer.parseInt(number); //���ڸ� ���ڷ� �����ϴ� �޼���.
		System.out.println(number + 1);
		System.out.println(num1 + 10);
		
		br.close();
		isr.close();
		//isr ����� br�� ������� ������ br�ݰ� isr �ݾƾ���. br�� isr�� ���� ������⶧��.
		//������� �������� �ݾƾ��Ѵ�***
	}
}

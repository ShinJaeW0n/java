package Day12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class Ex1 {

		public static void main(String[] args) throws IOException {
		System.out.print("����� ���ڿ��� �Է��ϼ���!: ");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		StringBuffer sb = new StringBuffer(str);
		System.out.println("�Է��� ���ڿ�: " + sb);
		
		
		
		//���ڿ��� �Ųٷ� �ٲ۴�
		
		sb.reverse();
		System.out.println(sb);
		
		}
}

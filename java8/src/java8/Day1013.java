package java8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Day1013 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		int r[] = new int[10];
		int number;
		BufferedReader inbr = new BufferedReader(new
				InputStreamReader (System.in));
		
		System.out.print("���� 10���� �Է��Ͻÿ�: ");
		for(int x = 0; x < r.length; x++) {
			r[x] = Integer.parseInt(inbr.readLine());
		}
		
		System.out.print("�Է� ������ ��: ");
		for(int x = 0; x<r.length; x++) {
			System.out.println(r[x] + "..");
		}
		System.out.println();
		
//		//�������� ����
//		Arrays.sort(r); //Arrays Ŭ�������� �����ϴ� ���ĸ޼ҵ�. ������ ���������� �ȵȴ�.
//		 
//				
//		System.out.println("�������� �����Ͱ� : ");
		
		
		//�������� - ū ���ڰ� �ڷ� ���� ��.
		for (int x = 0; x <r.length; x++) {
			for(int j = 0; j <r.length; j++) {
				if(r[x] < r[j]) { //�պ��� �ڰ� �� ũ�� �ٲ����.
					int temp = r[x];
					r[x] = r[j];
					r[j] = temp;
				}
			}
		}	
		System.out.println("�������� �����Ͱ� : ");
		
		
		for(int x = 0; x<r.length; x++) {
			System.out.println(r[x] + "..");
		}
		System.out.println();
		
		System.out.print("�հ� : ");
		int sum = 0;
		for(int x = 0; x<r.length; x++) {
			sum += r[x];
		}
		System.out.println(sum);
		System.out.println("��� : " + (sum / r.length) );
	
	}
}

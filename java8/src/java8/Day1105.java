package java8;

import java.util.Arrays;
import java.util.Random;

public class Day1105 {
		/*	1. 1���� 45�� �Է��� �迭�� �ۼ��մϴ�.
		 * 	2. �ۼ��� �迭�� �������� �����ϴ�.
		 * 	3. 0 �ε��� ���� 6�ε��� ���� ����մϴ�.
		 * 	*/
		public static void main(String[] args) {
			int a [] = new int[45];
			
			
			for(int i = 0; i<a.length; i++) {
				a[i] = i+1; //1���� 45 ����.
				System.out.print(a[i] + "\t");
				if((i+1)%5==0) { 						
					System.out.println();
				}
					// <- ���� ���ϰ� 5���� ����.
			} 										
			
			
			
			System.out.println(); // <- ���� ���ַ���.
							//���� �� ���� �ʿ�� ����.	
			for(int i = 0; i<10_000; i++) {
				int r = (int)(Math.random()*45); //0���� 44���� ����.	
				
				//�����Ʈ
				//�ӽ������ temp
				int temp = a[0]; //a�迭�� ù��° ����.
				a[0] = a[r]; //1���� 45 �� �������� �ϳ� ����.
				a[r] = temp; //0�� ���ڸ� ������ ������ ���ڵ鿡�� ��� �����ϰ� ���ڰ� ���� ����.
			
		
		}
			for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
			if ((i+1) % 5 == 0) {
				System.out.println();
			}
		}

				System.out.println();
				
				System.out.println("�ζ� ��÷��");
				int[] ary = Arrays.copyOf(a, 6); 
				Arrays.sort(ary);
				System.out.print("��÷��ȣ: "); // <= ?
				for (int i = 0; i < ary.length; i++) {
				System.out.println(ary[i] + " ");
		
				}
				
				System.out.println(" , ���ʽ� ��ȣ: " + a[7]); // <= ?

	}

}

//Random rd = new Random();
//int me = rd.nextInt(45)+1;
//for(int i = 0; i<6; i++) {
//	do {
//	 a[i] = rd.nextInt(45)+1;  //<- ���� ���� ���� ���� �ִ�. ex) 1 2 3 3 4 5
//	
//	}while(a[i] == me);
//	System.out.println();
//	System.out.println(a[i]);
//}
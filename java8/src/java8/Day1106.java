package java8;

import java.util.Random;
import java.util.Scanner;

public class Day1106 {
			public static void main(String[] args) {
				/*�ζ� ������ �ۼ�
				 * 1. 6���� ������ ����(1����45)�� �迭�� �Է��ϼ���.  
				 * 2. �ߺ����� �ʵ��� �ۼ��ϼ���.
				 * */	
		
				int a[] = new int [6];
				
				
				Random rd = new Random();
				System.out.println("�ζ� ������");
				System.out.println("�� ������ �����Ͻðڽ��ϱ�? : ");
				Scanner sc = new Scanner(System.in);
				int game = sc.nextInt();
				
				
				
				for(int x = 0; x < game; x++) {
				/*�ζ� ���� ����*/
				for(int i = 0; i < a.length; i++) {
					a[i] = rd.nextInt(45)+1;// <=�̷��� �ϸ� �ߺ��Ǵ� ���ڰ� �߻��Ѵ�.
					for(int j = 0; j<i; j++ ) {
					//a[1] == a[0] 
					if(a[i] == a[j]) {
						i--; //�ζ��� 1���� �ٽ� ������ַ���.								
						break;
					}
					}
					
				}
				
				//���� ������ ����ؼ� �迭�� ������������ �����ϼ���. �׳� �ܿ�����. �Ӹ��� ����� �����.
			
				for(int i = 0 ; i < a.length; i++) {
					for(int j = 0; j < a.length-1; j++) {
						if(a[i] < a[j]) {
							int temp = a[i];
							a[i] = a[j];
							a[j] = temp;
						}
					}
				}
				
				
				for(int i = 0; i < a.length; i++) {
					System.out.println(a[i] + " ");
				}
				
				System.out.println();
				/*�ζ� ���� ��*/
				
				}
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
			
			}
	
	
}

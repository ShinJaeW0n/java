package java8;

public class Day1104 {

		public static void main(String[] args) {
			/* 2���� �迭 �̿��Ͽ� �Ʒ��� ���� �Է��ϼ���.
			 * 7�� 5�࿡ �迭����
			 * Ȧ�� ��� ���� ��������
			 * ¦�� ��� ���� ��������
			 * ����ϼ���.*/
			
			int a [][] = new int [5][7]; //5�� 7ĭ
			
			for(int i = 0; i<a.length; i++) {
			for(int j = 0; j<a[i].length; j++) {
				System.out.print(a[i][j] + "\t"); // �̷��� �ϸ� 7ĭ 5���̵ȴ�.
			}System.out.println();
			
			
		} 
			System.out.println("===============");
			
			
			int cnt = 1;
			for(int i =0; i<a.length; i++) {
				if(i % 2 == 0) {   //<= ¦�� ���ε� �� �����ϴ���.
					for(int j = 0; j<a[i].length; j++) { 
						a[i][j] = cnt;
						cnt++;
				}
				
				}else {				//�� -1�� ���ִ���.
					for(int j = a[i].length-1; j>=0; j--) {
						a[i][j] = cnt;
						cnt++;
					}
				}
			
			}
			
			for(int i = 0; i<a.length; i++) {
				for(int j = 0; j<a[i].length; j++) {
					System.out.print(a[i][j] + "\t");
				
					
				}
				System.out.println();
				}
				
				
			} 
		

	}	


//if(a[i][j] % 2 == 0) {
//	System.out.print((i*5)+j+1+ "\t");
//	
//}else {System.out.print((i+1)*5-j+ "\t");
//
//}

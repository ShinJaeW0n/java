package java8;

public class Day1112 {

		/*��ø�� for���� ����ؼ� 2���� �迭�� �������� �����Ŀ� 
		 * ȭ�鿡 ����ϴ� ���α׷��� �ۼ��϶�*/
		public static void main(String[] args) {
						//2���� 9 �� 8�� ���
			int[][] a = new int[8][9]; //�� [9][9]�� �ϸ� �ȵǴ���.
			
			for(int i = 0; i<a.length; i++) {
				
				for(int j = 0; j<a[i].length; j++) {
					a[i][j] = (i+2) * (j+1);
					}
			}
				//��°�
				for(int i = 0; i<a.length; i++) {
				
					for(int j = 0; j<a[i].length; j++) {
					System.out.print((i+2) + "x" + (j+1) + "=" + a[i][j] + "\t");
					}System.out.println();
			}
			
				
				System.out.println("====================");
				
				
				//���������� �޸𸮴� �� ���������� ���� �� ���� ������ ��. 
				int[][] ay = new int[10][10];
				
				for(int i = 0; i<ay.length; i++) {
					
					for(int j = 0; j<ay[i].length; j++) {
						ay[i][j] = i*j;
						}
				}
		
					//��� ����
					for(int i = 2; i<ay.length; i++) {
						for(int j = 1; j<ay[i].length; j++) {
						System.out.print(i + "x" + j + "=" + ay[i][j] + "\t");
						}System.out.println();
				}
				
				
				
				
				
				
				
}
	
	
}

package Day12;

public class Computer {
		
	
		//���ϰ��� �Է��������.
		int sum(int [] arr) {
			int sum = 0;
			
			for(int i =0; i<arr.length; i++) {
				sum+=arr[i];
			}
			return sum;
		}
					
					//������ , ���������ڴ� �迭������ �ڵ����� ��ȯ�� �ȴ�.
		int sum2(int ... arr) {
			int sum2 = 0;
			
			for(int i =0; i<arr.length; i++) {
				sum2+=arr[i];
			}
			return sum2;
		}
		
	
}

package java8;

public class Day07test09 {
	public static void main(String[] args) {
		
		//1���� 50������ ���� ����� ���϶�. ���� 25.5�� ������ �϶�.
		int sum = 0;
		for (int i = 1; i <= 50; i++) {
			sum += i;
		}
		
		//�Ǽ��� �������� ũ��. �� -> ũ �� ������ �ڵ� ����ȯ�� �ȴ�.
		//ũ -> ������ ���� �ؿ� ó�� ���� ����ȯ�� ���־�� �Ѵ�.
		double avg = (double)sum / 50;
		//����� average�� ����.
		
		//�Ǵ�
		//double avg = sum / 50.0;
		//double avg = sum / 50f; float
		//double avg = sum / 50D; double
		System.out.println("1���� 50������ ���� �����? : " + avg);
	
	
	}

}

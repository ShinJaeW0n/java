package java8;

public class Day1103 {
		//ó�� �ΰ��� �迭 ��Ҹ� �ʱ�ȭ�� ���¿��� ������ �迭��Ҵ� ���� ��� ��Ģ�� ���� ä���
		//�迭�� ����ϼ���. ex)����° ��� - ù��° ��� + �ι�°��� ~ ����° ���  = ������°���+��ȩ��°���
		public static void main(String[] args) {
			int[] a = new int[10];
			a[0] = 1;
			a[1] = 2;
			
					//0�� 1�� �����ϱ�
		for(int i = 2; i<a.length; i++) {
			a[i] = a[i-2] + a[i-1];
			
		}
		
		for(int num : a) {
			System.out.println(num);
		}
		}
}

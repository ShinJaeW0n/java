package java8;

public class Day1002 {
		//�迭
		public static void main(String[] args) {
		int[] arr1 = {10,20,30,40,50}; //����ÿ��� �������� �����ݷ��� ����մϴ�. ���ǹ��̳� �ݺ���������
		//�߰�ȣ�ڿ� �����ݷ��� �̿�x
		
		int arr2 [] = {60,70,80,90,100}; //2���� ��������� ȥ���ص� �������� �ʽ��ϴ�.
		
		for(int i =0; i<5; i++)
		{System.out.println(arr1[i]);
			
		}
		
		for(int i =0; i<5; i++)
		{System.out.println(arr2[i]);
			
		}
		
		arr1[2] = 300; // �迭�� �ε����� �Ϲ� ����ó�� ���� ������ �� �ִ�.
		for(int i =0; i<5; i++)
		{System.out.println(arr1[i]); 
			
		}
			
		int [] arr3= {1,2,3,4,5,6}; //�̷��� �ص� i < 5��� 5������ ������. for������ 4������ �����ϱ���ؼ�.
		for(int i =0 ; i<6; i++)
		{System.out.println(arr3[i]);
			
		}
//		arr3[6] = 7; /�迭�� ������ ������ �Ѿ�� ����� �Ұ����մϴ�.
//		System.out.println(arr3[6]);
		
		
		
		
	}
}

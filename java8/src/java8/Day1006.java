package java8;

public class Day1006 {
	//2���� �迭
	public static void main(String[] args) {

		int[] arr1 = { 10, 20, 30, 40, 50 }; // length�� 5��� ���� ���
		int[][] ary1 = { { 10, 20 }, { 30, 40 }, { 50, 60 }, { 70, 80 } }; 
		// ary1.length�� ù��°[]�� ����/4��.
		// new int[4][2];

		System.out.println(ary1.length);
		System.out.println(ary1[0].length); // ������ �迭�� ���� ��ȯ. 10�� 20 -> 2��.
		System.out.println(ary1[1].length);
		System.out.println(ary1[2].length);
		System.out.println(ary1[3].length);
		
								//4
		for (int i = 0; i < ary1.length; i++) {
			for (int j = 0; j < ary1[i].length; j++)
				System.out.println(ary1[i][j]);
		}

		//�̷��� �ص� ����.
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 2; j++)
				System.out.println(ary1[i][j]);
		}
	
		System.out.println("===========");
	
		int[][] ary2 = {{10,20,30},{40},{50,60}};
		
		//���̰� �ٸ� ��쿡�� length�� ����ؾ� ��ü�� �ݺ����� �� ��
		for(int i = 0; i<ary2.length; i++) {
			for(int j = 0; j<ary2[i].length; j++) {
				System.out.println(ary2[i][j]);
			}
		}
		
		
	
	
	
	}
}

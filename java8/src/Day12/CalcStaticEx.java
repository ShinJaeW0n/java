package Day12;

public class CalcStaticEx {

	//static�� ����ϸ� Ŭ������ ��ü�� �������� �ʾƵ� �ȴ�.
	public static void main(String[] args) {
		
		CalcStatic sc = new CalcStatic();//���� ���� �ʾƵ���.
		
		double result1 = 10*10*CalcStatic.pi;
		int result2 = CalcStatic.plus(10, 5);
		int result3 = CalcStatic.minus(10, 5);
		
		CalcStatic calcs = new CalcStatic();
		
		System.out.println("result1: " + result1 );
		System.out.println("result2: " + result2 );
		System.out.println("result3: " + result3 );
		System.out.println("result4: " + calcs.pi);
		
		System.out.println(CalcStatic.number);
		
		CalcStatic.number = 100;
		
		System.out.println(CalcStatic.number);
		
		System.out.println(sc.number);
		//�ν��Ͻ��� �ƴ϶� Ŭ������ �ͼӵǱ� ������ 
		//100�� �־����� �ʾҴµ��� 10�� �ƴ� 100���� ����� �ȴ�.
		
		
		
		
	}
}

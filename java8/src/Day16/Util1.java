package Day16;

public class Util1 {
					//���׸�Ÿ��. Number���� Ȯ���Ѵ�. Number������ ����Ѵ�. Number�� ������ T
					//extends - �ֻ��� Ŭ������ ����.  //t1, t2�� Number�� ������ ����� �� �ִ�.
	public static <T extends Number> int compare (T t1, T t2) {
		Double d1; //���콺 �ø��� ctrl+t ������ ������. ������ ���� Number���� �Ʒ����� �� �� �ִ�.
		Integer i1;
		Long l1;
		
		double v1 = t1.doubleValue();
		//System.out.println(t1.getClass().getName());
		
		double v2 = t2.doubleValue();
		//System.out.println(t2.getClass().getName());
			
					//�����.
		return Double.compare(v1, v2); //+ - 0 ���.
	}
}

package Day19;


import java.util.function.IntBinaryOperator;
			//���ٽ� �޼ҵ� ����.
public class MethodReferenceEx {

		public static void main(String[] args) {
			IntBinaryOperator operator;
			
			operator = new IntBinaryOperator() { //�͸�����ü
				
				@Override //������ //�͸�����ü
				public int applyAsInt(int left, int right) {
					
					return Calculator.staticMethod(left, right);
				}
			};
			
			int result = operator.applyAsInt(10, 20);
			System.out.println(result);
			
			
			
			
			//���ٽ�
			operator = (int left, int right) -> {
				return Calculator.staticMethod(left, right);
			};
			
			
			//�����̸� �߰�ȣ�� ���� ����/
			operator = ( x,  y) ->  Calculator.staticMethod(x, y);
			result = operator.applyAsInt(10, 20);
			System.out.println(result);
			
			
			//�̷��� ��������. �̰��� �޼ҵ� ����. 
			operator = Calculator::staticMethod; //���� �޼ҵ� ����
			result = operator.applyAsInt(10, 20); //�����޼ҵ��� ��쿡�� Ŭ���������� ȣ��.
			System.out.println(result);
			
			
			//�ν��Ͻ� �޼ҵ� ����
			//��ü ����.
			Calculator calc = new Calculator();
			
			operator = calc::instanceMethod;
//			operator = Calculator::instanceMethod; //�ν��Ͻ� �޼ҵ�� Ŭ���������� ȣ�� �Ұ���,��ü�� �����ؼ� �����ؾ���.
			result = operator.applyAsInt(10, 20);
			System.out.println(result);
			
			
		}
		
}

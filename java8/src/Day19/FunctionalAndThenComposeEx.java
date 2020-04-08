package Day19;

import java.util.function.Function;

/* *** �ٽ� ã�ƺ���. */

public class FunctionalAndThenComposeEx {
	
		public static void main(String[] args) {
			Function<Member, Address> functionA;
			Function<Address, String> functionB;
			Function<Member, String> functionAB;
			String city;
			
			functionA = m -> m.getAddress(); //�����¹޾Ƽ� ��巹�� ���.
			functionB = a -> a.getCity(); //��巹�� �޾Ƽ� ��Ʈ�� ���.
			
					//��ǿ��̸� ������ ����� ��Ǻ�� �Ѱܼ� �� ����� ���̺�� ����.
					//���� ������� �������� �Ѱ��ٶ�.
			functionAB = functionA.andThen(functionB);					//��巹�� ��ü ����.
			city = functionAB.apply(new Member("ȫ�浿", "hong" , new Address("�ѱ�" , "����")));
			System.out.println("���� ����: " + city);
						
								//�Ű������� �� ���϶��� ����� �� �ִ�.
			functionAB = functionB.compose(functionA);//�ڿ��Ÿ� ������ �Ѱ���.
			city = functionAB.apply(new Member("ȫ�浿", "hong" , new Address("�ѱ�" , "����")));
			System.out.println("���� ����: " + city);
			
		}
}

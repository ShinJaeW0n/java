package Day19;

import java.util.function.Consumer;

import Day18.ConsumerEx;
		//���ϰ����� �����Ӵ� Ư������ �Һ��Ѵ�.
public class CunsumerAndthenEx {
	
		public static void main(String[] args) {
			
			Consumer<Member> consumerA = m -> 
				System.out.println("consumerA: " + m.getName());
			
			
			Consumer<Member> consumerB = m -> 
				System.out.println("consumerB: " + m.getId());
			
				//�տ��� ���� ������� ���ʿ��� ����ϴ� ��. �����Ӵ� ������� ���� ������ �Է°��� �״�� �Ѱ��ش�.
			Consumer<Member> consumerAB = consumerA.andThen(consumerB);  
				consumerAB.accept(new Member("ȫ�浿", "hong" , null));
			
			
		}
}

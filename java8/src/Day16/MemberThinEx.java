package Day16;

public class MemberThinEx {

			/*���� ����*/ //������ ����Ұ� �޶����� ��.
			public static void main(String[] args) {
				//������ü����
				MemberThin original = new MemberThin("���", "ȫ�浿", "12345", 25 , true);
				
				//�������� ,���� ��ü�� ���� �Ŀ� �н����� ���� , ���۷��� �������϶��� ���� ������ �ؾ� ������ �Ȼ���.
				MemberThin cloned = original.getMember(); //��ü�� ���� �����ؼ� ����. ���������� Ŭ���ؼ� ����.
				
				//���� ����
		//		MemberThin cloned = original; //�̷��� �ϸ� �ؽ��ڵ尡 ���� ����.
				//������ ���� ��й�ȣ ������ ���� ��й�ȣ���� �����ع�����. ��Ʈ , ���� ���� �⺻���� ���� ���� ����
				
				cloned.password = "67890"; //���� ��ü���� �н����� ����
				
				System.out.println(original.hashCode());
				System.out.println(cloned.hashCode());
				//2���� �ؽ��ڵ尡 �ٸ� ���� �� �� �ִ�.
				
				
				
				System.out.println("[���� ��ü�� �ʵ尪]");
				System.out.println("id" + cloned.id);
				System.out.println("name" + cloned.name);
				System.out.println("password" + cloned.password);
				System.out.println("age" + cloned.age);
				System.out.println("adult " + cloned.adult);
				System.out.println();
				System.out.println("[���� ��ü�� �ʵ尪]");
				System.out.println("id" + original.id);
				System.out.println("name" + original.name);
				System.out.println("password" + original.password);
				System.out.println("age" + original.age);
				System.out.println("adult " + original.adult);
				
			}
	
}

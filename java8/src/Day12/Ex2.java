package Day12;

public class Ex2 { //�����Ҷ� ���.
			public static void main(String[] args) {
				String a = "aaa";
				String b = "Abc";
				//aaa			aab						abc
		    // 97 97 97		   97 97 98				  97 98 99
				//97-98 = -1 , �׷��� ����� -1�� ���´�.
				//������ ���� ����� �Ѿ�� ���� �ʴٸ� �ű⼭ 2���� ���� ���̸� ���ϰ� �����. �� �������� �Ѿ�� �ʴ´�.
				//����� ������ ���ڰ� �����̰� ������ ���ڰ� �� ����������.
				//�����Ҷ� �� �� ���� ���Ҷ� ��������, �������� ����µ� compareTo�� �������� �� �ִ�.
				//���� �� �������� �߿����� �ʴ�.
				int res = a.compareTo(b);
				System.out.println("�񱳰��: " + res);
				
				String c = "Java Programming Very Good";
				String d = "java Programming";		
													//��ҹ��� ����
				boolean compare1 = c.regionMatches(false, 5, d, 5, 11);
													//��ҹ��� ����x
				boolean compare2 = c.regionMatches(true, 0, d, 0, 4);
				boolean compare3 = c.regionMatches(false, 0, d, 0, 4);
			
				System.out.println(compare1);
				System.out.println(compare2);
				System.out.println(compare3);
			}
}

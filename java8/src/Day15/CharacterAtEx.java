package Day15;

			//String �迭
public class CharacterAtEx {
				//���ϴ� ��ġ�� �ִ� ���� 1���� character�� ��¹޴� �� : charAt(����);
		public static void main(String[] args) {
			String str = "Hellow World!";
			char ch = str.charAt(4);
			System.out.println(ch);

			
			
			for(int i = 0; i<str.length(); i++) {
				//��ο��� ���� ���
				System.out.print(str.charAt(i));
			}
			
			
			
			System.out.println("==============");
			
			//���ΰ� 3��°�� ������ 3�� �����Ѵ�.
			String str1 = "�ڹ� ���α׷���";
			int i = str1.indexOf("����");
			System.out.println(i);
			
			//C���� ������ -1�� �����Ѵ�.
			i = str1.indexOf("C���");
			System.out.println(i);
			
			//�ٴ� 1���� ������ 1�� ����Ѵ�.
			str1 = "�ڹ��ڹ��ڹ� �������� �׷��������Դϴ�.";
			i = str1.indexOf("��"); //�Ű������� �� ���� ��쿡�� 0������ �˻�.
			System.out.println(i);
			//�� ��° �ٸ� ����ϰ� �ʹٸ� ù��° i �� 1�̴� +1�� ���ش�.
			i = str1.indexOf("��" , i + 1); // ù��° �Ű����� : �˻���, 2��° �Ű����� : �˻� ���� ��ġ
			System.out.println(i);
			i = str1.indexOf("��" , i + 1);
			System.out.println(i);
			
			System.out.println("=============");
			
			//replace()�� �̿��Ͽ� ���ϴ� ���ڷ� �ٲ� �� �ִ�.
			//�������θ� ���η� �ٲ� �� �ִ�.
			String str2 = str1.replace("��������", "����");
			System.out.println(str1);
			System.out.println(str2);
			
			String str3 = str1.replace("�ڹ�", "java");
			System.out.println(str3);
			
			String str5 = str1.replace(str1, "_");
			System.out.println(str5);
			
			
			System.out.println("=============");
			
			//substring(); - ���ڿ� ���ڸ� �Է��ϸ� ���ϴ� ���ڿ��� ��°���.
			String str4 = "00022313-232343";
			String f1 = str4.substring(0, 8); //�� ��ȣ �տ������� ���
			System.out.println(f1);
			
			String f2 = str4.substring(9);
			System.out.println(f2);
			
			
			
			
		
		}
	
}

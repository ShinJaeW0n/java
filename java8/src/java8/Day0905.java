package java8;

public class Day0905 {
	//����ȯ�� �ʿ��ϴ�.
	public static void main(String[] args) {
		
		
//		char ch = 'a'; //����ȯ
//
//		for (int i = 1; i <= 26; i++) {
//
//			System.out.print(ch++ + " "); // ?
//
//			
//
//		}System.out.println();
//
//		
//		
//		char ch1 = 'A';
//
//		for (int i = 1; i <= 26; i++) {
//
//			System.out.print(ch1++ + " "); 
//
//			
//
//		}System.out.println();
		
		
		
		//�������� 1�� �������Ѽ� �ϳ��� ����غ� �� ����.
		//���� �Ѱ� 	97		   122�� �־ �Ȱ��� ����.
		for(int i = 'a'; i <= 'z'; i++) {
			System.out.print((char)i + " ");//����ȯ
		}
		
		System.out.println();
		
		
		for(int i = 'A'; i <= 'Z'; i++) {
			System.out.print((char)i + " ");
		}
		
		System.out.println();
		
	}
	
}

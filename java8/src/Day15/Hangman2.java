package Day15;

public class Hangman2 extends Hangman {
	
		//Ŭ������ �ͼ� ���������.
		static String[] arr = {"hello" , "hospital" , "capacity" , "java"};
		static String str = arr[(int)(Math.random()*arr.length)];
	
		public Hangman2() {
			super(str); // <-��ü�� ������ �������� ����. �׷��� ���� �� ���� Ŭ������ �ͼ� ������.
		}

}

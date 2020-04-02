package Day15;

import java.util.Scanner;

public class Hangman {

		private String hiddenString;		//������ ���ڿ�(����)
		private StringBuffer outputString; 	//�÷��̾��� �Է¿� ���� ����� ������ ���ڿ�
		private StringBuffer inputString;	//�÷��̾ �Է��� ���ڵ��� ����
		private int remainder;				//���� ���ڿ�(�� ������ �����ִ� ������ ��)
		private int failed; //<-int�� �̷��� �ƹ��͵� �Է¾��ϸ� �ڵ����� 0���ε�.	//������ Ƚ��
		private Scanner sc; 
		private String inputData;
		
	
		
		public Hangman() {
			this("hello");
			
			}
			
		
		public Hangman(String solution) {
			hiddenString = "hello"; //������ hello , ���� �ʱ�ȭ
			
			/*�ʱ�ȭ �ڵ� �߰�*/
			outputString = new StringBuffer();
			inputString = new StringBuffer();
			remainder = hiddenString.length();
			failed = 0;
			sc = new Scanner(System.in);
			inputData = "";
			
			for(int i = 0; i<remainder; i++) {
				outputString.append("_");
			}
			
			}
		
		
		
			
		void playGame(){
			System.out.println("��� ������ �����մϴ�.");
			show();
			do {
				do {
			setInputData();
			}while (checkChar(inputData)); //�Է��ߴ� ���ڰ� true�� ������ �ٽ� �ݺ��ɰ��̴�.
			processGame(); //�Է¹��� ������ ó���ϴ� ����.
			show();
			}while(failed < 6 && remainder > 0); //������ 6�� �ǰų� �����δ��� 0�� �Ǹ� ���� ����.
			System.out.println("��� ������ �����մϴ�.");
		}
		
				
				//�����Ȳ
		private void show() {
			System.out.println("Ʋ�� Ƚ�� :" + failed + "/6");
			System.out.println(outputString); // <- ����.
		}

		
		
		private void setInputData(){ //���ϴ� ��� �ε��� ����. �� ��ȣ ������ ������.
			System.out.print("���ڸ� �Է����ּ���: ");
			this.inputData = sc.next().substring(0, 1); //�ѱ��ڸ� ���� �� �ֵ���
		}
		
				//Ʈ��,�޽� 	//���� üũ
		private boolean checkChar(String inputData) {
			//�� ���ڰ� �ִ��� ������ Ȯ���� �� �ִ�.
			if (inputString.indexOf(inputData) == -1){ //�����Ͱ� ���ٸ�
				inputString.append(inputData); //inputData�� �߰�.
				return false;
			}
			
			System.out.println("�̹� �Է��� �����Դϴ�.");
			return true;
		}
				//Ȯ���� ���� ó���Ѱ�.
			private void processGame() {
				//���ڷ� ���ðŶ�.
				
				if(hiddenString.indexOf(inputData) == -1) { //, ���信 ���� ���ڶ��
					failed++;
				}else {
					int index = hiddenString.indexOf(inputData);
					do {
					outputString.setCharAt(index, inputData.charAt(0)); // <-ù��° ���ڸ� �����ͼ� index���� �ϰڴ�? 
					remainder--;
					index = hiddenString.indexOf(inputData, index+1);
					}while(index != -1); //���ư��鼭 �ִ°� �� ã�� -1�Ǹ� �������´�.
					}
			}

}
		
		
		
		
//		for(int i = 0; i < 6; i++) {
//			
//			System.out.println(outputString);
//			System.out.print("���ĺ� 1���� �Է����ּ���: ");
//			inputData = sc.next().substring(0, 1);
//			
//			if(inputData.equals(hiddenString.charAt(i))) {
//				
//				System.out.println(inputData+outputString);
//			}else {
//				
//				failed++;
//				System.out.println("Ʋ�Ƚ��ϴ�. �ٽ� �Է����ּ���.");
//			}
//			
//			
//		} System.out.println("Ʋ������: " + failed);
		
		
		
		
		
		
		
		
		
		
		
//		public String playGame1() {
//			
//			for(int i = 0; i<hiddenString.length()+2; i++) {
//				
//				System.out.println(str);
//				System.out.print("���ĺ� 1���� �Է����ּ���: ");
//				me = sc.next();	
//				
//				
//				if(me.equals(hiddenString.charAt(i))) {
//				String ch1 = me;
//					System.out.println(ch1+str);
//				}else {
//					System.out.println("Ʋ�Ƚ��ϴ�. �ٽ� �Է����ּ���.");
//				}
//				
//				
//			}
//			System.out.println("¦¦¦! �����Դϴ�.");
//			return hiddenString;
//		
//		
//		}
		
		
		
		
		
		
		
		
			
			
			
		
	

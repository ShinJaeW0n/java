package Day23;

import java.util.Date;

		//��Ʈ�� ����-5	
public class PrintfFormatEx {
		public static void main(String[] args) {
			int num = 10;
			double log = Math.log(num);
			System.out.format("log(%d) : %+10.6f %n" , num, log);
										//�Ҽ��� 6�ڸ��� ���
			//format�� printf�� �Ȱ���.
			
			Date today = new Date();
			System.out.printf("���ó�¥: %tY�� %tm�� %td�� \n", today, today, today);
			System.out.printf("���ó�¥: %1$tY��  %1$tm�� %1$td�� \n", today);
			System.out.printf("����ð�: %1$tH��  %1$tM�� %1$tS�� \n", today);
			System.out.format("���ó�¥: %tY��  %tm�� %td�� \n", today,today,today);
		}
}

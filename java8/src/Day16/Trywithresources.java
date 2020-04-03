package Day16;

import java.io.File;
import java.util.Scanner;

public class Trywithresources {
		
		public void getData(String file) {
			Scanner sc = null; //�ʱ�ȭ ���ֱ�.
			
			try {
				sc = new Scanner(new File(file));
				System.out.println(sc.nextLine());
			
			//����ó���� ���ָ� �ߴܵ��� �ʰ� ��� ����� �� �ִ�.
			}	catch (Exception e) {
				System.err.println("���ܹ߻�");
				System.out.println();
				e.getMessage();
				System.out.println();
				e.printStackTrace();
			
			} finally {	//����� ��Ʈ���� ������ �ݱ� ���ؼ� finally ������ �̿�. (1.6 ���� ����)
				if(sc != null) {
					sc.close();
				}
			
			}
			
			}
			
		public static void main(String[] args) {
			
		
			Trywithresources twr = new Trywithresources();
			twr.getData("text.txt");
		}

		
		
}

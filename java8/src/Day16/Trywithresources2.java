package Day16;

import java.io.File;
import java.util.Scanner;

public class Trywithresources2 {
		public void getData(String file) {
			
				//try�ȿ� �ڵ����� ������ ������ �־�����Ѵ�. ()�� �Ű������ȿ� �־�����Ѵ�.
			try(Scanner sc = new Scanner(new File(file)); 
				Scanner sc2 = new Scanner(System.in)	//���� ���� �ڵ� ���� �ҽ��� �ۼ��� �� �ִ�.
			) {
				System.out.println(sc.nextLine());
			
			}	catch (Exception e) {
				System.err.println("���ܹ߻�");
				System.out.println();
				e.getMessage();
				System.out.println();
				e.printStackTrace();
			
			} 
			
			}
			
			public static void main(String[] args) {
		
			Trywithresources2 twr = new Trywithresources2();
			twr.getData("text.txt");
		}

		
		
}

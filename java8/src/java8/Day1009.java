package java8;

public class Day1009 {

		public static void main(String[] args) {
			if(args.length !=2) {
				System.out.println("�� �� �Է��ϼ̽��ϴ�.");
				System.out.println("2���� ������ �Է����ּ���.");
				System.out.println("���α׷��� �����մϴ�.");
				System.exit(0);
				}
			String num1 = args[0];
			String num2 = args[1];
			int iNum1 = Integer.parseInt(num1); //Integer.parseInt() => ���ڷ� �������ִ� ��.
			int iNum2 = Integer.parseInt(num2);
			System.out.println("num1: " + num1 + ", num2: " + num2);
			System.out.println("num1 + num2 =" + (iNum1+iNum2));
			
			
	}
}
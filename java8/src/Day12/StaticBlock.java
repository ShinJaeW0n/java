package Day12;

public class StaticBlock {
		static String company = "�Ｚ";
		static String kind = "LCD";
		static String product = company + "-" + kind; //���� ������ �̷��� �ص� ����.
		static String pro2;
		
		//8������ stataic�� �����Ϸ��� ������.
		//�׷��� �ؿ� ó�� �߾���.
		static {
			pro2 = company + "-" + kind;
		}
		
		

}

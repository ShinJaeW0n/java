package Day12;

public class MemberServiceEx {

	public static void main(String[] args) {
		MemberService me = new MemberService();
		Member hong = new Member("ȫ�浿" , "Hong");
		hong.password = "12345";
		hong.age = 30;
		
		if(me.login(hong.Id, hong.password)) {
			System.out.println("�α��� �Ͽ����ϴ�.");
			me.logout(hong.Id);
		}else {
			System.out.println("������ �� �� �Է��ϼ̽��ϴ�.");
		}
		
		
		//ȫ �� ��츸 �α��� �ǰ� �س��Ƽ� ��� ������ �� �� �Է��ߴٰ� ��.
		Member lee = new Member("�̿���" , "Lee");
		hong.password = "12345";
		hong.age = 20;
		
		if(me.login(lee.Id, lee.password)) {
			System.out.println("�α��� �Ͽ����ϴ�.");
			me.logout(lee.Id);
		}else {
			System.out.println("������ �� �� �Է��ϼ̽��ϴ�.");
		}
		
	}
}

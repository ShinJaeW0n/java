package Day12;

public class MemberService {
	
		boolean login(String Id, String password) {
		if (Id.equals("Hong") && password.equals("12345")) {
			return true;
		} else {
			return false;
		}

	}

		void logout(String Id) {
			if(Id.equals("Hong")) {
				System.out.println(Id + "���� �α׾ƿ��Ͽ����ϴ�.");
			}
			
			}

		}

package Day13;

public class StudentEx {

		public static void main(String[] args) {
									//��� �׳� �����ڷ� �����ؼ� 1000�� �������� ����.
			Student1 s1 = new Student1("ȫ�浿" , "����" , 30, 20200001);
			Student1 s2 = new Student1();
			s2.setName("������"); //private�̱� ������ setName ���.
			s2.setGender("����");
			s2.setAge(40);
			s2.setsNo(20200002);
			s1.showInfo();
			s2.showInfo();
			
		}


}


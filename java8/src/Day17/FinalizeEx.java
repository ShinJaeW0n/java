package Day17;

public class FinalizeEx {

			public static void main(String[] args) {
				Counter counter = null;
				for(int i=1; i<=50; i++) {
					counter = new Counter(i);
					counter = null; //counter ��ü�� ������� ����
					System.gc(); //������ ������ ���� ��û
				}//������ �������� ����ǰ� 50�� ��ü�� �ƴ� �Ϻθ� ������.
	}
}

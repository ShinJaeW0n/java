package Day16;

	//���׸�
public class Box2<T> { //���׸��� Ÿ�� �Ű�����. �� Ŭ�������� �� ���ִ� Ÿ��.
	//T = String , String�־ String�޾����� Ÿ�Ժ�ȯ����.
	//**������ Ÿ�Ը� �� ������.
	
	private T object;
	
	void set(T object) {
		this.object = object;
	}

	T get() {
			return object;
	}
	
	
}

package Day12;

public class Person {
	
	//��װ� �޼ҵ�.
	void sound() {
		System.out.println("���ϴ�.");
	}

	void run() {
		System.out.println("�޸���.");
	}
	
	void eat() {
		System.out.println("������ �Դ�.");
	}

	void oneDay() {
		//�̷��� �����ϰ� ���� �ʿ����.
//		Person person = new Person();
//		person.sound();
	
		//�� �ڽ��� ���� ����ϴ� ��ü�� ���� �ʿ� x
		//���� �޼ҵ� �ȿ��� �̷��� �ٷ� ȣ�Ⱑ��.
		this.sound();
		eat(); //�տ�this�� �����Ǿ�����.
		run();
	}

}
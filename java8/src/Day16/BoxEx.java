package Day16;


public class BoxEx {

	public static void main(String[] args) {
		
		String name = "ȫ�浿";
		
		//������
		Box bx = new Box();
		bx.set(name); //String�� (�θ�)object�� �ڵ� ����ȯ.
		
		String name2 = (String)bx.get(); //�긦 �ٽ� ������ ��Ʈ������ ������.
		//Object -> String ���� ����ȯ
		
		System.out.println(name2);
		
		
		Apple apple = new Apple();
		System.out.println(apple.hashcode);
		bx.set(apple); // apple���� object�� �ڵ� ����ȯ
		Apple apple2 = (Apple)bx.get();	//object -> Apple ��������ȯ
		System.out.println(apple2.hashcode);
		
	
							//1.8�������� �� <>�ȿ� ��������. ��<>�� ����� ��.
		Box2<String> box = new Box2<>();
		box.set(name);
		name2 = box.get();
		System.out.println(name2);
		
//		box.set(apple); // <- box�� ���׸����� String�� ����ϵ��� �����Ͽ����ϴ�.
		
		Box2<Apple> box3 = new box2<>();
		box3.set(apple);
		apple2 = box3.get();
//		box3.set(name); // <- �Ұ���. box3�� apple�� ��밡���մϴ�. String�� ���Ұ����մϴ�.
		
		
		
	}
}

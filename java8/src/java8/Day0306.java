package java8;

public class Day0306 {
	public static void main(String[] args) {
		boolean var1 = true;
		boolean var2 = false;
		boolean var3 = true;
		boolean var4 = false;
	
		
		System.out.println(var1 && var2);
		System.out.println(var1 && var3);
		System.out.println(var1 && var4);
		
		System.out.println(var1 || var2);
		System.out.println(var1 || var3);
		System.out.println(var1 || var4);
		System.out.println(var2 || var3);
		System.out.println(var2 || var4);
		
		System.out.println(!var1);
		System.out.println(!var2);
		System.out.println(!var3);
		
	
		boolean light = false;
		System.out.println("���ĵ��� ������ ��������? " + light);
		
		light = !light; //���Կ����� = �����ʰ��� �������� �����ϰ� ���� �������� �����ؾ��Ѵ�.**
		System.out.println("���ĵ尡 ��������?" + light);
		
		light = !light;
		System.out.println("���ĵ尡 ��������?" + light);
		
		light = !light;
		System.out.println("���ĵ尡 ��������?" + light);
		
		light = !light;
		System.out.println("���ĵ尡 ��������?" + light);
		
		//�̷����� ����̶��Ѵ�. ����ġ�� �����״��ϴ� ȿ��.
	}
}

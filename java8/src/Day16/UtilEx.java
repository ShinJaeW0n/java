package Day16;

public class UtilEx {
	
		public static void main(String[] args) {
			Box2<String> box =  Util.<String>boxing("ȫ�浿");
			String name = box.get(); //String�� ����Ǿ� ����.
			System.out.println(name);
			
									//boxing�� integer�� ���� �ڽ��̴�.
			Box2<Integer> box2 = Util.boxing(100); //�޼ҵ� ȣ�� �� ���׸��� ���ߵȴٸ� ������ �� �ֽ��ϴ�.
			int number = box2.get();
			System.out.println(number);
			
			
			
		}

}
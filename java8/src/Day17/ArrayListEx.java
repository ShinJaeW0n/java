package Day17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayListEx {
			
	
			/* �÷���   ::: remove, add, get ���� �߿�. �ܿ��ֱ�.*/
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		System.out.println(list.size()); //0
		
		
		list.add("���");
		list.add("��");
		list.add("������");
		list.add("���ξ���");
		
		System.out.println(list.size()); //4
		
		String str = list.get(0); 
		System.out.println(str);//���
		
		System.out.println("============");
		
		for(int i = 0; i<list.size(); i++) {
			System.out.println(list.get(i)); //������� ��µ�. get -> ������ �����Ͷ�.
		}
		
		System.out.println("============");
		
		list.add(2,"����"); //2���� ������ ����
		for(String t : list) {
			System.out.println(t); //�߰��� 2�� ������ ����.
		}
		
		System.out.println("============");
		
		
		list.remove(1);//1���� ����
		for(int i = 0; i<list.size(); i++) {
			System.out.println(list.get(i)); //������� ��µ�.
		}
		
		
		System.out.println("================");
		
		list.remove("������");// �������� ����. ���ڻ� �ƴ϶� ��(����)�� �־ ���� �� ���� �ִ�.
		for(int i = 0; i<list.size(); i++) {
			System.out.println(list.get(i)); //������� ��µ�.
		}
		
		
		System.out.println("==========");
		
		list.set(1, "����"); //1���� ���ܷ� �ٲ��ְ� �ʹ�.
		for(int i = 0; i<list.size(); i++) {
			System.out.println(list.get(i)); //������� ��µ�.
		}
		
		System.out.println(list.size()); //3�� �ۿ� ������ 3�� ���´�.
		
		System.out.println("===========");
		
		
		System.out.println(list.contains("����")); //���ܰ� �ֳ�? Ʈ�� �޽��� ����.
		System.out.println(list.contains("����")); //���䰡 �ֳ�?
		System.out.println(list.isEmpty() ); //����Ʈ�� �����? Ʈ�� �޽�
		
		System.out.println("================");
		
		//�ݴ��Ϸ��� �տ�! ���̸� �ȴ�.
		if(!list.isEmpty()) { //<= ����Ʈ�� ���� �ʾҴٸ�!
			list.clear(); // <= ����Ʈ�� �� �����.
		}
		
		System.out.println(list.isEmpty()); //����Ʈ�� �����? Ʈ�� �޽�
		System.out.println(list.size()); //�ȿ� �ƹ��͵� ������ 0���� ���´�.
		
		
		System.out.println("============");
		
		//�迭�� ��� 30�� Ȯ�� �Ҷ�
		int[] arr = new int[] {10,20,30,40,50};
		for(int num : arr) {
			if(num == 30) { 
				System.out.println(num == 30); //Ʈ��.
			}
		}
		
		System.out.println("=============");
		
		//����Ʈ �̿��ؼ� 30�� Ȯ���� ���.  
		//���׸����� �⺻�� int ����. �������� �� �� ����.
		List<Integer> arrList = Arrays.asList(10,20,30,40,50);
		System.out.println(arrList.contains(30)); //Ʈ��.
		
		//�迭�� ����Ʈ�� �ѹ��� �ٲٴ� ����� ����. �ؿ�ó�� �����δ� ����.
//		List<Integer> streamList = Arrays.stream(arr).boxed().collect(Collectors.toList());
//		for(int i = 0; i<streamList.size(); i++) {
//			System.out.println(streamList.get(i));
//		}
		
		System.out.println("===============");
		
		//����Ʈ�� �迭�� �ٲ� ��.
		Integer[] ary = arrList.toArray(new Integer[arrList.size()]);
		
		//Ŭ��� ������ ����� �ȵǰ� get,set,contain�� ��밡���ϴ�.
//		arrList.clear();
//		System.out.println(arrList.get(0));
		
		
		
		
		
		
		
	}
}

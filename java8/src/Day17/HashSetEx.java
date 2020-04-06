package Day17;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

			/*list�� set*/
public class HashSetEx {
		public static void main(String[] args) {
			List<String> list = new ArrayList<>();
			
			list.add("���");
			list.add("��");
			list.add("����");
			list.add("���");
			list.add("���"); // list�� ������ ���� ���� �� �ִ�. �ߺ� ����
			for(String str : list) {
				System.out.println(str);
			}
			
			System.out.println();
			
			
			//set�� ���̰� �ȴ�.
			Set<String> set = new HashSet<>();
			set.add("���");
			set.add("��");
			set.add("����");
			set.add("���");
			set.add("���");//set�� ������ ���� ������� ����. ��� 2�� �־ 1���� ����.
			for(String str : set) {
				System.out.println(str);
			}
			
			System.out.println(set.contains("���")); // Ʈ��.
			System.out.println(set.isEmpty()); //�޽�
			if(!set.isEmpty()) {
				set.clear();
			}
			
			System.out.println(set.size()); //0�̶�� ���.
			
			System.out.println("=================");
			
			//��ƿ�� ���;���.
			Iterator<String> iterator = list.iterator(); //�÷��� ���� �޼ҵ�.
						//���� �ؽ�Ʈ��� ���ͷ����� �ؽ�Ʈ ���� str�� �־����.
			while (iterator.hasNext()) {
				String str = iterator.next();
				System.out.println(str);
			}
			
			System.out.println();
		
			
		}
}

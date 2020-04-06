package Day17;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapEx {
			
				/*�����ִ� 3�� �� ���� ��. �߿�!*/
	
		public static void main(String[] args) {
			
			//���� 2���� Ű, ���� �־�����Ѵ�.
			Map <String , Integer> map = new HashMap<>();
			//put���� ���� �־��ش�.
			map.put("����", 80);
			map.put("����", 97);
			map.put("����", 79);
			map.put("����", 82);
			
			
			
			
			//Ű�� �˻��� ���� �ְ� ����(��)���� �˻��� �� �� �ֵ�.
			System.out.println(map.containsKey("����")); //Ʈ��
			System.out.println(map.containsValue(90)); //�޽�
			System.out.println(map.isEmpty());
			
			System.out.println("=====================");
			
			//keySet
			Set<String> keySet = map.keySet();	//set�� ����ؼ� ������ �������� ����.		
			for(String key : keySet) {
				System.out.println(key + " : " + map.get(key)); //get�� key ���� ������ �׿� �����Ǵ� ���� ���ϵȴ�.
			}
			
			
			System.out.println();
			
			map.put("����", 80);
			/*Set<String>����*/keySet = map.keySet();	//set�� ����ؼ� ������ �ٸ��� ����.		
			for(String key : keySet) {
				System.out.println(key + " : " + map.get(key)); //������ 80���� �ٲ�. key�� �ߺ��� �ȵǱ� ����. 
				//�ڿ� �ٲ� ������ ����� �ȴ�. ���� �ٲܶ� put�� ����� �� �ִ�. ����� ������ ���� �����ص� ��µǵ��� ���� �ߺ� ����. 
			}
			
			
			System.out.println();
			
			//��ƿ�� ����Ʈ �ؾ���.
			Set<Entry<String, Integer>> entrySet = map.entrySet();
			Iterator<Entry<String, Integer>> iterator = entrySet.iterator();
							
						//���ͷ����Ͱ� ������ ���ٸ�
			while(iterator.hasNext()) {
				Entry<String, Integer>entry = iterator.next();
				String key = entry.getKey(); //Ű �����͸� ��������
				int score = entry.getValue(); //�� �����͸� ������.
				System.out.println(key + " : " + score);
			}
			
			
			System.out.println("=================");
			
			int num = map.remove("����"); //Ű�� ������.
			System.out.println(num);
			keySet = map.keySet();		
			for(String key : keySet) {
				System.out.println(key + " : " + map.get(key)); 
		
		}
			
			System.out.println("==================");
			
			boolean isEntry = map.remove("����", 79);
			System.out.println(isEntry);
			keySet = map.keySet();		
			for(String key : keySet) {
				System.out.println(key + " : " + map.get(key)); 
		
		}
			
			
			System.out.println("========================");
			
			isEntry = map.remove("����", 80);
			System.out.println(isEntry);
			keySet = map.keySet();		
			for(String key : keySet) {
				System.out.println(key + " : " + map.get(key)); 
		
		}
			
			System.out.println("===================");
			
			
			if(!map.isEmpty()) {
				map.clear();
			}
			System.out.println(map.size());
			
	
}
		
}

package Day12;

import java.util.StringTokenizer;

public class TokenEx {
		
		public static void main(String[] args) {
						// /�� �������� ����. ������ /�� ������.
			String now = "2020/03/31";
			
			StringTokenizer st = new StringTokenizer(now, "/");
			
			int cnt = st.countTokens();
			System.out.println("���� ��ū ��: " + cnt);
			
			//st�ȿ� ��ū�� �� ������ Ʈ��, �ƴϸ� �޽�
			while(st.hasMoreTokens()) {
				String temp = st.nextToken(); //2020��ȯ �� �� ������ 03 �� ������ 31 ��ȯ �� �ƹ��͵� ������ ��.
				System.out.println(temp);
			}
			
			
			//StringTokenizer�� ���ų� split�� ��.
			String[] arr = now.split("/");
			for(String str : arr) {
				System.out.println(str);
			}
			
			
		}
}

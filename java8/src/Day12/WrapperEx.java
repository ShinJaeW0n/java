package Day12;

import java.util.ArrayList;
import java.util.List;

//�ڽ�, ��ڽ�***
public class WrapperEx {
	public static void main(String[] args) {
			
			int number = 10;
			
			
			//�ڽ� , �⺻���� int�� ��ü�� �ٲٰ� ������, ��ü�� ó���ؾ��� �κ��� �ʿ��ϱ� ������ ���.
			Integer iBox = new Integer(number); //�Ű������� �⺻�� �Ǵ� ���ڿ��� �Է��� �� �ִ�.
			Integer iBox2 = Integer.valueOf(number);
			
			//��ڽ� , ��ü�� int�⺻������ �ٲ� ��
			number = iBox.intValue();
			number = iBox2.intValue();
			
			//�ڵ� �ڽ�
			Integer iBox3 = number;
			
			//�ڵ� ��ڽ� ,������� ��ü�� �⺻���� ������ �ȵǴµ� �ڵ� ��ڽ̵Ǽ� ������ ��.
			int result = iBox3+10;
			System.out.println(result);
			
			//List�� ��ü�� ���� �� ����. �׳� �⺻���� int�δ� List ����� ������� �� ���� ������.
			List<Integer> list = new ArrayList();
			
	}
}

package Day23;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

			//��Ʈ�� ����-1
public class IStreamReader {

		static String fname;
		public static void main(String[] args) {
			int idata = -1; //read���� �ƹ��͵� �� �о����� -1 ����.
			Reader isr = new InputStreamReader(System.in);
			System.out.println("Ű���忡�� �����Է�(�������� ����)");
			System.out.println("=========================");
			
			try {
				while(true) {
					idata = isr.read(); //�Ű������� ������ �� ����Ʈ�� �����´�.
					if(idata == -1) //�о���°� ���ٸ�
						break;//�����. , if�� {}���� �� ���̸� �� ���ٸ� ������ �޴´�.
					System.out.println((char)idata);//idata�� int�ϱ� ���ڷ� ����ȯ.
				}
			} catch (IOException e) {
				System.out.println(e.toString());	
			}
			
		}
}

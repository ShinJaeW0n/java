package Day20;

import javax.swing.JFrame;
	//���ø� ���� -4  ����
public class RoundRectEx {

		public static void main(String[] args) {
			
			JFrame f = new JFrame("�簢�� ����� ����"); //Frame = Ʋ.
			RoundRect p = new RoundRect();
			
		
			f.setSize(500, 500);
			f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // <- ������ â xǥ��.
			f.add(p);
			f.setResizable(false); //����� ������ �� ����.
			f.setVisible(true); //Ʈ�縦 �ؾ� ����ȴ�.
		}
}

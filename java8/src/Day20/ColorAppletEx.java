package Day20;

import java.awt.Color;

import javax.swing.JFrame;

			//���ø� ����-1 ����
public class ColorAppletEx {

		public static void main(String[] args) {
			
			JFrame f = new JFrame("����ȯ ����"); //Frame = Ʋ.
			ColorApplet p = new ColorApplet();
			p.init();
		
			f.setSize(500, 500);
			f.setBackground(Color.BLUE);
//			f.setTitle("���ø� ù ����");
			f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // <- ������ â xǥ��.
			f.add(p);
			f.setVisible(true); //Ʈ�縦 �ؾ� ����ȴ�.
		
	

		}
}

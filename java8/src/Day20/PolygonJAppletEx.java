package Day20;

import java.awt.Color;

import javax.swing.JFrame;
//���ø� ���� -5 ������ �����. ����.
public class PolygonJAppletEx {

		public static void main(String[] args) {
			JFrame f = new JFrame("������ ����� ����"); //Frame = Ʋ.
			PolygonJApplet p = new PolygonJApplet();
			f.setBackground(Color.ORANGE);
		
			f.setSize(500, 500);
			f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // <- ������ â xǥ��.
			f.add(p);
			f.setResizable(false); //����� ������ �� ����.
			f.setVisible(true); //Ʈ�縦 �ؾ� ����ȴ�.
		}
}

package Day20;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;
//���ø� ���� -3
public class DrawLine extends JPanel {

		public void init() {
			setBackground(Color.ORANGE);//����� �빮��!
		}
		
		public void paint(Graphics g) {
			g.setColor(Color.RED);
			g.drawLine(10, 20, 150, 150);
			g.setColor(Color.black);
			for(int y = 0; y < 150; y= y+20)  //y�� 20�� �����Ѵ�.
				g.drawLine(10+y, 20, 10+y, 150);
			
			
		}
}

package Day20;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

			//���ø� ����-1
public class ColorApplet extends JPanel {

		public void init() {
			
			setBackground(Color.blue);
		/*��� 1: �гλ��
		 * Panel p1 = new Panel();
		 * p1.setBackground(Color.blue);
		 * this.add(p1)*/
			
		
		}
		

		public void pain(Graphics g) {
			/*���2 : paint �޼ҵ忡�� fillRect ���
			 * g.setColor(Color.blue)
			 * g.fillRect(0,0, getWidth(), getHeight());*/
			
			Color myColor = new Color(255,0,0);
			g.setColor(myColor);
			g.drawString("������ �۾��� �׸���" , 40, 100);
		}


}

package Day21;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JPanel;

//���ø� �ǽ����� -1
public class PieChart extends JPanel {

		int[] input = {30, 15, 45, 10};
		String[] title = {"��", "��", "��", "������"};
		Color[] color = {Color.RED, Color.ORANGE, Color.BLUE, Color.GRAY};
		
		public void init() {
			setBackground(Color.LIGHT_GRAY);
		}
		
		
		public void paint(Graphics g) {
			
			
			int startAngle = 0;
			int pieSize;
			int subtot = 0;
			String param = "";
			Font myFont = new Font(param, Font.PLAIN, 10);
			
		
			
		for(int i = 0; i < input.length; i++) {
			//���̸� �׸��� �κ�
			
			int arcAngle = (input[i] * 100 / subtot) * 360/100;
			g.setColor(color[i]);
			
			g.fillArc(50, 50, pieSize, pieSize, startAngle, arcAngle);
			startAngle += arcAngle;
			
//			g.fillArc(30, 15, 300, 300, 200, 360);
//			
//			g.setColor(Color.BLUE);
//			g.fillArc(30, 15, 300, 300, 170, 150);
//			
//			g.setColor(Color.WHITE);
//			g.fillArc(30, 15, 300, 300, 110, 60);
//			
//			g.setColor(Color.GREEN);
//			g.fillArc(30, 15, 300, 300, 0, 110);
//			
			
			//���ʸ� �׸��� �κ�
			g.fillRect(300, 50+i * 32, 30, 30);
			g.setColor(Color.BLACK);
			g.drawString(title[i], 335, 70+i*32);
			
			
			
//			g.setColor(Color.GREEN);
//			g.fillRect(45, 10, 20, 20);
//			g.setFont(myFont);
//			param = "��";
//			g.drawString(param, 75, 10);
			
			
			
		
		}
		
		
		
		}
		
		
	
}

package Day21;

import java.awt.Color;

import javax.swing.JFrame;

public class FlowerEx {
		public static void main(String[] args) {
			
			JFrame f = new JFrame("������Ʈ"); //Frame = Ʋ.
			Flower p = new Flower();
			
		
			f.add(p);
			f.setSize(600, 600);
			f.setBackground(Color.LIGHT_GRAY);
			f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // <- ������ â xǥ��.
			f.setResizable(false); //����� ������ �� ����.
			f.setVisible(true); //Ʈ�縦 �ؾ� ����ȴ�.
		}

}

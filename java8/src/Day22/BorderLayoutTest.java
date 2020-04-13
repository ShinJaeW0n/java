package Day22;

import java.awt.BorderLayout;
import java.awt.Button;

import javax.swing.JFrame;

//���� ���̾ƿ� -1 ����, ���๮

public class BorderLayoutTest extends JFrame{

		public BorderLayoutTest() {
			
			super("���� ���̾ƿ�");
			//JFrame�� �⺻ ���̾ƿ� �Ŵ����� BorderLayout�̱� ������, BorderLayout�Ŵ����� �������� �ʾƵ���.
			add("North", new Button("North"));
			add(BorderLayout.EAST, new Button("East"));
			add(new Button("Center"), BorderLayout.CENTER);
			add(new Button("South"), BorderLayout.SOUTH);
			add(new Button("West"), BorderLayout.WEST);
			setSize(300,300);
			setVisible(true);
			
		}
	
		public static void main(String[] args) {
			BorderLayoutTest bt = new BorderLayoutTest();
			bt.setDefaultCloseOperation(EXIT_ON_CLOSE);
		}
}

package Day22;

import java.awt.BorderLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

		//�޴��� �ǽ�1  ����, ����

public class MenuBarTest extends JFrame{

		public static void main(String[] args) {
			
			JFrame f = new JFrame();
			JMenuBar menubar = new JMenuBar();
			JMenu menu1 = new JMenu("����");
			JMenu menu2 = new JMenu("����");
			JMenu menu3 = new JMenu("����");
			JMenuItem item1 = new JMenuItem("���� �����");
			JMenuItem item2 = new JMenuItem("����");
			JMenuItem item3 = new JMenuItem("����");
			menu1.add(item1);
			menu1.add(item2);
			menu1.add(item3);
			JMenuItem item4 = new JMenuItem("�߶󳻱�");
			JMenuItem item5 = new JMenuItem("����");
			JMenuItem item6 = new JMenuItem("�ٿ��ֱ�");
			menu2.add(item4);
			menu2.add(item5);
			menu2.add(item6);
			JMenuItem item7 = new JMenuItem("��������");
			JMenuItem item8 = new JMenuItem("����ǥ����");
			menu3.add(item7);
			menu3.add(item8);
			
			menubar.add(menu1);
			menubar.add(menu2);
			menubar.add(menu3);
			
			//���⼭ ���� ���� �� �ϱ�.
			TextField tf = new TextField();
			tf.setEnabled(false);
//			tf.setEditable(false);
			
			//������ ��ġ �����ְ�.
			f.add(tf, BorderLayout.SOUTH);
			//�޴��� ����.
			f.setJMenuBar(menubar);
			f.setVisible(true);
			f.setSize(300, 300);
			
			//���ٽ�����, ���ٽ����� ���ҰŸ� �͸�����ü�� �������. �� ���� ��**
			ActionListener ac = e -> tf.setText(e.getActionCommand()); //String�� �ƴ϶�� toString�� �����ͼ� ��Ʈ������ �ٲ��� �� �ִ�.
			item1.addActionListener(ac);
			item2.addActionListener(ac);
			item3.addActionListener(ac);
			item4.addActionListener(ac);
			item5.addActionListener(ac);
			item6.addActionListener(ac);
			item7.addActionListener(ac);
			item8.addActionListener(ac);
			
			
		}
		
	

		
}

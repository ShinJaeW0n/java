package Day21;

import java.awt.FlowLayout;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

//���� ���� -4 Ǯ�ٿ� ������ ����Ʈ. JComboBox
public class JComboBoxTest extends JFrame {
		JCheckBox jcb1, jcb2, jcb3;
		JComboBox jcm1;
		JPanel jp1;
		String[] title = {"C", "���־�����", "JAVA ���α׷���","�ڷᱸ��", "�̻����"};
		
			JComboBoxTest() {
			super("�޺��ڽ� �����");
			setLayout(new FlowLayout()); //���ʺ��� ����������
			jp1 = new JPanel();
			jcb1 = new JCheckBox("��ǻ�� ����", true);
			jcb2 = new JCheckBox("���ڻ�ŷ�", true);
			jcb3 = new JCheckBox("�濵��", false);
			jp1.add(jcb1); jp1.add(jcb2); jp1.add(jcb3);
			add(jp1);
			jcm1 = new JComboBox(title);
			add(jcm1);
			setSize(300,250);
			setVisible(true);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
		}
		
			public static void main(String[] args) {
				new JComboBoxTest();
		}
		
}
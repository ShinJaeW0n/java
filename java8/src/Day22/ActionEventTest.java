package Day22;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

		//�׼��̺�Ʈ-1 �޽���â, ����, ����
		public class ActionEventTest extends JFrame implements ActionListener {
				JButton jbt1, jbt2, jbt3, jbt4; //�ʵ忡 ��ư ����. �Ʒ� ������ �޼ҵ��� �������� ������.

				
				//������
				public ActionEventTest() {
					super("ActionEvent ó��"); //JFrame
					
					setLayout(new FlowLayout()); //������� ���
					jbt1 = new JButton("�Է�");
					jbt2 = new JButton("Ȯ��");
					jbt3 = new JButton("�ɼ�");
					jbt4 = new JButton("�޽���");
					
					add(jbt1); //�׳� add�� this. JFrame
					add(jbt2);
					add(jbt3);
					add(jbt4);
					
					jbt1.addActionListener(this); //this�� �׼Ǹ�����!
					jbt2.addActionListener(this);
					jbt3.addActionListener(this);
					jbt4.addActionListener(this);
					
					setSize(300,300);
					setVisible(true);
					
					}

					@Override
					public void actionPerformed(ActionEvent e) {
						if(e.getSource() == jbt1) { //��ư 1�� ��ü(�Է�)�� ���ٸ� //�θ� ���۳�Ʈ - this(��)
							String name = JOptionPane.showInputDialog(this, "�̸��� �Է��ϼ���"); //���̿ɼ��� - �ɼ��г�(���� �ɼ��� ������ �ִ�).���� ù��° ����ǲ ���̾�α�.
							//�ԷµǴ� ��			     //���ο� �Է�â�� �ߴ°�. ���-�ٸ� â�� ����� ��� ���� â�� ����� �� ���� ��.
							System.out.println(name);
						}
						if(e.getSource() == jbt2) { 
							int con = JOptionPane.showConfirmDialog(this, "Ȯ��?");
							if(con==JOptionPane.YES_NO_OPTION);{
//								System.exit(0);
							}
						}
						
						if(e.getSource() == jbt3) {
							String[] option = {"�˻�", "�߰�", "���"};
							JOptionPane.showOptionDialog(this, "���ϴ� ���� ����", "�ɼ� ��ȭ����",
									JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, 
									null, option, option[0]);
						}
						
						if(e.getSource() == jbt4) {
							JOptionPane.showMessageDialog(this, "�޽��� ��ȭ����");
						}
							
						}

						public static void main(String[] args) {
							ActionEventTest at = new ActionEventTest();
							at.setDefaultCloseOperation(EXIT_ON_CLOSE);
						}
					
					}

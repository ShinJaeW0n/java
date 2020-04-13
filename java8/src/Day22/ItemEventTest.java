package Day22;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.Box;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

		//�������̺�Ʈ-1 �޽���â, ����, ����
		public class ItemEventTest  extends JFrame{
			JLabel txt1, txt2;
			JRadioButton r1, r2, r3, r4, r5, r6;
			
			public ItemEventTest() {
				super("������ �̺�Ʈ ó��");
				setLayout(new FlowLayout());
//				setLayout(new GridLayout(2,2));
				
				//�������� ������Ʈ �߰�
				Box hBox = Box.createHorizontalBox();
				ButtonGroup rgGroup = new ButtonGroup();
				rgGroup.add(r1 = new JRadioButton("�츮 ���� ����"));
				hBox.add(r1);
				
				
				hBox.add(Box.createHorizontalStrut(30));
				rgGroup.add(r2 = new JRadioButton("�Ｚ����"));
				hBox.add(r2);
				
				hBox.add(Box.createHorizontalStrut(30));
				rgGroup.add(r3 = new JRadioButton("�������"));
				hBox.add(r3);
				
				hBox.add(Box.createHorizontalStrut(30));
				hBox.add(Box.createGlue());
				
				JPanel panel = new JPanel(new BorderLayout());
				//�ܰ���
				panel.setBorder(new TitledBorder(new EtchedBorder(), "����ȸ�� ����"));
				panel.add(hBox);
				
				//�������� ������Ʈ ����
				Box hhbox = Box.createHorizontalBox();
				ButtonGroup cgroup = new ButtonGroup();
				cgroup.add(r4 = new JRadioButton("��������"));
				cgroup.add(r4);
				
				hhbox.add(Box.createHorizontalStrut(30));
				cgroup.add(r5 = new JRadioButton("��ȯ����"));
				hhbox.add(r5);
				
				hhbox.add(Box.createHorizontalStrut(30));
				cgroup.add(r6 = new JRadioButton("�������"));
				hhbox.add(r6);
				
				hhbox.add(Box.createHorizontalStrut(30));
				hhbox.add(Box.createGlue());
				
				JPanel lpanel = new JPanel(new BorderLayout());
				lpanel.setBorder(new TitledBorder(new EtchedBorder(), "���� ����"));
				lpanel.add(hhbox);
				
				//�������� �г��߰�
				Box cbox = Box.createVerticalBox();
				cbox.add(panel);
				cbox.add(lpanel);
				txt1 = new JLabel("����ȸ�� ��µ�");
				txt1.setFont(new Font("����", Font.PLAIN, 16));
				cbox.add(txt1);
				
				txt2 = new JLabel("���� ��µ�");
				txt2.setFont(new Font("����", Font.PLAIN, 16));
				cbox.add(txt2);
				add(cbox);
				
				RBHandler rh = new RBHandler();
				r1.addItemListener(rh);
				r2.addItemListener(rh);
				r3.addItemListener(rh);
				r4.addItemListener(rh);
				r5.addItemListener(rh);
				r5.addItemListener(rh);
				
				
				
				}
			
				private class RBHandler implements ItemListener {
					
				@Override
				public void itemStateChanged(ItemEvent e) {
					if(e.getSource() == r1)
						if(e.getStateChange() == ItemEvent.SELECTED) //�ٲ� �̺�Ʈ�� ���õȰŶ��
							txt1.setText("���� : �츮��������");
					if(e.getSource() == r2)
						if(e.getStateChange() == ItemEvent.SELECTED)
							txt1.setText("���� : �Ｚ����");
					if(e.getSource() == r3)
						if(e.getStateChange() == ItemEvent.SELECTED)
							txt1.setText("���� : �������");
					if(e.getSource() == r4)
						if(e.getStateChange() == ItemEvent.SELECTED)
							txt2.setText("���� : ��������");
					if(e.getSource() == r5)
						if(e.getStateChange() == ItemEvent.SELECTED)
							txt2.setText("���� : ��ȯ����");
					if(e.getSource() == r6)
						if(e.getStateChange() == ItemEvent.SELECTED)
							txt2.setText("���� : �������");
					
						
					
				}
			
				}
				
			public static void main(String[] args) {
				ItemEventTest it = new ItemEventTest();
				it.setDefaultCloseOperation(EXIT_ON_CLOSE);
				it.setSize(400,200);
				it.setVisible(true);
				
			}
			}	

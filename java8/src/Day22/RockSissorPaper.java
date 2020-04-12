package Day22;

import java.awt.Container;

import java.awt.List;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import javax.swing.JButton;

import javax.swing.JFrame;

public class RockSissorPaper extends JFrame implements ActionListener {
	// �ʵ�

	static String user = "";
	static String com = "";
	static int number = 0;
	static List list;
	JButton rock, sissor, paper, start, end;


	public static void main(String[] args) {

		// ����
		
		Computer();
		
		RockSissorPaper rsp = new RockSissorPaper();
		
		rsp.setSize(400, 400);
		
		rsp.setVisible(true);

	}


	public RockSissorPaper() {
		//����
		super("���� ���� �� ����");

		start();
	}

	public void start() {

		Container ct = getContentPane();

		ct.setLayout(null); // ���̾ƿ� �Ŵ��� ����

		// ��ư�߰�

		sissor = new JButton("����");

		rock = new JButton("����");

		paper = new JButton("��");

		start = new JButton("����");

		end = new JButton("����");

		list = new List();

		sissor.setBounds(60, 200, 70, 30);

		rock.setBounds(160, 200, 70, 30);

		paper.setBounds(260, 200, 70, 30);

		start.setBounds(160, 250, 70, 30);

		list.setBounds(17, 20, 350, 150);

		end.setBounds(160, 290, 70, 30);

		ct.add(sissor);

		ct.add(rock);

		ct.add(paper);

		ct.add(end);

		ct.add(start);

		ct.add(list);

		rock.addActionListener(this);

		sissor.addActionListener(this);

		paper.addActionListener(this);

		start.addActionListener(this);

		end.addActionListener(this);

		list.addActionListener(this);

	}

	@Override

	public void actionPerformed(ActionEvent e) { // ActionListener

		if (e.getSource() == rock) {

			list.add("������ �½��ϴ�.");

			Vs(com, "����");

		} else if (e.getSource() == sissor) {

			list.add("������ �½��ϴ�.");

			Vs(com, "����");

		} else if (e.getSource() == paper) {

			list.add("���� �½��ϴ�.");

			Vs(com, "��");

		} else if (e.getSource() == start) {

			list.removeAll();

			Computer();

		} else if (e.getSource() == end) {

			System.exit(0);

		}

	}

	static void Computer() {

		number = (int) (Math.random() * 3);

		switch (number) {

		case 0:
			com = "����";

			break;

		case 1:
			com = "����";

			break;

		case 2:
			com = "��";

			break;

		}

	}

	void Vs(String com, String user) {

		if (com.equals("����")) {

			if (user.equals("����")) {

				list.add("��ǻ�ʹ� ������ �½��ϴ�.");

				list.add("�����ϴ�.");

			} else if (user.equals("��")) {

				list.add("��ǻ�ʹ� ������ �½��ϴ�.");

				list.add("������ �¸��Դϴ�.");

			} else {

				list.add("��ǻ�ʹ� ������ �½��ϴ�.");

				list.add("��ǻ���� �¸��Դϴ�.");

			}

		}

		if (com.equals("����")) {

			if (user.equals("����")) {

				list.add("��ǻ�ʹ� ������ �½��ϴ�.");

				list.add("�����ϴ�.");

			} else if (user.equals("����")) {

				list.add("��ǻ�ʹ� ������ �½��ϴ�.");

				list.add("������ �¸��Դϴ�.");

			} else {

				list.add("��ǻ�ʹ� ������ �½��ϴ�.");

				list.add("��ǻ���� �¸��Դϴ�.");

			}

		}

		if (com.equals("��")) {

			if (user.equals("��")) {

				list.add("��ǻ�ʹ� ���� �½��ϴ�.");

				list.add("�����ϴ�.");

			} else if (user.equals("����")) {

				list.add("��ǻ�ʹ� ���� �½��ϴ�.");

				list.add("������ �¸��Դϴ�.");

			} else {

				list.add("��ǻ�ʹ� ���� �½��ϴ�.");

				list.add("��ǻ���� �¸��Դϴ�.");

			}

		}

		Computer();

	}

}

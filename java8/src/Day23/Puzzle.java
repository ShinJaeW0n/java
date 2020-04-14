package Day23;

import java.awt.Color;
import java.awt.Point;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

//����-�����������
public class Puzzle extends JPanel {
	JLabel[] labels;
	Point[] points;
	Block[] blocks;
	int x;

	public static void main(String[] args) {
		JFrame f = new JFrame("�����������");
		Puzzle p = new Puzzle(); // ������
		p.setLayout(null); // null���� ��ġ�� ��Ƽ� �����Ѵ�.
		p.makeGame(); // ���� ȣ��

		// Ű����� �ؾ��ؼ� Ű
		f.addKeyListener(p.getKeyListener());
		f.add(p);
		f.setSize(266, 400);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		p.shuffleGame();

	}

	void makeGame() {
		labels = new JLabel[25]; // �ʱ�ȭ
		points = new Point[25];
		blocks = new Block[25];

		for (int i = 0; i < blocks.length; i++) {
			// 1���� �����ϰ� �Ϸ���, String�̱� ������ ""�� �־���.
			labels[i] = new JLabel(i + 1 + "", JLabel.CENTER);
			labels[i].setSize(50, 50);
			labels[i].setBorder(BorderFactory.createLineBorder(Color.GREEN));// �ܰ��� �׷��ִ°�.
			// x��ǥ�� y��ǥ��
			points[i] = new Point(i % 5 * 50, i / 5 * 50);
			labels[i].setLocation(points[i]);
			blocks[i] = new Block(labels[i], points[i]); // ��ġ�� ������� ������Ű�� ���ؼ� ����Ʈ���� �־���.
			this.add(labels[i]);
		}

		this.remove(labels[blocks.length - 1]); // 25�� ���ڸ��� �ȴ�. ���ڸ��� �̵����Ѿ��Ѵ�.
		x = blocks.length; // 25�� ����.

	}

	KeyListener getKeyListener() {
		KeyListener listener = new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub

			}

			// Ű �̺�Ʈ���� ������ �� �޶� ������ �ڵ带 4�� ����Ѵ�.
			@Override
			public void keyPressed(KeyEvent e) { // ����Ű�� ������ x�� ������ ������ �ƴϸ� �����ؾ��Ѵ�.
				if (e.getKeyCode() == KeyEvent.VK_LEFT && x % 5 != 0) // ���� <- Ű�� �����ٸ�.
				{
					x++; // �̶� x�� ������ �����̴�.
					moveGame(x, e.getKeyCode());
				} else if (e.getKeyCode() == KeyEvent.VK_RIGHT && x % 5 != 1) {
					x--; // 24���� ������ ��ư�� ������ ������ 24�� �Ǵϱ�.
					moveGame(x, e.getKeyCode());
				} else if (e.getKeyCode() == KeyEvent.VK_UP && x <= 20) { // 21~25�� 5�� �����ϸ� �ȵǴϱ�.
					x += 5;
					moveGame(x, e.getKeyCode());
				} else if (e.getKeyCode() == KeyEvent.VK_DOWN && x >= 6) { // 1~5�� 5�� �����ϸ� �ȵǴϱ�.
					x -= 5;
					moveGame(x, e.getKeyCode());
				}

//					System.out.println(x);
					matchGame(); //Ű ������ �� ���� ����.
			}
		};
		return listener;
	}

	
	
	void moveGame(int x, int keyCode) {
		JLabel label;
		switch (keyCode) {
		case KeyEvent.VK_LEFT:
			label = blocks[x - 1].getLable();
//			blocks[x - 1].setLable(null);
			blocks[x - 2].setLable(label);
			label.setLocation(blocks[x - 2].getPoint());
			break;
		case KeyEvent.VK_RIGHT:
			label = blocks[x - 1].getLable();
//			blocks[x - 1].setLable(null);
			blocks[x].setLable(label);
			label.setLocation(blocks[x].getPoint());
			break;
		case KeyEvent.VK_UP:
			label = blocks[x - 1].getLable();
//			blocks[x - 1].setLable(null);
			blocks[x - 6].setLable(label);
			label.setLocation(blocks[x - 6].getPoint());
			break;
		case KeyEvent.VK_DOWN:
			label = blocks[x - 1].getLable();
//			blocks[x - 1].setLable(null);
			blocks[x + 4].setLable(label);
			label.setLocation(blocks[x + 4].getPoint());
			break;

		}
	}

	void shuffleGame() {
		for (int i = 0; i < 100; i++) {
			int random = (int) (Math.random() * 4); // �Ҷ����� ���� �ֱ����ؼ� �����ȿ� ����.
			switch (random) {
			case 0:
				if (x % 5 != 0) {
					x++;
					moveGame(x, KeyEvent.VK_LEFT);
				}
				break;
			case 1:
				if (x % 5 != 1) {
					x--;
					moveGame(x, KeyEvent.VK_RIGHT);
				}
				break;
			case 2:
				if (x <= 20) {
					x += 5;
					moveGame(x, KeyEvent.VK_UP);
				}
				break;
			case 3:
				if (x >= 6) {
					x -= 5;
					moveGame(x, KeyEvent.VK_DOWN);
				}
				break;
			}

			try {
				// 0.1�� ���� �ش�.
				Thread.sleep(10);
			} catch (InterruptedException e) {

			}
		}

	}

	void matchGame() {
		int cnt = 0;
		for (int i = 0; i < blocks.length; i++) {
			if (blocks[i].getLable().getText().equals(i + 1 + "")) {
				
			} else {
				break;
			}
				//�� 24���ϱ� 0���� 23������ ����
			if(i == 23) {
				JOptionPane.showMessageDialog(this, "�����Դϴ�.");
			}
		}
	}

	class Block {
		private JLabel lable;
		private Point point;

		// ��Ŭ�� �ҽ� - �ʵ����
		public Block(JLabel lable, Point point) {
			super();
			this.lable = lable;
			this.point = point;
		}

		public JLabel getLable() {
			return lable;
		}

		public void setLable(JLabel lable) {
			this.lable = lable;
		}

		public Point getPoint() {
			return point;
		}

		public void setPoint(Point point) {
			this.point = point;
		}

	}

}

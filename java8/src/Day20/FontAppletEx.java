package Day20;

import javax.swing.JFrame;

				//���ø� ���� -2 ����
public class FontAppletEx {

	public static void main(String[] args) {
		JFrame f = new JFrame("��Ʈ ���� ����"); //Frame = Ʋ.
		FontApplet p = new FontApplet();
		p.init();; //�ʱ�ȭ�ϱ� ���ؼ�.
	
		f.setSize(600, 500);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // <- ������ â xǥ��.
		f.add(p);
		f.setResizable(false); //����� ������ �� ����.
		f.setVisible(true); //Ʈ�縦 �ؾ� ����ȴ�.
	}
	
}

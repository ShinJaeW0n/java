package Day20;

import javax.swing.JFrame;
		
				//���ø� -2
public class ParamJAppletEx {

		public static void main(String[] args) {
			
			JFrame f = new JFrame("���ø� ù ����"); //Frame = Ʋ.
			ParamJApplet p = new ParamJApplet();
			p.init("�ڹ��ڹ�");; //�ʱ�ȭ�ϱ� ���ؼ�.
		
			f.setSize(500, 500);
//			f.setTitle("���ø� ù ����");
			f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // <- ������ â xǥ��.
			f.add(p);
			f.setVisible(true); //Ʈ�縦 �ؾ� ����ȴ�.
			
			
		}
}

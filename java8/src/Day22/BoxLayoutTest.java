package Day22;

import java.awt.BorderLayout;

import javax.swing.Box;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
	//�ڽ� ���̾ƿ� -1 ,����, ����

public class BoxLayoutTest extends JFrame {
		public BoxLayoutTest() {
			super("�ڽ� ���̾ƿ�");
			
			Box hBox = Box.createHorizontalBox();	//�������� �迭�ϴ� �ڽ�
			hBox.add(Box.createHorizontalStrut(30));	//����ũ�� ������Ʈ
			hBox.add(new JCheckBox("�츮��������"));	//üũ�ڽ�
			hBox.add(Box.createHorizontalStrut(30));
			hBox.add(new JCheckBox("�Ｚ����"));
			hBox.add(Box.createHorizontalStrut(30));
			hBox.add(Box.createGlue());	//ũ�� ��ȯ�ϴ� ������Ʈ,�ڽ����� �� ������ ������Ʈ�� ������, �� �� ������ 30�� ����ڴ�.
			JPanel lpanel = new JPanel(new BorderLayout()); //���� ���̾ƿ��� ����ϴ� �г�
			lpanel.setBorder(new TitledBorder(new EtchedBorder(), "����ȸ�� ����")); //�ܰ��� ����
			lpanel.add(hBox, BorderLayout.CENTER); //�гο� �ڽ� ����
			
			//�������� ������Ʈ �߰�
			Box hhBox = Box.createHorizontalBox();
			hhBox.add(Box.createHorizontalStrut(30));
			hhBox.add(new JCheckBox("��������"));
			hhBox.add(Box.createHorizontalStrut(30));
			hhBox.add(new JCheckBox("��ȯ����"));
			hhBox.add(Box.createHorizontalStrut(30));
			hhBox.add(Box.createGlue());
			JPanel llpanel = new JPanel(new BorderLayout());
			llpanel.setBorder(new TitledBorder(new EtchedBorder(), "���౸��"));
			llpanel.add(hhBox, BorderLayout.CENTER);
			
			//�������� �г� �߰�
			Box cBox = Box.createVerticalBox(); //�����ڽ�
			cBox.add(lpanel); //�г��߰�
			cBox.add(llpanel);//�г��߰�
			add(cBox, BorderLayout.CENTER); //�����ӿ� �߰� ,�׳� add�� �ڱ��ڽ�(this), **JFrame�� �����ϴ� ����.!!
			
		
		}
	
		
		public static void main(String[] args) {
			BoxLayoutTest bx = new BoxLayoutTest();
			bx.setSize(400, 200);
			bx.setDefaultCloseOperation(EXIT_ON_CLOSE);
			bx.setVisible(true);
		}
	
}

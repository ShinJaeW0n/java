package Day21;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

		//스윙 예제 -2 게시판 작성.
	public class JLabelTextEx {
		public static void main(String[] args) {
		JFrame f = new JFrame();
		JLabelText p = new JLabelText();
		p.init();
		f.add(p);
		f.setSize(280, 230);
		f.setResizable(true);
		f.setTitle("라벨 텍스트 예제");
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
	}

	class JLabelText extends JPanel{
		JTextField tf;
		JTextArea ta;
		JPasswordField pf;
			
		public void init() {
			setLayout(new FlowLayout());
			JLabel lb1 = new JLabel("이름");
			JLabel lb2 = new JLabel("주소");
			JLabel lb3 = new JLabel("비밀");
			
			tf = new JTextField(20);
			ta = new JTextArea(7,20); //7줄 20칸 
			pf = new JPasswordField(20);
			
			add(lb1);
			add(tf);
			add(lb2);
			add(ta);
			add(lb3);
			add(pf);
			
			
		
		}
		
		
	}
package Day23;

import java.io.File;
	//��Ʈ�� ����-6
public class FileDirOutPut {

		static String dir;
		public static void main(String[] args) {
//			if(args.length != 1) {
//				System.out.println("main() �Ű������� �Է��ϼ���");
//				System.exit(1);
//			}
			
			dir="c:/java";	//��δ� /�� ����(������), \�� ����(��������)
							//�����쵵 /�� ���а����մϴ�.
							//�����쿡�� \�� Ư������ �Է��̹Ƿ� \\ó�� 2���� �Է��ؾ� �ϳ��� �ν��մϴ�.
			File myFile = new File(dir);
			String[] flist = myFile.list(); //�迭�� ����Ʈ��.
			System.out.println("�˻� ���丮 : " + dir);
			System.out.println("-------------------");
			for(int i=0; i<flist.length; i++) {
				File cfile = new File(dir+ "/" + flist[i]);
				if(cfile.isDirectory()) {
					System.out.println("���丮: " + flist[i]); //���丮��� �̰ɷ� ���
					}else {
						System.out.println("����: " + flist[i]);//�ƴϸ� ���Ϸ� ���
					}
			}
		}
}

package Day24;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

		//jdbc ���� -1
public class JdbcConprog {
		public static void main(String[] args) { //3306��Ʈ�� �����ϰڴ�.  //�����ڵ带���Ŵ�.
			String jdbc_url = "jdbc:mysql://localhost:3306/my_database?useUnicode=true"
					//���� utf8�� ���ڴ�.					//�ð���� �ѱ�����
				+ "&characterEncoding=UTF8&serverTimezone=Asia/Seoul";
			Connection con = null;
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				con = DriverManager.getConnection(jdbc_url, "root", "yt1234");
				System.out.println("�����ͺ��̽��� �����߽��ϴ�!");
				con.close();
			} catch (ClassNotFoundException e) {
				System.out.println("ClassNotFoundException: " + e.getMessage());
			} catch (SQLException se) {
				System.out.println(se.getMessage());
			}
			
		}
}

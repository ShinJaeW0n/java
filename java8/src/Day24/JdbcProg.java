package Day24;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

			//jdbc db�������� ����-2

				//���α׷���
public class JdbcProg {
	public static void main(String[] args) { //3306��Ʈ�� �����ϰڴ�.  //�����ڵ带���Ŵ�.
		String jdbc_url = "jdbc:mysql://localhost:3306/comeng?useUnicode=true"
				//���� utf8�� ���ڴ�.					//�ð���� �ѱ�����
			+ "&characterEncoding=UTF8&serverTimezone=Asia/Seoul";
		
		
		String sql = "SELECT * FROM student";
		try( //try�� �Ű������� �־��ָ� �ڵ����� ����Ŭ�����. close �����൵��.
			Connection con = DriverManager.getConnection(jdbc_url, "root", "yt1234");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			){
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("�����ͺ��̽��� �����߽��ϴ�!");
			System.out.println("<<�л����>>");
			System.out.println("[�й�]\t\t[�̸�]");
			while(rs.next()) {
				int stuNo = rs.getInt("stuNo");
				String name = rs.getString("name");
				System.out.println(stuNo + "\t" + name);
			}
		} catch (ClassNotFoundException e) {
			System.out.println("ClassNotFoundException: " + e.getMessage());
		} catch (SQLException se) {
			System.out.println(se.getMessage());
		}
	}

}
	


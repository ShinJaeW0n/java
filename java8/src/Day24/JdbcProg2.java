package Day24;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.x.protobuf.MysqlxPrepare.Prepare;

			//jdbc db�������� ����-3

				//���α׷���
public class JdbcProg2 {
	public static void main(String[] args) { //3306��Ʈ�� �����ϰڴ�.  //�����ڵ带���Ŵ�.
		String jdbc_url = "jdbc:mysql://localhost:3306/comeng?useUnicode=true"
				//���� utf8�� ���ڴ�.					//�ð���� �ѱ�����
			+ "&characterEncoding=UTF8&serverTimezone=Asia/Seoul";
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try	{
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("�����ͺ��̽��� �����߽��ϴ�!");
			System.out.println("<<�л����>>");
			System.out.println("[�й�]\t\t[�̸�]");
													//sex�� address �����͸� �ҷ��´�.
			String sql = "SELECT * FROM student Where sex=? && address=?";
			con = DriverManager.getConnection(jdbc_url, "root", "yt1234");
			pstmt = con.prepareStatement(sql);
				//sex�� address�� ���ڿ��̴� string�� �ҷ��´�.
			pstmt.setString(1, "M"); //jdbc�� �ڹٰ� 0���� �����ϴ°Ͱ� �ٸ��� 1���� ����. "F"������ ���ڸ�, "M"������ ���ڸ� ����.
			pstmt.setString(2, "Seoul");
			rs = pstmt.executeQuery();
			while(rs.next()) {
				int stuNo = rs.getInt("stuNo");
				String name = rs.getString("name");
				System.out.println(stuNo + "\t" + name);
			}
		} catch (ClassNotFoundException e) {
			System.out.println("ClassNotFoundException: " + e.getMessage());
		} catch (SQLException se) {
			System.out.println(se.getMessage());
		} finally {
				try {
					if(rs != null) rs.close();
					if(pstmt != null) pstmt.close();
					if(con != null) con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}
	}

}
	


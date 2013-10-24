package cn.ilongfei.h2.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestConn {
	public static void main(String[] a) throws Exception {
		// String url = "jdbc:h2:~/test";
		String url = "jdbc:h2:tcp://localhost/~/.h2/simpleWeb";
		//String url = "jdbc:h2:~/.h2/simpleWeb";	//ÄÚÇ¶·þÎñok
		Class.forName("org.h2.Driver");
		Connection conn = DriverManager.getConnection(url, "sa", "");
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT * FROM  tbl_recipe ");
		while (rs.next()) {
			System.out.println(rs.getInt("ID") + "," + rs.getString("description"));
		}

		conn.close();
	}
}

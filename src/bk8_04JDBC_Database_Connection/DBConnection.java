package bk8_04JDBC_Database_Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

	public static void main(String[] args) {

		Connection connection = getConnection();
		System.out.println(connection.toString());
	}

	private static Connection getConnection() {
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost/Moovies";
			String user = "rsy1";
			String pw = "landcruiser@2020";
			con = DriverManager.getConnection(url, user, pw);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.exit(0);
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.exit(0);
		}
		return con;
	}
}
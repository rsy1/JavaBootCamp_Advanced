package bk8_04JDBC_Database_Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateSQLData {

	public static void main(String[] args) {

	}

	private static void loanMovie(int id, String lastName, String firstName) {
		Connection con = getConnection();
		try {
			Statement stmt = con.createStatement();
			String insert = "insert into friend " + "(lastname, firstname, movieid) " + "values (" + "\"" + lastName
					+ "\", \"" + firstName + "\", " + +id + ")";
			int i = stmt.executeUpdate(insert);
			if (i == 1)
				System.out.println("Loan recorded.");
			else
				System.out.println("Loan not recorded.");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			System.exit(0);
		}
	}
	
	private static Connection getConnection() {
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost/Movies";
			String user = "rsy1";
			String pw = "landcruiser@2020";
			con = DriverManager.getConnection(url, user, pw);
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
			System.exit(0);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			System.exit(0);
		}
		return con;
	}
}

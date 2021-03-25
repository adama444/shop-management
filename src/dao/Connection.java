package dao;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Connection {
	private static java.sql.Connection connection = null;
	private static String driverName = "org.mariadb.jdbc.Driver";
	private static String databaseName = "shopManagement";
	private static String username = "student";
	private static String password = "student";
	private static String host = "localhost";
	private static String url = "jdbc:mariadb://" + host + "/" + databaseName;
	
	public static java.sql.Connection getConnection() {
		try {
			Class.forName(driverName);
			connection = DriverManager.getConnection(url, username, password);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connection;
	}
	
	public static void closeConnection() {
		try {
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

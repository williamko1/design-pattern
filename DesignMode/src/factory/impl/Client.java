package factory.impl;

import java.sql.Connection;

public class Client {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.MySqlConnectionFactory");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Connection conn = ConnectionFactoryManager.getConnection("jdbc:mysql", "root", "");
	}
}

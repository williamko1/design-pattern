package factory.impl;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

public class ConnectionFactoryManager {
	
	private static List<ConnectionFactory> factories = new ArrayList<ConnectionFactory>();
	
	public static Connection getConnection(String url, String username, String password) {
		
		for(ConnectionFactory factory: factories) {
			Connection conn = factory.create(url, username, password);
			if (conn != null) {
				return conn;
			}
		}
		throw new RuntimeException("can't create connection");
	}
	
	public static void register(ConnectionFactory factory) {
		factories.add(factory);
	}
	
}

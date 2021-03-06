package factory.impl;

import java.sql.Connection;

public class MySqlConnectionFactory implements ConnectionFactory {
	static {
		ConnectionFactoryManager.register(new MySqlConnectionFactory());
	}

	@Override
	public boolean acceptURL(String url) {
		return url.startsWith("jdbc:mysql");
	}

	@Override
	public Connection create(String url, String username, String password) {
		if(acceptURL(url)) {
			//����
		}
		return null;
	}

}

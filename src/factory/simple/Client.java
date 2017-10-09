package factory.simple;

import java.sql.Connection;
import java.util.Properties;

public class Client {
	public static void main(String[] args) {
		Class<?> clz;
		try {
			clz = Class.forName("com.mysql.jdbc.MySqlConnectionFactory");
			ConnectionFactory factory = (ConnectionFactory)clz.newInstance();
			Properties info = new Properties();
			info.setProperty("host", "3306");
			Connection conn = factory.create(info);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

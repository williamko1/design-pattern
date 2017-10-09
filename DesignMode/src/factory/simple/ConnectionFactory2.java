package factory.simple;

import java.lang.reflect.Constructor;
import java.sql.Connection;
import java.util.Properties;

public class ConnectionFactory2 {
	public Connection create (String type, Properties info) {
		Class<?> clz = getConnectionClass(type);
		try {
			Constructor<?> c = clz.getConstructor(Properties.class);
			return (Connection)c.newInstance(info);
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("unsupported db type = "  + type);
		}
		
	}
	public Class getConnectionClass(String type) {
		//
		return null;
	}
}

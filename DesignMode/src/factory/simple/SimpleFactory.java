package factory.simple;

import java.sql.Connection;
import java.util.Properties;

public class SimpleFactory {
	public static Connection create(String type, Properties info) {
		if("mysql".equals(type)) {
			return null;//new MySqlConnection(info)
		}
		if("oracle".equals(type)) {
			return null;//new OracleConnection(info)
		}
		if("db2".equals(type)) {
			return null;//new Db2Connection(info);
		}
		throw new RuntimeException("unsupported db type = " + type );
	}
}

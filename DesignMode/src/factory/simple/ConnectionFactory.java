package factory.simple;

import java.sql.Connection;
import java.util.Properties;

public interface ConnectionFactory {
	public Connection create(Properties info);
}

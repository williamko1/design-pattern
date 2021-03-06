package factory.impl;

import java.sql.Connection;

/**
 * 创建工厂让各个厂商去做，而不是留给约束者做
 * @author RedKnife
 *
 */
public interface ConnectionFactory {
	public Connection create(String url, String username, String password);
	public boolean acceptURL(String url);
}

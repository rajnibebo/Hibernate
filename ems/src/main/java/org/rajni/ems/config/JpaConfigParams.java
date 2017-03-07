/**
 * 
 */
package org.rajni.ems.config;

/**
 * @author rajni.ubhi
 *
 */
public interface JpaConfigParams {
	public static final String JDBC_DRIVER_CLASS = "jdbc.driverClassName";
	public static final String JDBC_DRIVER_URL = "jdbc.url";
	public static final String JDBC_DB_USER = "jdbc.username";
	public static final String JDBC_DB_PASSWORD = "jdbc.password";
	public static final String JDBC_DB_DIALECT = "hibernate.dialect";
	public static final String JDBC_DB_SHOW_SQL = "hibernate.show_sql";
	public static final String JDBC_DB_HBM2DDL = "hibernate.hbm2ddl.auto";
}

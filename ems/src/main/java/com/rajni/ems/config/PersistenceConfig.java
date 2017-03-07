/**
 * 
 */
package com.rajni.ems.config;

import java.util.Properties;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.rajni.ems.config.JpaConfigParams;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaDialect;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author rajni.ubhi
 *
 */
@Configuration
@EnableJpaRepositories(basePackages="org.rajni.ems.repository")
@EnableTransactionManagement
@PropertySource("classpath:/jdbc/jdbc.properties")
public class PersistenceConfig {
	@Autowired
	private Environment environment;
	
	@Bean
	public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
		LocalContainerEntityManagerFactoryBean bean = new LocalContainerEntityManagerFactoryBean();
		bean.setDataSource(dataSource());
		bean.setJpaDialect(new HibernateJpaDialect());
		bean.setJpaProperties(jpaProperties());
		bean.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
		bean.setPackagesToScan("com.rajni.ems.entities");
		return bean;
	}
	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName(environment.getProperty(JpaConfigParams.JDBC_DRIVER_CLASS));
		dataSource.setUrl(environment.getProperty(JpaConfigParams.JDBC_DRIVER_URL));
		dataSource.setUsername(environment.getProperty(JpaConfigParams.JDBC_DB_USER));
		dataSource.setPassword(environment.getProperty(JpaConfigParams.JDBC_DB_PASSWORD));
		return dataSource;
	}
	private Properties jpaProperties() {
		Properties properties = new Properties();
		properties.setProperty(JpaConfigParams.JDBC_DB_DIALECT, environment.getProperty(JpaConfigParams.JDBC_DB_DIALECT));
		properties.setProperty(JpaConfigParams.JDBC_DB_HBM2DDL, environment.getProperty(JpaConfigParams.JDBC_DB_HBM2DDL));
		properties.setProperty(JpaConfigParams.JDBC_DB_SHOW_SQL, environment.getProperty(JpaConfigParams.JDBC_DB_SHOW_SQL));
		return properties;
	}
	@Bean
	public PlatformTransactionManager transactionManager(EntityManagerFactory emf) {
		JpaTransactionManager transactionManager = new JpaTransactionManager();
		transactionManager.setEntityManagerFactory(emf);
		return transactionManager;
	}
	
}

/**
 * 
 */
package com.rajni.hibernate_customtypes.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.service.ServiceRegistry;

/**
 * @author rajni.ubhi
 *
 * @date 14-Jan-2017 1:57:23 pm
 * 
 * Works only in Singlethreaded Environment
 */
public class HibernateUtil {
	private static SessionFactory sessionFactory = null;
	private static Session session = null;

	private static SessionFactory buildSessionFactory() {
		if (sessionFactory == null) {
			ServiceRegistry registry = new StandardServiceRegistryBuilder()
					.configure("hibernate.cfg.xml").build();
			Metadata metadata = new MetadataSources(registry)
					.getMetadataBuilder().build();
			sessionFactory = metadata.getSessionFactoryBuilder().build();
		}
		return sessionFactory;
	}

	public static Session getSession() {
		if(session == null) {
			if(sessionFactory == null) {
				sessionFactory = buildSessionFactory();
			}	
			if(sessionFactory != null) {
				session = sessionFactory.openSession();
			}
		}
		return session;
	}

	public static void closeResources() {
		if (session != null) {
			session.close();
		}
		if (sessionFactory != null) {
			sessionFactory.close();
		}
	}
}

package com.heg.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

	private static final SessionFactory sessionFactory;

	static {

		try {
			sessionFactory = new Configuration().configure("com/heg/cfgs/hibernate.cfg.xml").buildSessionFactory();
		} catch (Throwable ex) {
			System.err.println("SessionFactory initialization failed: " + ex);
			throw new ExceptionInInitializerError(ex);
		}

	}

	public static Session getSession() {
		return sessionFactory.openSession();
	}

	public static void shutDownSession() {
		if (sessionFactory != null) {
			sessionFactory.close();
		}
	}

}

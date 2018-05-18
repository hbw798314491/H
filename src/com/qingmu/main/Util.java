package com.qingmu.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Util {

	public static Configuration cfg;
	public static SessionFactory sessionFactory;
	
	static {
		cfg = new Configuration().configure();
		sessionFactory = cfg.buildSessionFactory();
		
	}
	
	public static Session openSession() {
		
		return sessionFactory.openSession();
		
	}
	
	public static Transaction beginTransaction(Session session) {
		return session.beginTransaction();
	}
	
}

package com.i2i.khelo.service;

import org.hibernate.SessionFactory;

public class SessionHandler {
	
	static SessionFactory sessionFactory = null;

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public static void setSessionFactory(SessionFactory sessionFactory) {
		SessionHandler.sessionFactory = sessionFactory;
	}
}

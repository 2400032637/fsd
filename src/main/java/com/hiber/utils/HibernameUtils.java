package com.hiber.utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernameUtils {
	
	private static SessionFactory  sf = null;
	static {
		
		try {
			sf = new Configuration().configure().buildSessionFactory();
		} catch (Throwable e) {
			// TODO: handle exception
			System.err.println(e);
			throw new ExceptionInInitializerError();
		}
	}
	
	public static SessionFactory getSessionFactory() {
		return sf;
	}
	public void shutdown() {
		if(sf != null)
			sf.close();
	}
}
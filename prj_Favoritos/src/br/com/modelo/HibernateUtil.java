package br.com.modelo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class HibernateUtil {

	private static SessionFactory factory;
	
	private HibernateUtil() {
		
		//Classe que pega as configurações do arquivo hibernate.cfg.xml e instancia o objeto sessionFactoriy
		AnnotationConfiguration cfg = new AnnotationConfiguration();
		cfg.configure("hibernate.cfg.xml"); // Pega as configurações
		
		factory = cfg.buildSessionFactory();
	}
	
	public static Session getSession() {
		if(factory == null) {
			HibernateUtil util = new HibernateUtil();
		}
		return factory.openSession();
	}
}

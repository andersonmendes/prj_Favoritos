package br.com.controle;

import java.util.List;

import org.hibernate.Session;

import br.com.modelo.HibernateUtil;
import br.com.modelo.Url;

public class UrlDAO {
	private Session session;
	
	public UrlDAO() {
		session = HibernateUtil.getSession();
	}
	
	public void inserirUrl(Url url) {	
		 session.beginTransaction();
		 session.save(url);
		 session.getTransaction().commit();
	}
	
	@SuppressWarnings("unchecked")
	public List<Url> listarTodos() {
		return session.createCriteria(Url.class).list();
	}
	
	public Url listarUmaUrl(Integer codigo) {
		return (Url)session.get(Url.class, codigo);
	}
	
	public void atualizarUrl(Url url) {
		session.beginTransaction();
		session.update(url);
		session.getTransaction().commit();
	}
	
	public void removerUrl(Url url) {
		session.beginTransaction();
		session.delete(url);
		session.getTransaction().commit();
	}
	
	
}

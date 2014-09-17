package br.com.controle;

import java.util.List;

import org.hibernate.Session;

import br.com.modelo.HibernateUtil;
import br.com.modelo.Tag;

public class TagDAO {

		private Session session;
		
		public TagDAO() {
			session = HibernateUtil.getSession();
		}
		
		public void inserirTag(Tag tag) {	
			 session.beginTransaction();
			 session.save(tag);
			 session.getTransaction().commit();
		}
		
		@SuppressWarnings("unchecked")
		public List<Tag> listarTodos() {
			return session.createCriteria(Tag.class).list();
		}
		
		public Tag listarUmaTag(Integer codigo) {
			return (Tag)session.get(Tag.class, codigo);
		}
		
		public void atualizarTag(Tag url) {
			session.beginTransaction();
			session.update(url);
			session.getTransaction().commit();
		}
		
		public void removerTag(Tag url) {
			session.beginTransaction();
			session.delete(url);
			session.getTransaction().commit();
		}
}

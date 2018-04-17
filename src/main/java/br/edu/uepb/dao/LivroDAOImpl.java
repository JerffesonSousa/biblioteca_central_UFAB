package br.edu.uepb.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import br.edu.uepb.model.Livro;

public class LivroDAOImpl implements DAO<Livro> {
	
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public Livro adiciona(Livro obj) {
		Session session = this.sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.persist(obj);
		tx.commit();
		session.close();
		return obj;
	}

	public Livro edita(Livro obj) {
		Session session = this.sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.update(obj);
		tx.commit();
		session.close();
		return obj;
	}

	public boolean deleta(int objId) {
		Session session = this.sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		Livro l = (Livro) session.load(Livro.class, new Integer(objId));
		if(l != null) {
			session.delete(l);
		}
		tx.commit();
		session.close();
		return true;
	}

	public Livro getObj(int objId) {
		Session session = this.sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		Livro l = (Livro) session.load(Livro.class, new Integer(objId));
		tx.commit();
		session.close();
		return l;
	}
	
	@SuppressWarnings("unchecked")
	public List<Livro> getAllObj() {
		Session session = this.sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		List<Livro> list = session.createQuery("From Livros").list();
		tx.commit();
		session.close();
		return list;
	}

}

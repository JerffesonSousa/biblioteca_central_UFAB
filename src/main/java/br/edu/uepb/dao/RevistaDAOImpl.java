package br.edu.uepb.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


import br.edu.uepb.model.Revista;

public class RevistaDAOImpl implements DAO<Revista> {
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public Revista adiciona(Revista obj) {
		Session session = this.sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.persist(obj);
		tx.commit();
		session.close();
		return obj;
	}

	public Revista edita(Revista obj) {
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
		Revista r = (Revista) session.load(Revista.class, new Integer(objId));
		if(r != null) {
			session.delete(r);
		}
		tx.commit();
		session.close();
		return true;
	}

	public Revista getObj(int objId) {
		Session session = this.sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		Revista r = (Revista) session.load(Revista.class, new Integer(objId));
		tx.commit();
		session.close();
		return r;
	}
	
	@SuppressWarnings("unchecked")
	public List<Revista> getAllObj() {
		Session session = this.sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		List<Revista> list = session.createQuery("From Revistas").list();
		tx.commit();
		session.close();
		return list;
	}

}

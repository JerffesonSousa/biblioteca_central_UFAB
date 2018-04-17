package br.edu.uepb.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import br.edu.uepb.model.Tcc;

public class TccDAOImpl implements DAO<Tcc> {
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public Tcc adiciona(Tcc obj) {
		Session session = this.sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.persist(obj);
		tx.commit();
		session.close();
		return obj;
	}

	public Tcc edita(Tcc obj) {
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
		Tcc t = (Tcc) session.load(Tcc.class, new Integer(objId));
		if(t != null) {
			session.delete(t);
		}
		tx.commit();
		session.close();
		return true;
	}

	public Tcc getObj(int objId) {
		Session session = this.sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		Tcc t = (Tcc) session.load(Tcc.class, new Integer(objId));
		tx.commit();
		session.close();
		return t;
	}
	
	@SuppressWarnings("unchecked")
	public List<Tcc> getAllObj() {
		Session session = this.sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		List<Tcc> list = session.createQuery("From Tcc").list();
		tx.commit();
		session.close();
		return list;
	}

}

package br.edu.uepb.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import br.edu.uepb.model.Jornal;

public class JornalDAOImpl implements DAO<Jornal> {
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public Jornal adiciona(Jornal obj) {
		Session session = this.sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.persist(obj);
		tx.commit();
		session.close();
		return obj;
	}

	public Jornal edita(Jornal obj) {
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
		Jornal j = (Jornal) session.load(Jornal.class, new Integer(objId));
		if(j != null) {
			session.delete(j);
		}
		tx.commit();
		session.close();
		return true;
	}

	public Jornal getObj(int objId) {
		Session session = this.sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		Jornal j = (Jornal) session.load(Jornal.class, new Integer(objId));
		tx.commit();
		session.close();
		return j;
	}
	
	@SuppressWarnings("unchecked")
	public List<Jornal> getAllObj() {
		Session session = this.sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		List<Jornal> list = session.createQuery("From Jornais").list();
		tx.commit();
		session.close();
		return list;
	}

}

package br.edu.uepb.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


import br.edu.uepb.model.MidiaEletronica;

public class MidiaEletronicaDAOImpl implements DAO<MidiaEletronica> {
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public MidiaEletronica adiciona(MidiaEletronica obj) {
		Session session = this.sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.persist(obj);
		tx.commit();
		session.close();
		return obj;
	}

	public MidiaEletronica edita(MidiaEletronica obj) {
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
		MidiaEletronica m = (MidiaEletronica) session.load(MidiaEletronica.class, new Integer(objId));
		if(m != null) {
			session.delete(m);
		}
		tx.commit();
		session.close();
		return true;
	}

	public MidiaEletronica getObj(int objId) {
		Session session = this.sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		MidiaEletronica m = (MidiaEletronica) session.load(MidiaEletronica.class, new Integer(objId));
		tx.commit();
		session.close();
		return m;
	}
	
	@SuppressWarnings("unchecked")
	public List<MidiaEletronica> getAllObj() {
		Session session = this.sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		List<MidiaEletronica> list = session.createQuery("From midiaseletronicas").list();
		tx.commit();
		session.close();
		return list;
	}

}

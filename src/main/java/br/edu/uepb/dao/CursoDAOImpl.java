package br.edu.uepb.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import br.edu.uepb.model.Curso;

public class CursoDAOImpl implements DAO<Curso> {
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public Curso adiciona(Curso obj) {
		Session session = this.sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.persist(obj);
		tx.commit();
		session.close();
		return obj;
	}

	public Curso edita(Curso obj) {
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
		Curso c = (Curso) session.load(Curso.class, new Integer(objId));
		if(c != null) {
			session.delete(c);
		}
		tx.commit();
		session.close();
		return true;
	}

	public Curso getObj(int objId) {
		Session session = this.sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		Curso c = (Curso) session.load(Curso.class, new Integer(objId));
		tx.commit();
		session.close();
		return c;
	}
	
	@SuppressWarnings("unchecked")
	public List<Curso> getAllObj() {
		Session session = this.sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		List<Curso> list = session.createQuery("From Curso").list();
		tx.commit();
		session.close();
		return list;
	}

}

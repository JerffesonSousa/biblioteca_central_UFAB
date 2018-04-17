package br.edu.uepb.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import br.edu.uepb.exceptions.DAOException;
import br.edu.uepb.model.Anais;

public class AnaisDAOImpl implements DAO<Anais> {
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public Anais adiciona(Anais obj) {
		if (obj != null) {
			Session session = this.sessionFactory.openSession();
			Transaction tx = session.beginTransaction();
			session.persist(obj);
			tx.commit();
			session.close();
			return obj;
		} else {
			throw new DAOException("Erro ao inserir");
		}
	}

	public Anais edita(Anais obj) {
		if (obj != null) {
			Session session = this.sessionFactory.openSession();
			Transaction tx = session.beginTransaction();
			session.update(obj);
			tx.commit();
			session.close();
			return obj;
		} else {
			throw new DAOException("Erro ao editar");
		}
	}

	public boolean deleta(int objId) {
		Session session = this.sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		Anais a = (Anais) session.load(Anais.class, new Integer(objId));
		if (a != null) {
			session.delete(a);
			tx.commit();
			session.close();
			return true;
		} else {
			return false;
		}

	}

	public Anais getObj(int objId) {
		Session session = this.sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		Anais a = (Anais) session.load(Anais.class, new Integer(objId));
		tx.commit();
		session.close();
		return a;
	}

	@SuppressWarnings("unchecked")
	public List<Anais> getAllObj() {
		Session session = this.sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		List<Anais> list = session.createQuery("From Anais").list();
		tx.commit();
		session.close();
		return list;
	}

}

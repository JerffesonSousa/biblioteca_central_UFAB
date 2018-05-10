package br.edu.uepb.dao;

import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import br.edu.uepb.model.Tcc;

@Repository
public class TccDAOImpl implements DAO<Tcc> {
	private static final Logger logger = LogManager.getLogger(TccDAOImpl.class);
	
	@Autowired
	private SessionFactory sessionFactory;

	public void adiciona(Tcc obj) {
		if(obj != null) {
			sessionFactory.getCurrentSession().save(obj);
			logger.info("Objeto salvo com sucesso!");
		}else {
			logger.error("Objeto nulo!");
		}
	}

	public void edita(Tcc obj) {
		if(obj != null) {
			sessionFactory.getCurrentSession().update(obj);
			logger.info("Objeto editado com sucesso!");
		}else {
			logger.error("Objeto nulo!");
		}
	}

	public void deleta(int objId) {
		Session session = sessionFactory.getCurrentSession();
		Tcc tcc = (Tcc) session.load(Tcc.class, new Integer(objId));
		if(null != tcc) {
			session.delete(tcc);
			logger.info("objeto deletado com sucesso!");
		}else {
			logger.info("objeto não encotrado!");
		}
	}

	public Tcc getObj(int objId) {
		Session session = sessionFactory.getCurrentSession();
		Tcc tcc = (Tcc) session.load(Tcc.class, new Integer(objId));
		if(null != tcc) {
			logger.info("objeto deletado com sucesso!");
			return tcc;
		}else {
			logger.info("objeto não encotrado!");
			return tcc;
		}
	}

	@SuppressWarnings("unchecked")
	public List<Tcc> getAllObj() {
		List<Tcc> tccList = sessionFactory.getCurrentSession().createQuery("from Tcc").list();
		return tccList;
	}

}

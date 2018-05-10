package br.edu.uepb.dao;

import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import br.edu.uepb.model.Revista;

@Repository
public class RevistaDAOImpl implements DAO<Revista> {
	private static final Logger logger = LogManager.getLogger(RevistaDAOImpl.class);
	
	@Autowired
	private SessionFactory sessionFactory;

	public void adiciona(Revista obj) {
		if(obj != null) {
			sessionFactory.getCurrentSession().save(obj);
			logger.info("Objeto salvo com sucesso!");
		}else {
			logger.info("Objeto nulo!");
		}
	}

	public void edita(Revista obj) {
		if(obj != null) {
			sessionFactory.getCurrentSession().update(obj);
			logger.info("Objeto salvo com sucesso!");
		}else {
			logger.info("Objeto nulo!");
		}
	}

	public void deleta(int objId) {
		Session session = sessionFactory.getCurrentSession();
		Revista r = (Revista) session.load(Revista.class, new Integer(objId));
		if(null != r) {
			session.delete(r);
			logger.info("objeto deletado com sucesso!");
		}else {
			logger.info("objeto não encotrado!");
		}
	}

	public Revista getObj(int objId) {
		Session session = sessionFactory.getCurrentSession();
		Revista r = (Revista) session.load(Revista.class, new Integer(objId));
		if(null != r) {
			logger.info("objeto encontrado com sucesso!");
			return r;
		}else {
			logger.info("objeto não encotrado!");
			return r;
		}
	}

	@SuppressWarnings("unchecked")
	public List<Revista> getAllObj() {
		List<Revista> revistaList = sessionFactory.getCurrentSession().createQuery("from Revista").list();
		logger.info("Revistas encontradas");
		return revistaList;
	}

}

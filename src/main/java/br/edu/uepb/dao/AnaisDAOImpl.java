package br.edu.uepb.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.edu.uepb.model.Anais;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

@Repository
public class AnaisDAOImpl implements DAO<Anais> {

	private static final Logger logger = LogManager.getLogger(AnaisDAOImpl.class);

	@Autowired
	private SessionFactory sessionFactory;

	public void adiciona(Anais obj) {
		if (obj != null) {
			sessionFactory.getCurrentSession().save(obj);
			logger.info("objeto salvo com sucesso!");
		} else {
			logger.error("Objeto nulo");
		}
	}

	public void edita(Anais obj) {
		if (obj != null) {
			sessionFactory.getCurrentSession().update(obj);
			logger.info("objeto editado com sucesso!");
		} else {
			logger.error("Objeto nulo");
		}
	}

	public void deleta(int objId) {
		Session session = sessionFactory.getCurrentSession();
		Anais a = (Anais) session.load(Anais.class, new Integer(objId));
		if (null != a) {
			session.delete(a);
			logger.info("objeto deletado com sucesso!");
		} else {
			logger.info("objeto não encotrado!");
		}
	}

	public Anais getObj(int objId) {
		Session session = sessionFactory.getCurrentSession();
		Anais a = (Anais) session.load(Anais.class, new Integer(objId));
		if (null != a) {
			logger.info("objeto encontrado!");
			return a;
		} else {
			logger.info("objeto não encotrado!");
			return a;
		}
	}

	@SuppressWarnings("unchecked")
	public List<Anais> getAllObj() {
		List<Anais> anaisList = sessionFactory.getCurrentSession().createQuery("from Anais").list();
		logger.info("Anais encontrados");
		return anaisList;
	}

}

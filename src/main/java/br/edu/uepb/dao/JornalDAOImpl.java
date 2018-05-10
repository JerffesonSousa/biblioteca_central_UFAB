package br.edu.uepb.dao;

import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import br.edu.uepb.model.Jornal;

@Repository
public class JornalDAOImpl implements DAO<Jornal> {
	
	private static final Logger logger = LogManager.getLogger(JornalDAOImpl.class);
	
	@Autowired
	private SessionFactory sessionFactory;


	public void adiciona(Jornal obj) {
		if (obj != null) {
			sessionFactory.getCurrentSession().save(obj);
			logger.info("objeto salvo com sucesso!");
		} else {
			logger.error("Objeto nulo");
		}
	}

	public void edita(Jornal obj) {
		if (obj != null) {
			sessionFactory.getCurrentSession().update(obj);
			logger.info("objeto salvo com sucesso!");
		} else {
			logger.error("Objeto nulo");
		}
	}

	public void deleta(int objId) {
		Session session = sessionFactory.getCurrentSession();
		Jornal j = (Jornal) session.load(Jornal.class, new Integer(objId));
		if(null != j){
			session.delete(j);
			logger.info("objeto deletado com sucesso!");
		}else {
			logger.info("objeto não encotrado!");
		}
				
		
	}

	public Jornal getObj(int objId) {
		Session session = sessionFactory.getCurrentSession();
		Jornal j = (Jornal) session.load(Jornal.class, new Integer(objId));
		if(null != j) {
			logger.info("objeto encontrado!");
			return j;
		}else {
			logger.info("objeto não encotrado!");
			return j;
		}
	}

	@SuppressWarnings("unchecked")
	public List<Jornal> getAllObj() {
		List<Jornal> jornalList = sessionFactory.getCurrentSession().createQuery("from Jornal").list();
		logger.info("Jornais encontrados");
		return jornalList;
	}

}

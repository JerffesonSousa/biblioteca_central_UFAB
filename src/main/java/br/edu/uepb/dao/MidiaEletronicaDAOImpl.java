package br.edu.uepb.dao;

import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;



import br.edu.uepb.model.MidiaEletronica;

@Repository
public class MidiaEletronicaDAOImpl implements DAO<MidiaEletronica> {
	private static final Logger logger = LogManager.getLogger(MidiaEletronicaDAOImpl.class);
	
	@Autowired
	private SessionFactory sessionFactory;

	public void adiciona(MidiaEletronica obj) {
		if(obj != null) {
			sessionFactory.getCurrentSession().save(obj);
			logger.info("Objeto salvo com sucesso!");
		}else {
			logger.error("Objeto nulo!");
		}
	}

	public void edita(MidiaEletronica obj) {
		if(obj != null) {
			sessionFactory.getCurrentSession().update(obj);
			logger.info("Objeto editado com sucesso!");
		}else {
			logger.error("Objeto nulo!");
		}
	}

	public void deleta(int objId) {
		Session session = sessionFactory.getCurrentSession();
		MidiaEletronica m = (MidiaEletronica) session.load(MidiaEletronica.class, new Integer(objId));
		if(null != m) {
			session.delete(m);
			logger.info("Objeto deletado com sucesso!");
		}else {
			logger.info("Objeto não encontrado!");
		}
	}

	public MidiaEletronica getObj(int objId) {
		Session session = this.sessionFactory.getCurrentSession();
		MidiaEletronica m = (MidiaEletronica) session.load(MidiaEletronica.class, new Integer(objId));
		if(null != m) {
			logger.info("Objeto encotrado com sucesso!");
			return m;
		}else {
			logger.info("Objeto não encontrado!");
			return m;
		}
		
	}

	@SuppressWarnings("unchecked")
	public List<MidiaEletronica> getAllObj() {
		List<MidiaEletronica> midiaList = sessionFactory.getCurrentSession().createQuery("from MidiaEletronica").list();
		logger.info("Midias encontradas");
		return midiaList;
	}

}

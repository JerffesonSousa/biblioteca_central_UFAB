package br.edu.uepb.dao;

import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import br.edu.uepb.model.Livro;

@Repository 
public class LivroDAOImpl implements DAO<Livro> {
	
	private static final Logger logger = LogManager.getLogger(LivroDAOImpl.class);
	
	@Autowired
	private SessionFactory sessionFactory;

	public void adiciona(Livro obj) {
		if(obj != null) {
			sessionFactory.getCurrentSession().save(obj);
			logger.info("Objeto salvo com sucesso!");
		}else {
			logger.error("Objeto nulo!");
		}
	}

	public void edita(Livro obj) {
		if(obj != null) {
			sessionFactory.getCurrentSession().update(obj);
			logger.info("Objeto salvo com sucesso!");
		}else {
			logger.error("Objeto nulo!");
		}
	}

	public void deleta(int objId) {
		Session session = sessionFactory.getCurrentSession();
		Livro l = (Livro) session.load(Livro.class, new Integer(objId));
		if(null != l) {
			session.delete(l);
			logger.info("objeto deletado com sucesso!");
		}else {
			logger.info("objeto não encotrado!");
		}
	}

	public Livro getObj(int objId) {
		Session session = sessionFactory.getCurrentSession();
		Livro l = (Livro) session.load(Livro.class, new Integer(objId));
		if(null != l) {
			logger.info("objeto encontrado!");
			return l;
		}else {
			logger.info("objeto não encotrado!");
			return l;
		}
	}

	@SuppressWarnings("unchecked")
	public List<Livro> getAllObj() {
		List<Livro> livroList = sessionFactory.getCurrentSession().createQuery("from Livro").list();
		logger.info("Livros encotrados");
		return livroList;
	}

}

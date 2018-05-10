package br.edu.uepb.dao;

import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import br.edu.uepb.model.Curso;

@Repository
public class CursoDAOImpl implements DAO<Curso> {
	private static final Logger logger = LogManager.getLogger(CursoDAOImpl.class);

	@Autowired
	private SessionFactory sessionFactory;

	public void adiciona(Curso obj) {
		if (obj != null) {
			sessionFactory.getCurrentSession().save(obj);
			logger.info("objeto salvo com sucesso!");
		} else {
			logger.error("Objeto nulo");
		}
	}

	public void edita(Curso obj) {
		if (obj != null) {
			sessionFactory.getCurrentSession().update(obj);
			logger.info("objeto editado com sucesso!");
		} else {
			logger.error("Objeto nulo");
		}
	}

	public void deleta(int objId) {
		Session session = sessionFactory.getCurrentSession();
		Curso c = (Curso) session.load(Curso.class, new Integer(objId));
		if (null != c) {
			session.delete(c);
			logger.info("objeto deletado com sucesso!");
		} else {
			logger.info("objeto não encotrado!");
		}
	}

	public Curso getObj(int objId) {
		Session session = sessionFactory.getCurrentSession();
		Curso c = (Curso) session.load(Curso.class, new Integer(objId));
		if (null != c) {
			logger.info("objeto encontrado!");
			return c;
		} else {
			logger.info("objeto não encotrado!");
			return c;
		}
	}

	@SuppressWarnings("unchecked")
	public List<Curso> getAllObj() {
		List<Curso> cursoList = sessionFactory.getCurrentSession().createQuery("from Curso").list();
		logger.info("Curso encontrados");
		return cursoList;
	}

}

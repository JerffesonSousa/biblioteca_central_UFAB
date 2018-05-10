package br.edu.uepb.dao;

import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import br.edu.uepb.model.Aluno;

@Repository
public class AlunoDAOImpl implements DAO<Aluno> {
	
	private static final Logger logger = LogManager.getLogger(AlunoDAOImpl.class);
	
	@Autowired(required = true)
	private SessionFactory sessionFactory;

	public void adiciona(Aluno obj) {
		if(obj != null) {
			sessionFactory.getCurrentSession().save(obj);
			logger.info("Objeto salvo com sucesso!");
		}else {
			logger.error("Objeto nulo!");
		}

	}

	public void edita(Aluno obj) {
		if(obj != null) {
			sessionFactory.getCurrentSession().update(obj);
			logger.info("Objeto salvo com sucesso!");
		}else {
			logger.error("Objeto nulo!");
		}

	}

	public void deleta(int objId) {
		Session session = sessionFactory.getCurrentSession();
		Aluno a = (Aluno) session.load(Aluno.class, new Integer(objId));
		if(null != a) {
			session.delete(a);
			logger.info("Objeto deletado com sucesso!");
		}else {
			logger.info("Objeto não encontrado!");
		}

	}

	public Aluno getObj(int objId) {
		Session session = sessionFactory.getCurrentSession();
		Aluno a = (Aluno) session.load(Aluno.class, new Integer(objId));
		if(null != a) {
			logger.info("Objeto deletado com sucesso!");
			return a;
		}else {
			logger.info("Objeto não encontrado!");
			return a;
		}
	}
	
	@SuppressWarnings("unchecked")
	public List<Aluno> getAllObj() {
		List<Aluno> alunoList = sessionFactory.getCurrentSession().createQuery("from Aluno").list();
		logger.info("Alunos encotrados!");
		return alunoList;
	}

}

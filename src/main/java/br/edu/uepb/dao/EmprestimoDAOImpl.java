package br.edu.uepb.dao;

import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import br.edu.uepb.model.Emprestimo;

@Repository
public class EmprestimoDAOImpl implements DAO<Emprestimo> {
	
	private static final Logger logger = LogManager.getLogger(AlunoDAOImpl.class);
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public void adiciona(Emprestimo obj) {
		if(obj != null) {
			sessionFactory.getCurrentSession().save(obj);
			logger.info("Objeto salvo com sucesso!");
		}else {
			logger.error("Objeto nulo!");
		}

	}

	public void edita(Emprestimo obj) {
		if(obj != null) {
			sessionFactory.getCurrentSession().update(obj);
			logger.info("Objeto salvo com sucesso!");
		}else {
			logger.error("Objeto nulo!");
		}

	}

	public void deleta(int objId) {
		Session session = sessionFactory.getCurrentSession();
		Emprestimo e = (Emprestimo) session.load(Emprestimo.class, new Integer(objId));
		if(null != e) {
			session.delete(e);
			logger.info("Objeto deletado com sucesso!");
		}else {
			logger.info("Objeto não encontrado!");
		}

	}

	public Emprestimo getObj(int objId) {
		Session session = sessionFactory.getCurrentSession();
		Emprestimo e = (Emprestimo) session.load(Emprestimo.class, new Integer(objId));
		if(null != e) {
			logger.info("Objeto deletado com sucesso!");
			return e;
		}else {
			logger.info("Objeto não encontrado!");
			return e;
		}
	}

	public List<Emprestimo> getAllObj() {
		List<Emprestimo> emprestimoList = sessionFactory.getCurrentSession().createQuery("from Emprestimo").list();
		return emprestimoList;
	}

}

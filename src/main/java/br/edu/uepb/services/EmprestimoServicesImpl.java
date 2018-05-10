package br.edu.uepb.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.edu.uepb.dao.EmprestimoDAOImpl;
import br.edu.uepb.model.Emprestimo;
@Service
public class EmprestimoServicesImpl implements Services<Emprestimo>{
	
	@Autowired
	private EmprestimoDAOImpl emprestimoDAO;

	@Transactional
	public void adiciona(Emprestimo obj) {
		emprestimoDAO.adiciona(obj);
		
	}

	public void edita(Emprestimo obj) {
		emprestimoDAO.edita(obj);
		
	}

	public void deleta(int objId) {
		emprestimoDAO.deleta(objId);
	}

	public Emprestimo getObj(int objId) {
		return emprestimoDAO.getObj(objId);
	}

	public List<Emprestimo> getAllObj() {
		return emprestimoDAO.getAllObj();
	}

}

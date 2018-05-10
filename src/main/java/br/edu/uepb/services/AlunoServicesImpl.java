package br.edu.uepb.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.edu.uepb.dao.DAO;
import br.edu.uepb.model.Aluno;

@Service
public class AlunoServicesImpl implements Services<Aluno> {
	
	@Autowired
	private DAO<Aluno> alunoDAO; 
	
	@Transactional
	public void adiciona(Aluno obj) {
		alunoDAO.adiciona(obj);

	}

	@Transactional
	public void edita(Aluno obj) {
		alunoDAO.edita(obj);

	}

	@Transactional
	public void deleta(int objId) {
		alunoDAO.deleta(objId);

	}

	@Transactional
	public Aluno getObj(int objId) {
		return alunoDAO.getObj(objId);
	}

	@Transactional
	public List<Aluno> getAllObj() {
		return alunoDAO.getAllObj();
	}

}

package br.edu.uepb.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.edu.uepb.dao.DAO;
import br.edu.uepb.model.Curso;

@Service
public class CursoServicesImpl implements Services<Curso> {
	
	@Autowired
	private DAO<Curso> cursoDAO;
	
	@Transactional
	public void adiciona(Curso obj) {
		 cursoDAO.adiciona(obj);
	}

	@Transactional
	public void edita(Curso obj) {
		 cursoDAO.edita(obj);
	}

	@Transactional
	public void deleta(int objId) {
		 cursoDAO.deleta(objId);
	}

	@Transactional
	public Curso getObj(int objId) {
		return cursoDAO.getObj(objId);
	}

	@Transactional
	public List<Curso> getAllObj() {
		return cursoDAO.getAllObj();
	}

}

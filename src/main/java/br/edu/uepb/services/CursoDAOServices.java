package br.edu.uepb.services;

import java.util.List;

import br.edu.uepb.dao.CursoDAOImpl;
import br.edu.uepb.model.Curso;

public class CursoDAOServices implements DAOServices<Curso> {
	
	private CursoDAOImpl cursoDAO;
	
	public CursoDAOServices() {
		this.cursoDAO = new CursoDAOImpl();
	}

	public Curso adiciona(Curso obj) {
		return cursoDAO.adiciona(obj);
	}

	public Curso edita(Curso obj) {
		return cursoDAO.edita(obj);
	}

	public boolean deleta(int objId) {
		return cursoDAO.deleta(objId);
	}

	public Curso getObj(int objId) {
		return cursoDAO.getObj(objId);
	}

	public List<Curso> getAllObj() {
		return cursoDAO.getAllObj();
	}

}

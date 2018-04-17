package br.edu.uepb.business;

import java.util.List;

import br.edu.uepb.exceptions.AtributoException;
import br.edu.uepb.exceptions.DAOException;
import br.edu.uepb.exceptions.ObjetoException;
import br.edu.uepb.model.Curso;
import br.edu.uepb.services.CursoDAOServices;

public class CursoBusiness implements Business<Curso>{
	
	private CursoDAOServices cursoServices;
	
	public CursoBusiness() {
		this.cursoServices = new CursoDAOServices();
	}

	public Curso adiciona(Curso obj) {
		if(obj ==null) {
			throw new ObjetoException("Objeto nulo");
		}else if(obj.getNome().equals("")) {
			throw new AtributoException("Nome vazio");
		}else {
			return cursoServices.adiciona(obj);
		}
	}

	public Curso edita(Curso obj) {
		if(obj ==null) {
			throw new ObjetoException("Objeto nulo");
		}else if(obj.getNome().equals("")) {
			throw new AtributoException("Nome vazio");
		}else {
			return cursoServices.edita(obj);
		}
	}

	public boolean deleta(int objId) {
		if(objId <= 0) {
			throw new DAOException("Id inválido");
		}else {
			return cursoServices.deleta(objId);
		}
	}

	public Curso getObj(int objId) {
		if(objId <= 0) {
			throw new DAOException("Id inválido");
		}else {
			return cursoServices.getObj(objId);
		}
	}

	public List<Curso> getAllObj() {
		return cursoServices.getAllObj();
	}

}

package br.edu.uepb.services;

import java.util.List;

import br.edu.uepb.dao.RevistaDAOImpl;
import br.edu.uepb.model.Revista;

public class RevistaDAOServices implements DAOServices<Revista> {
	
	private RevistaDAOImpl revistaDAO;
	
	public RevistaDAOServices() {
		this.revistaDAO = new RevistaDAOImpl();
	}

	public Revista adiciona(Revista obj) {
		return revistaDAO.adiciona(obj);
	}

	public Revista edita(Revista obj) {
		return revistaDAO.edita(obj);
	}

	public boolean deleta(int objId) {
		return revistaDAO.deleta(objId);
	}

	public Revista getObj(int objId) {
		return revistaDAO.getObj(objId);
	}

	public List<Revista> getAllObj() {
		return revistaDAO.getAllObj();
	}

}

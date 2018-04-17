package br.edu.uepb.services;

import java.util.List;

import br.edu.uepb.dao.AnaisDAOImpl;
import br.edu.uepb.model.Anais;

public class AnaisDAOServices implements DAOServices<Anais>{
	private AnaisDAOImpl anaisDAO;
	
	public AnaisDAOServices() {
		this.anaisDAO = new AnaisDAOImpl();
	}

	public Anais adiciona(Anais obj) {
		return anaisDAO.adiciona(obj);
	}

	public Anais edita(Anais obj) {
		return anaisDAO.edita(obj);
	}

	public boolean deleta(int objId) {
		return anaisDAO.deleta(objId);
	}

	public Anais getObj(int objId) {
		return anaisDAO.getObj(objId);
	}

	public List<Anais> getAllObj() {
		return anaisDAO.getAllObj();
	}	
}

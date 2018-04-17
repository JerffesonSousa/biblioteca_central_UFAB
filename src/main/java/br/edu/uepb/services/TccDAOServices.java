package br.edu.uepb.services;

import java.util.List;

import br.edu.uepb.dao.TccDAOImpl;
import br.edu.uepb.model.Tcc;

public class TccDAOServices implements DAOServices<Tcc> {
	
	private TccDAOImpl tccDAO;
	
	public TccDAOServices() {
		this.tccDAO = new TccDAOImpl();
	}

	public Tcc adiciona(Tcc obj) {
		return tccDAO.adiciona(obj);
	}

	public Tcc edita(Tcc obj) {
		return tccDAO.edita(obj);
	}

	public boolean deleta(int objId) {
		return tccDAO.deleta(objId);
	}

	public Tcc getObj(int objId) {
		return tccDAO.getObj(objId);
	}

	public List<Tcc> getAllObj() {
		return tccDAO.getAllObj();
	}

}

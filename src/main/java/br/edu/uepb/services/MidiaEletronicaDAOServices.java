package br.edu.uepb.services;

import java.util.List;

import br.edu.uepb.dao.MidiaEletronicaDAOImpl;
import br.edu.uepb.model.MidiaEletronica;

public class MidiaEletronicaDAOServices implements DAOServices<MidiaEletronica> {
	
	private MidiaEletronicaDAOImpl midiaDAO;
	
	public MidiaEletronicaDAOServices () {
		this.midiaDAO = new MidiaEletronicaDAOImpl();
	}

	public MidiaEletronica adiciona(MidiaEletronica obj) {
		return midiaDAO.adiciona(obj);
	}

	public MidiaEletronica edita(MidiaEletronica obj) {
		return midiaDAO.edita(obj);
	}

	public boolean deleta(int objId) {
		return midiaDAO.deleta(objId);
	}

	public MidiaEletronica getObj(int objId) {
		return midiaDAO.getObj(objId);
	}

	public List<MidiaEletronica> getAllObj() {
		return midiaDAO.getAllObj();
	}

}

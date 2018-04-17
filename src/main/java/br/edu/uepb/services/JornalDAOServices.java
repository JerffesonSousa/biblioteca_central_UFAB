package br.edu.uepb.services;

import java.util.List;

import br.edu.uepb.dao.JornalDAOImpl;
import br.edu.uepb.model.Jornal;

public class JornalDAOServices implements DAOServices<Jornal> {
	
	private JornalDAOImpl jornalDAO;
	
	public JornalDAOServices() {
		this.jornalDAO = new JornalDAOImpl();
	}

	public Jornal adiciona(Jornal obj) {
		return jornalDAO.adiciona(obj);
	}

	public Jornal edita(Jornal obj) {
		return jornalDAO.edita(obj);
	}

	public boolean deleta(int objId) {
		return jornalDAO.deleta(objId);
	}

	public Jornal getObj(int objId) {
		return jornalDAO.getObj(objId);
	}

	public List<Jornal> getAllObj() {
		return jornalDAO.getAllObj();
	}

}

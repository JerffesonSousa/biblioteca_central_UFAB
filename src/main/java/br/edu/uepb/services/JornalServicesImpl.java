package br.edu.uepb.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.edu.uepb.dao.DAO;
import br.edu.uepb.model.Jornal;

@Service
public class JornalServicesImpl implements Services<Jornal> {

	@Autowired
	private DAO<Jornal> jornalDAO;

	@Transactional
	public void adiciona(Jornal obj) {
		jornalDAO.adiciona(obj);
	}

	@Transactional
	public void edita(Jornal obj) {
		jornalDAO.edita(obj);
	}

	@Transactional
	public void deleta(int objId) {
		jornalDAO.deleta(objId);
	}

	@Transactional
	public Jornal getObj(int objId) {
		return jornalDAO.getObj(objId);
	}

	@Transactional
	public List<Jornal> getAllObj() {
		return jornalDAO.getAllObj();
	}

}

package br.edu.uepb.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.edu.uepb.dao.DAO;
import br.edu.uepb.model.Tcc;

@Service
public class TccServicesImpl implements Services<Tcc> {

	@Autowired
	private DAO<Tcc> tccDAO;

	@Transactional
	public void adiciona(Tcc obj) {
		tccDAO.adiciona(obj);
	}

	@Transactional
	public void edita(Tcc obj) {
		tccDAO.edita(obj);
	}

	@Transactional
	public void deleta(int objId) {
		tccDAO.deleta(objId);
	}

	@Transactional
	public Tcc getObj(int objId) {
		return tccDAO.getObj(objId);
	}

	@Transactional
	public List<Tcc> getAllObj() {
		return tccDAO.getAllObj();
	}

}

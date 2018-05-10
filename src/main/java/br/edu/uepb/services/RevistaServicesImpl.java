package br.edu.uepb.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.edu.uepb.dao.DAO;
import br.edu.uepb.model.Revista;

@Service
public class RevistaServicesImpl implements Services<Revista> {
	
	@Autowired
	private DAO<Revista> revistaDAO;
	
	@Transactional
	public void adiciona(Revista obj) {
		 revistaDAO.adiciona(obj);
	}

	@Transactional
	public void edita(Revista obj) {
		 revistaDAO.edita(obj);
	}

	@Transactional
	public void deleta(int objId) {
		 revistaDAO.deleta(objId);
	}

	@Transactional
	public Revista getObj(int objId) {
		return revistaDAO.getObj(objId);
	}

	@Transactional
	public List<Revista> getAllObj() {
		return revistaDAO.getAllObj();
	}

}

package br.edu.uepb.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.edu.uepb.dao.DAO;

import br.edu.uepb.model.MidiaEletronica;

@Service
public class MidiaEletronicaServicesImpl implements Services<MidiaEletronica> {
	
	@Autowired
	private DAO<MidiaEletronica> midiaDAO;

	@Transactional
	public void adiciona(MidiaEletronica obj) {
		 midiaDAO.adiciona(obj);
	}

	@Transactional
	public void edita(MidiaEletronica obj) {
		 midiaDAO.edita(obj);
	}

	@Transactional
	public void deleta(int objId) {
		 midiaDAO.deleta(objId);
	}

	@Transactional
	public MidiaEletronica getObj(int objId) {
		return midiaDAO.getObj(objId);
	}

	@Transactional
	public List<MidiaEletronica> getAllObj() {
		return midiaDAO.getAllObj();
	}

}

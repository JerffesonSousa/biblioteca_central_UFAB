package br.edu.uepb.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.edu.uepb.dao.AnaisDAOImpl;
import br.edu.uepb.model.Anais;


@Service
@Component
public class AnaisServicesImpl implements Services<Anais>{
	
	@Autowired
	private AnaisDAOImpl anaisDAO;
	
	@Transactional
	public void adiciona(Anais obj) {
		anaisDAO.adiciona(obj);
		
	}
	
	@Transactional
	public void edita(Anais obj) {
		anaisDAO.edita(obj);
		
	}
	
	@Transactional
	public void deleta(int objId) {
		anaisDAO.deleta(objId);
		
	}

	@Transactional
	public Anais getObj(int objId) {
		return anaisDAO.getObj(objId);
	}

	@Transactional
	public List<Anais> getAllObj() {
		return anaisDAO.getAllObj();
	}

		
}

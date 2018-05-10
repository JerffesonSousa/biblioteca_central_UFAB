package br.edu.uepb.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.edu.uepb.dao.DAO;
import br.edu.uepb.model.Livro;

@Service
public class LivroServicesImpl implements Services<Livro> {
	
	@Autowired
	private DAO<Livro> livroDAO;

	@Transactional
	public void adiciona(Livro obj) {
		 livroDAO.adiciona(obj);
	}

	@Transactional
	public void edita(Livro obj) {
		 livroDAO.edita(obj);
	}

	@Transactional
	public void deleta(int objId) {
		 livroDAO.deleta(objId);
	}

	@Transactional
	public Livro getObj(int objId) {
		return livroDAO.getObj(objId);
	}

	@Transactional
	public List<Livro> getAllObj() {
		return livroDAO.getAllObj();
	}

}

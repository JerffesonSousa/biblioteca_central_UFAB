package br.edu.uepb.services;

import java.util.List;

import br.edu.uepb.dao.LivroDAOImpl;
import br.edu.uepb.model.Livro;

public class LivroDAOServices implements DAOServices<Livro> {
	
	private LivroDAOImpl livroDAO;
	
	public LivroDAOServices() {
		this.livroDAO = new LivroDAOImpl();
	}

	public Livro adiciona(Livro obj) {
		return livroDAO.adiciona(obj);
	}

	public Livro edita(Livro obj) {
		return livroDAO.edita(obj);
	}

	public boolean deleta(int objId) {
		return livroDAO.deleta(objId);
	}

	public Livro getObj(int objId) {
		return livroDAO.getObj(objId);
	}

	public List<Livro> getAllObj() {
		return livroDAO.getAllObj();
	}

}

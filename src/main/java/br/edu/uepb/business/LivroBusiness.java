package br.edu.uepb.business;

import java.util.List;

import br.edu.uepb.exceptions.AtributoException;
import br.edu.uepb.exceptions.DAOException;
import br.edu.uepb.model.Livro;
import br.edu.uepb.services.DAOServices;
import br.edu.uepb.services.LivroDAOServices;

public class LivroBusiness implements DAOServices<Livro> {
	
	private LivroDAOServices livroServices;
	
	public LivroBusiness() {
		this.livroServices = new LivroDAOServices();
	}

	public Livro adiciona(Livro obj) {
		if(obj.getIsbn() < 0) {
			throw new AtributoException("ISBN inv�lido");
		}else if(obj.getTitulo().equals("")) {
			throw new AtributoException("T�tulo inv�lido");
		}else {
			return livroServices.adiciona(obj);
		}
	}

	public Livro edita(Livro obj) {
		if(obj.getIsbn() < 0) {
			throw new AtributoException("ISBN inv�lido");
		}else if(obj.getTitulo().equals("")) {
			throw new AtributoException("T�tulo inv�lido");
		}else {
			return livroServices.edita(obj);
		}
	}

	public boolean deleta(int objId) {
		if(objId <= 0) {
			throw new DAOException("Id inv�lido");
		}else {
			return livroServices.deleta(objId);
		}
	}

	public Livro getObj(int objId) {
		if(objId <= 0) {
			throw new DAOException("Id inv�lido");
		}else {
			return livroServices.getObj(objId);
		}
	}

	public List<Livro> getAllObj() {
		return livroServices.getAllObj();
	}

}

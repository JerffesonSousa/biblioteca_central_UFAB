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
			throw new AtributoException("ISBN inválido");
		}else if(obj.getTitulo().equals("")) {
			throw new AtributoException("Título inválido");
		}else {
			return livroServices.adiciona(obj);
		}
	}

	public Livro edita(Livro obj) {
		if(obj.getIsbn() < 0) {
			throw new AtributoException("ISBN inválido");
		}else if(obj.getTitulo().equals("")) {
			throw new AtributoException("Título inválido");
		}else {
			return livroServices.edita(obj);
		}
	}

	public boolean deleta(int objId) {
		if(objId <= 0) {
			throw new DAOException("Id inválido");
		}else {
			return livroServices.deleta(objId);
		}
	}

	public Livro getObj(int objId) {
		if(objId <= 0) {
			throw new DAOException("Id inválido");
		}else {
			return livroServices.getObj(objId);
		}
	}

	public List<Livro> getAllObj() {
		return livroServices.getAllObj();
	}

}

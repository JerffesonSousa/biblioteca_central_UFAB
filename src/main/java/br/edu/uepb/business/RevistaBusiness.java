package br.edu.uepb.business;

import java.util.List;

import br.edu.uepb.exceptions.AtributoException;
import br.edu.uepb.exceptions.DAOException;
import br.edu.uepb.model.Revista;
import br.edu.uepb.services.RevistaDAOServices;

public class RevistaBusiness implements Business<Revista> {
	
	private RevistaDAOServices revistaServices;
	
	public RevistaBusiness() {
		this.revistaServices = new RevistaDAOServices();
	}

	public Revista adiciona(Revista obj) {
		if (obj.getTitulo().equals("")) {
			throw new AtributoException("Título vazio");
		} else {
			return revistaServices.adiciona(obj);
		}
	}

	public Revista edita(Revista obj) {
		if (obj.getTitulo().equals("")) {
			throw new AtributoException("Título vazio");
		} else {
			return revistaServices.edita(obj);
		}
	}

	public boolean deleta(int objId) {
		if(objId <= 0) {
			throw new DAOException("Id inválido");
		}else {
			return revistaServices.deleta(objId);
		}
	}

	public Revista getObj(int objId) {
		if(objId <= 0) {
			throw new DAOException("Id inválido");
		}else {
			return revistaServices.getObj(objId);
		}
	}

	public List<Revista> getAllObj() {
		return revistaServices.getAllObj();
	}

}

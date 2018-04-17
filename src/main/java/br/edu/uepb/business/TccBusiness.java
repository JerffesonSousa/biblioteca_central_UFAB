package br.edu.uepb.business;

import java.util.List;

import br.edu.uepb.exceptions.AtributoException;
import br.edu.uepb.exceptions.DAOException;
import br.edu.uepb.model.Tcc;
import br.edu.uepb.services.TccDAOServices;

public class TccBusiness implements Business<Tcc> {
	
	private TccDAOServices tccServices;
	
	public TccBusiness() {
		this.tccServices = new TccDAOServices();
	}

	public Tcc adiciona(Tcc obj) {
		if (obj.getTitulo().equals("")) {
			throw new AtributoException("Título vazio");
		} else {
			return tccServices.adiciona(obj);
		}
	}

	public Tcc edita(Tcc obj) {
		if (obj.getTitulo().equals("")) {
			throw new AtributoException("Título vazio");
		} else {
			return tccServices.edita(obj);
		}
	}

	public boolean deleta(int objId) {
		if(objId <= 0) {
			throw new DAOException("Id inválido");
		}else {
			return tccServices.deleta(objId);
		}
	}

	public Tcc getObj(int objId) {
		if(objId <= 0) {
			throw new DAOException("Id inválido");
		}else {
			return tccServices.getObj(objId);
		}
	}

	public List<Tcc> getAllObj() {
		return tccServices.getAllObj();
	}

}

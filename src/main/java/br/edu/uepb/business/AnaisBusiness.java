package br.edu.uepb.business;

import java.util.List;

import br.edu.uepb.exceptions.AtributoException;
import br.edu.uepb.exceptions.DAOException;
import br.edu.uepb.exceptions.ObjetoException;
import br.edu.uepb.model.Anais;
import br.edu.uepb.services.AnaisDAOServices;

public class AnaisBusiness implements Business<Anais>{
	
	private AnaisDAOServices anaiServices;
	
	public AnaisBusiness() {
		this.anaiServices = new AnaisDAOServices();
	}

	public Anais adiciona(Anais obj) {
		if(obj ==null) {
			throw new ObjetoException("Objeto nulo");
		}else if(obj.getTitulo().equals("")) {
			throw new AtributoException("Titulo vazio");
		}else {
			return anaiServices.adiciona(obj);
		}
		
	}

	public Anais edita(Anais obj) {
		if(obj ==null) {
			throw new ObjetoException("Objeto nulo");
		}else if(obj.getTitulo().equals("")) {
			throw new AtributoException("Titulo vazio");
		}else {
			return anaiServices.edita(obj);
		}
	}

	public boolean deleta(int objId) {
		if(objId <= 0) {
			throw new DAOException("Id inválido");
		}else {
			return anaiServices.deleta(objId);
		}
	}

	public Anais getObj(int objId) {
		if(objId <= 0) {
			throw new DAOException("Id inválido");
		}else {
			return anaiServices.getObj(objId);
		}
	}

	public List<Anais> getAllObj() {
		return anaiServices.getAllObj();
	}

}

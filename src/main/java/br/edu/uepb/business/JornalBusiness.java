package br.edu.uepb.business;

import java.util.List;

import br.edu.uepb.exceptions.AtributoException;
import br.edu.uepb.model.Jornal;
import br.edu.uepb.services.JornalDAOServices;

public class JornalBusiness implements Business<Jornal> {
	
	private JornalDAOServices jornalServices;
	
	public JornalBusiness() {
		this.jornalServices = new JornalDAOServices();
	}
	
	public Jornal adiciona(Jornal obj) {
		if(obj.getTitulo().equals("")) {
			throw new AtributoException("Título vazio");
		}else {
			return jornalServices.adiciona(obj);
		}
	}

	public Jornal edita(Jornal obj) {
		if(obj.getTitulo().equals("")) {
			throw new AtributoException("Título vazio");
		}else {
			return jornalServices.edita(obj);
		}
	}

	public boolean deleta(int objId) {
		if(objId <= 0) {
			throw new AtributoException("Id inválido");
		}else {
			return jornalServices.deleta(objId);
		}
	}

	public Jornal getObj(int objId) {
		if(objId <= 0) {
			throw new AtributoException("Id inválido");
		}else {
			return jornalServices.getObj(objId);
		}
	}

	public List<Jornal> getAllObj() {
		return jornalServices.getAllObj();
	}

}

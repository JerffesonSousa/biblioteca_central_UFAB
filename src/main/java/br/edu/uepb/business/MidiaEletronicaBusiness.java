package br.edu.uepb.business;

import java.util.List;

import br.edu.uepb.exceptions.AtributoException;
import br.edu.uepb.exceptions.DAOException;
import br.edu.uepb.model.MidiaEletronica;
import br.edu.uepb.services.MidiaEletronicaDAOServices;

public class MidiaEletronicaBusiness implements Business<MidiaEletronica> {

	private MidiaEletronicaDAOServices midiaServices;

	public MidiaEletronicaBusiness() {
		this.midiaServices = new MidiaEletronicaDAOServices();
	}

	public MidiaEletronica adiciona(MidiaEletronica obj) {
		if (obj.getTitulo().equals("")) {
			throw new AtributoException("Título vazio");
		} else {
			return midiaServices.adiciona(obj);
		}
	}

	public MidiaEletronica edita(MidiaEletronica obj) {
		if (obj.getTitulo().equals("")) {
			throw new AtributoException("Título vazio");
		} else {
			return midiaServices.edita(obj);
		}
	}

	public boolean deleta(int objId) {
		if(objId <= 0) {
			throw new DAOException("Id inválido");
		}else {
			return midiaServices.deleta(objId);
		}
	}

	public MidiaEletronica getObj(int objId) {
		if(objId <= 0) {
			throw new DAOException("Id inválido");
		}else {
			return midiaServices.getObj(objId);
		}
	}

	public List<MidiaEletronica> getAllObj() {
		return midiaServices.getAllObj();
	}

}

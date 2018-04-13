package br.edu.uepb.model;

import java.util.Date;

/**
 * @author Jerffeson Sousa
 *
 */

public class Jornal {
	private int jornalID;
	private String titulo;
	private Date data;
	private String edicao;
	
	public Jornal() {}

	public Jornal(String titulo, Date data, String edicao) {
		super();
		this.titulo = titulo;
		this.data = data;
		this.edicao = edicao;
	}
	
	public Jornal(int jornalID, String titulo, Date data, String edicao) {
		super();
		this.jornalID = jornalID;
		this.titulo = titulo;
		this.data = data;
		this.edicao = edicao;
	}

	public int getJornalID() {
		return jornalID;
	}

	public void setJornalID(int jornalID) {
		this.jornalID = jornalID;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public String getEdicao() {
		return edicao;
	}

	public void setEdicao(String edicao) {
		this.edicao = edicao;
	}

}

package br.edu.uepb.model;

import java.util.Date;

public class Jornais {
	private String titulo;
	private Date data;
	private String edicao;
	
	public Jornais(String titulo, Date data, String edicao) {
		super();
		this.titulo = titulo;
		this.data = data;
		this.edicao = edicao;
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

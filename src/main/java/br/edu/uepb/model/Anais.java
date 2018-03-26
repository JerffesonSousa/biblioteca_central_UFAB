package br.edu.uepb.model;

import java.util.Date;

public class Anais {
	private String tipo;
	private String titulo;
	private String autores;
	private String nomeCongresso;
	private Date anoDePublicacao;
	private String local;
	
	public Anais(String tipo, String titulo, String autores, String nomeCongresso, Date anoDePublicacao, String local) {
		super();
		this.tipo = tipo;
		this.titulo = titulo;
		this.autores = autores;
		this.nomeCongresso = nomeCongresso;
		this.anoDePublicacao = anoDePublicacao;
		this.local = local;
	}
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutores() {
		return autores;
	}
	public void setAutores(String autores) {
		this.autores = autores;
	}
	public String getNomeCongresso() {
		return nomeCongresso;
	}
	public void setNomeCongresso(String nomeCongresso) {
		this.nomeCongresso = nomeCongresso;
	}
	public Date getAnoDePublicao() {
		return anoDePublicacao;
	}
	public void setAnoDePublicao(Date anoDePublicao) {
		this.anoDePublicacao = anoDePublicao;
	}
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}
	
	
}

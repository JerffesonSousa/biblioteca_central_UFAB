package br.edu.uepb.model;

import java.util.Date;

public class Revistas {
	private String titulo;
	private String editora;
	private Date anoDePublicacao;
	private int edicao;
	private int nPaginas;
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
	public Date getAnoDePublicacao() {
		return anoDePublicacao;
	}
	public void setAnoDePublicacao(Date anoDePublicacao) {
		this.anoDePublicacao = anoDePublicacao;
	}
	public int getEdicao() {
		return edicao;
	}
	public void setEdicao(int edicao) {
		this.edicao = edicao;
	}
	public int getnPaginas() {
		return nPaginas;
	}
	public void setnPaginas(int nPaginas) {
		this.nPaginas = nPaginas;
	}
	
	
	
}

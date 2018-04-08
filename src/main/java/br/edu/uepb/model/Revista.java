package br.edu.uepb.model;

import java.util.Date;

/**
 * @author Jerffeson Sousa
 *
 */

public class Revista {
	private int revistaID;
	private String titulo;
	private String editora;
	private Date anoDePublicacao;
	private String edicao;
	private int nPaginas;
	
	public Revista() {}
	

	public Revista(String titulo, String editora, Date anoDePublicacao, String edicao, int nPaginas) {
		super();
		this.titulo = titulo;
		this.editora = editora;
		this.anoDePublicacao = anoDePublicacao;
		this.edicao = edicao;
		this.nPaginas = nPaginas;
	}
	
	public Revista(int revistaID, String titulo, String editora, Date anoDePublicacao, String edicao, int nPaginas) {
		super();
		this.revistaID = revistaID;
		this.titulo = titulo;
		this.editora = editora;
		this.anoDePublicacao = anoDePublicacao;
		this.edicao = edicao;
		this.nPaginas = nPaginas;
	}

	public int getRevistID() {
		return revistaID;
	}

	public void setRevistID(int revistID) {
		this.revistaID = revistID;
	}

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

	public String getEdicao() {
		return edicao;
	}

	public void setEdicao(String edicao) {
		this.edicao = edicao;
	}

	public int getnPaginas() {
		return nPaginas;
	}

	public void setnPaginas(int nPaginas) {
		this.nPaginas = nPaginas;
	}

}

package br.edu.uepb.model;

import java.util.Date;

/**
 * @author Jerffeson Sousa
 *
 */

public class Livro {
	private int livroID;
	private int ISBN;
	private String titulo;
	private String autores;
	private String editora;
	private Date anoDePublicacao;
	private String edicao;
	private int nPaginas;
	private String areaConhecimento;
	private String subArea;
	
	public Livro() {}

	public Livro(int iSBN, String titulo, String autores, String editora, Date anoDePublicacao, String edicao,
			int nPaginas, String areaConhecimento, String subarea) {
		super();
		this.ISBN = iSBN;
		this.titulo = titulo;
		this.autores = autores;
		this.editora = editora;
		this.anoDePublicacao = anoDePublicacao;
		this.edicao = edicao;
		this.nPaginas = nPaginas;
		this.areaConhecimento = areaConhecimento;
		this.subArea = subarea;
	}
	
	public Livro(int livroID, int iSBN, String titulo, String autores, String editora, Date anoDePublicacao, String edicao,
			int nPaginas, String areaConhecimento, String subarea) {
		super();
		this.livroID = livroID;
		this.ISBN = iSBN;
		this.titulo = titulo;
		this.autores = autores;
		this.editora = editora;
		this.anoDePublicacao = anoDePublicacao;
		this.edicao = edicao;
		this.nPaginas = nPaginas;
		this.areaConhecimento = areaConhecimento;
		this.subArea = subarea;
	}


	public int getLivroID() {
		return livroID;
	}

	public void setLivroID(int livroID) {
		this.livroID = livroID;
	}

	public Date getAnoDePublicacao() {
		return anoDePublicacao;
	}

	public void setAnoDePublicacao(Date anoDePublicacao) {
		this.anoDePublicacao = anoDePublicacao;
	}

	public String getSubArea() {
		return subArea;
	}

	public void setSubArea(String subArea) {
		this.subArea = subArea;
	}

	public int getISBN() {
		return ISBN;
	}

	public void setISBN(int iSBN) {
		ISBN = iSBN;
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

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public Date getAnoDePpublicacao() {
		return anoDePublicacao;
	}

	public void setAnoDePpublicacao(Date anoDePpublicacao) {
		this.anoDePublicacao = anoDePpublicacao;
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

	public String getAreaConhecimento() {
		return areaConhecimento;
	}

	public void setAreaConhecimento(String areaConhecimento) {
		this.areaConhecimento = areaConhecimento;
	}

	public String getSubarea() {
		return subArea;
	}

	public void setSubarea(String subarea) {
		this.subArea = subarea;
	}

}

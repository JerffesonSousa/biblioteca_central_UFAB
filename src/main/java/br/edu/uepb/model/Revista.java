package br.edu.uepb.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="revistas")
public class Revista {
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int revistaID;
	private String titulo;
	private String editora;
	private Date dataPublicacao;
	private String edicao;
	private int paginas;
	
	public Revista() {}
	
	public Revista(int revistaID, String titulo, String editora, Date dataPublicacao, String edicao, int paginas) {
		super();
		this.revistaID = revistaID;
		this.titulo = titulo;
		this.editora = editora;
		this.dataPublicacao = dataPublicacao;
		this.edicao = edicao;
		this.paginas = paginas;
	}
	public Revista(String titulo, String editora, Date dataPublicacao, String edicao, int paginas) {
		super();
		this.titulo = titulo;
		this.editora = editora;
		this.dataPublicacao = dataPublicacao;
		this.edicao = edicao;
		this.paginas = paginas;
	}

	public int getRevistaID() {
		return revistaID;
	}

	public void setRevistaID(int revistaID) {
		this.revistaID = revistaID;
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

	public Date getDataPublicacao() {
		return dataPublicacao;
	}

	public void setDataPublicacao(Date dataPublicacao) {
		this.dataPublicacao = dataPublicacao;
	}

	public String getEdicao() {
		return edicao;
	}

	public void setEdicao(String edicao) {
		this.edicao = edicao;
	}

	public int getPaginas() {
		return paginas;
	}

	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}
	
	

}

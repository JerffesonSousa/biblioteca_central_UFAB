package br.edu.uepb.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Classe para objetos do tipo Revista
 * @author Jerffeson Sousa
 *
 */
@Entity
@Table(name="revistas")
public class Revista {
	@Id
	@Column
	@GeneratedValue
	private int revistaID;
	
	@Column(name="TITULO")
	private String titulo;
	
	@Column(name="EDITORA")
	private String editora;
	
	@Column(name="DATAPUBLICACAO")
	private Date dataPublicacao;
	
	@Column(name="EDICAO")
	private String edicao;
	
	@Column(name="PAGINAS")
	private int paginas;
	
	public Revista() {}
	
	/**
	 * Contrutor Revista
	 * @param revistaID um int para indicar id no banco
	 * @param titulo uma String para indicar o título
	 * @param editora uma String para indicar a editora
	 * @param dataPublicacao um objeto tipo Date para indicar a data de publicação
	 * @param edicao uma String para indicar a edição
	 * @param paginas um int para indicar o número das paginas
	 */
	public Revista(int revistaID, String titulo, String editora, Date dataPublicacao, String edicao, int paginas) {
		super();
		this.revistaID = revistaID;
		this.titulo = titulo;
		this.editora = editora;
		this.dataPublicacao = dataPublicacao;
		this.edicao = edicao;
		this.paginas = paginas;
	}
	
	/**
	 * Contrutor Revista
	 * @param titulo uma String para indicar o título
	 * @param editora uma String para indicar a editora
	 * @param dataPublicacao um objeto tipo Date para indicar a data de publicação
	 * @param edicao uma String para indicar a edição
	 * @param paginas um int para indicar o número das paginas
	 */
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

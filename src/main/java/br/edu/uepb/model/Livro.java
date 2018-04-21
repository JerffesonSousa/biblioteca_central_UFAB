package br.edu.uepb.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Classe para objetos do tipo Livro
 * @author Jerffeson Sousa
 *
 */
@Entity
@Table(name = "livros")
public class Livro {
	@Id
	@Column
	@GeneratedValue
	private int livroId;
	
	@Column(name="ISBN")
	private int isbn;
	
	@Column(name="TITULO")
	private String titulo;
	
	@Column(name="AUTORES")
	private String autores;
	
	@Column(name="EDITORA")
	private String editora;
	
	@Column(name="DATAPUBLICACAO")
	private Date dataPublicacao;
	
	@Column(name="EDICAO")
	private String edicao;
	
	@Column(name="PAGINAS")
	private int paginas;
	
	@Column(name="AREA")
	private String area;
	
	@Column(name="SUBAREA")
	private String subArea;
	
	public Livro() {}
	
	/**
	 * Construtor Livro
	 * @param livroId um int para indicar id no banco
	 * @param isbn	um int para indicar o isbn
	 * @param titulo uma String para indicar o título
	 * @param autores uma String para indicar um ou mais autores
	 * @param editora uma String para indicar a editora
	 * @param dataPublicacao um objeto tipo Date para indicar a data de publicação
	 * @param edicao uma String para indicar a edição
	 * @param paginas um int para indicar o número das paginas
	 * @param area uma String para indicar a área
	 * @param subArea uma String para indicar a sub-area
	 */
	public Livro(int livroId, int isbn, String titulo, String autores, String editora, Date dataPublicacao,
			String edicao, int paginas, String area, String subArea) {
		super();
		this.livroId = livroId;
		this.isbn = isbn;
		this.titulo = titulo;
		this.autores = autores;
		this.editora = editora;
		this.dataPublicacao = dataPublicacao;
		this.edicao = edicao;
		this.paginas = paginas;
		this.area = area;
		this.subArea = subArea;
	}
	
	/**
	 * Construtor Livro
	 * @param isbn	um int para indicar o isbn
	 * @param titulo uma String para indicar o título
	 * @param autores uma String para indicar um ou mais autores
	 * @param editora uma String para indicar a editora
	 * @param dataPublicacao um objeto tipo Date para indicar a data de publicação
	 * @param edicao uma String para indicar a edição
	 * @param paginas um int para indicar o número das paginas
	 * @param area uma String para indicar a área
	 * @param subArea uma String para indicar a sub-area
	 */
	public Livro(int isbn, String titulo, String autores, String editora, Date dataPublicacao, String edicao,
			int paginas, String area, String subArea) {
		super();
		this.isbn = isbn;
		this.titulo = titulo;
		this.autores = autores;
		this.editora = editora;
		this.dataPublicacao = dataPublicacao;
		this.edicao = edicao;
		this.paginas = paginas;
		this.area = area;
		this.subArea = subArea;
	}
	
	public int getLivroId() {
		return livroId;
	}

	public void setLivroId(int livroId) {
		this.livroId = livroId;
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
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

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getSubArea() {
		return subArea;
	}

	public void setSubArea(String subArea) {
		this.subArea = subArea;
	}
	
	

}

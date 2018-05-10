package br.edu.uepb.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

/**
 * Classe para objetos do tipo Revista
 * @author Jerffeson Sousa
 *
 */
@Entity
@Table(name="revistas")
@PrimaryKeyJoinColumn(name="ITEMID")
public class Revista extends ItemAcervo{
	
	
	@Column(name="EDITORA")
	private String editora;
	
	
	
	@Column(name="PAGINAS")
	private int paginas;
	
//	public Revista() {}
//	
//	/**
//	 * Contrutor Revista
//	 * @param revistaID um int para indicar id no banco
//	 * @param titulo uma String para indicar o título
//	 * @param editora uma String para indicar a editora
//	 * @param dataPublicacao um objeto tipo Date para indicar a data de publicação
//	 * @param edicao uma String para indicar a edição
//	 * @param paginas um int para indicar o número das paginas
//	 */
//	public Revista(int revistaID, String titulo, String editora, Date dataPublicacao, String edicao, int paginas) {
//		super();
//		this.revistaID = revistaID;
//		this.titulo = titulo;
//		this.editora = editora;
//		this.dataPublicacao = dataPublicacao;
//		this.edicao = edicao;
//		this.paginas = paginas;
//	}
//	
//	/**
//	 * Contrutor Revista
//	 * @param titulo uma String para indicar o título
//	 * @param editora uma String para indicar a editora
//	 * @param dataPublicacao um objeto tipo Date para indicar a data de publicação
//	 * @param edicao uma String para indicar a edição
//	 * @param paginas um int para indicar o número das paginas
//	 */
//	public Revista(String titulo, String editora, Date dataPublicacao, String edicao, int paginas) {
//		super();
//		this.titulo = titulo;
//		this.editora = editora;
//		this.dataPublicacao = dataPublicacao;
//		this.edicao = edicao;
//		this.paginas = paginas;
//	}



	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	

	public int getPaginas() {
		return paginas;
	}

	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}
	
	

}

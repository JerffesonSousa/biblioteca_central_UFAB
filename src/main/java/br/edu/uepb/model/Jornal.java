package br.edu.uepb.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**Classe para objetos do tipo Jornal
 * @author Jerffeson Sousa
 * */
@Entity
@Table(name="jornais")
public class Jornal {
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int jornalID;
	private String titulo;
	private Date dataPublicacao;
	private String edicao;
	
	public Jornal() {}

	/**Contrutor Jornal
	 * @param titulo uma string para idicar o título
	 * @param dataPublicacao um objeto do tipo Date para idicar a data da publicação
	 * @param edicao uma string para idicar a edição
	 * */
	public Jornal(String titulo, Date dataPublicacao, String edicao) {
		super();
		this.titulo = titulo;
		this.dataPublicacao = dataPublicacao;
		this.edicao = edicao;
	}
	
	/**Contrutor Jornal
	 * @param jornalID um int para indicar id do banco
	 * @param titulo uma string para idicar o título
	 * @param dataPublicacao um objeto do tipo Date para idicar a data da publicação
	 * @param edicao uma string para idicar a edição
	 * */
	public Jornal(int jornalID, String titulo, Date dataPublicacao, String edicao) {
		super();
		this.jornalID = jornalID;
		this.titulo = titulo;
		this.dataPublicacao = dataPublicacao;
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
	
	
	

}

package br.edu.uepb.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import br.edu.uepb.enums.AnaisEnum;

/**Classe para objetos do tipo Anais
 * @author Jerffeson Sousa
 *
 */
@Entity
@Table(name="anais")
public class Anais {
	@Id
	@Column(name="anaisID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int anaisID;
	private AnaisEnum tipo;
	private String titulo;
	private String autores;
	private String congresso;
	private Date anoDePublicacao;
	private String local;
	
	public Anais () {}
	
	/**Contrutor Anais
	 * @param tipo uma string para idicar o tipo (artigo, pôster ou resumo)
	 * @param titulo uma string para indicar o título
	 * @param autores uma string para indicar um ou mais autores
	 * @param nomeCongresso uma string para indicar o nome do congresso
	 * @param anaDePublicacao um objeto tipo Date que indica o ano da publicação dos Anais
	 * @param local uma string para identificar o local que foi realizado
	 * */
	public Anais(AnaisEnum tipo, String titulo, String autores, String nomeCongresso, Date anoDePublicacao, String local) {
		super();
		this.tipo = tipo;
		this.titulo = titulo;
		this.autores = autores;
		this.congresso = nomeCongresso;
		this.anoDePublicacao = anoDePublicacao;
		this.local = local;
	}
	
	/**Contrutor Anais
	 * @param anaisID um int para indicar seu Id no banco
	 * @param tipo uma string (deve ser um artigo, pôster ou resumo)
	 * @param titulo uma string para indicar o título
	 * @param autores uma string para indicar um ou mais autores
	 * @param nomeCongresso uma string para indicar o nome do congresso
	 * @param anaDePublicacao um objeto tipo Date que indica o ano da publicação dos Anais
	 * @param local uma string para identificar o local que foi realizado
	 * */
	public Anais(int anaisID, AnaisEnum tipo, String titulo, String autores, String nomeCongresso, Date anoDePublicacao, String local) {
		super();
		this.anaisID = anaisID;
		this.tipo = tipo;
		this.titulo = titulo;
		this.autores = autores;
		this.congresso = nomeCongresso;
		this.anoDePublicacao = anoDePublicacao;
		this.local = local;
	}
	
	public int getAnaisID() {
		return anaisID;
	}

	public void setAnaisID(int anaisID) {
		this.anaisID = anaisID;
	}

	public Date getAnoDePublicacao() {
		return anoDePublicacao;
	}

	public void setAnoDePublicacao(Date anoDePublicacao) {
		this.anoDePublicacao = anoDePublicacao;
	}

	public AnaisEnum getTipo() {
		return tipo;
	}

	public void setTipo(AnaisEnum tipo) {
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
		return congresso;
	}

	public void setNomeCongresso(String nomeCongresso) {
		this.congresso = nomeCongresso;
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
